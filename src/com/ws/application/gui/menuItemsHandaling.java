package com.ws.application.gui;

import java.io.File;

import com.ws.application.beans.fileProcessBean;
import com.ws.application.beans.packageNamebean;
import com.ws.application.common.wsConstants;
import com.ws.application.common.xjcConversionClasses;

import javafx.concurrent.Task;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public abstract class menuItemsHandaling {
	public static File file = null;

	public static Alert CONFIRMATION = null;
	final static int MAX = 10;
	final static Label labelProcessIndicator = new Label();
	static TextField xsdFilePathField = new TextField();
	static TextField projectNameField = new TextField();
	static xjcConversionClasses xjcConvertor = new xjcConversionClasses();
	static StringBuffer result = null;
	nodeCreationDyanamic node = null;

	public static void NewProject(Stage primaryStage, BorderPane borderpane, Scene scene, SplitPane splitPane2, MenuItem ImportNewXSDFile) {

		GridPane BPane = new GridPane();
		BPane.setAlignment(Pos.CENTER);
		BPane.setHgap(10);
		BPane.setVgap(12);
		Scene secondScene = new Scene(BPane, 350, 180);

		Stage secondStage = new Stage();
		secondStage.setTitle(wsConstants.title.NEW_PROJECT);
		Label Text_1 = new Label(wsConstants.extentionsAndOthers.LABEL_ENTER_LOCATION_PATH);
		Label Text_2 = new Label(wsConstants.extentionsAndOthers.NAME_OF_PROJECT);
		xsdFilePathField.setMaxWidth(300);
		projectNameField.setMaxWidth(200);
		Button buttonLoad = new Button(wsConstants.appButtons.BUTTON_LOAD_XSD);
		Button buttonSubmit = new Button(wsConstants.appButtons.BUTTON_XSD_SUBMIT);

		buttonLoad.setOnAction(e -> {
			FileChooser fileChooser = new FileChooser();
			FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter(wsConstants.extentionsAndOthers.FILE_TYPES, wsConstants.extentionsAndOthers.FILES);
			fileChooser.getExtensionFilters().add(extFilter);
			file = fileChooser.showOpenDialog(secondStage);
			if (file.toString() != null) {
				xsdFilePathField.setText(file.toString());
				fileProcessBean.setFilelocation(file.toString());
				packageNamebean.setXsdFileName(file.getName());
			} else {
				System.out.println("the file hasnot been selected:- " + file.toString());
			}
		});

		ProgressBar pbar = new ProgressBar();
		pbar.setProgress(0);
		buttonSubmit.setOnAction(e -> {
			labelProcessIndicator.setVisible(true);
			fileProcessBean.setFilelocation(xsdFilePathField.getText());
			File fileOnField = new File(xsdFilePathField.getText());
			packageNamebean.setXsdFileName(fileOnField.getName());
			final Task task2 = startingTask_02(secondStage);
			pbar.progressProperty().unbind();
			pbar.progressProperty().bind(task2.progressProperty());
			new Thread(task2).start();
			if (projectNameField.getText().isEmpty()) {
				Alert errorAlert = new Alert(AlertType.ERROR);
				errorAlert.setContentText(wsConstants.fileProcessMessages.PROJECT_NAME_EMPTY);
				DialogPane dialogPane = errorAlert.getDialogPane();
				dialogPane.getStylesheets().add("style.css");
				errorAlert.showAndWait();
				labelProcessIndicator.setText(wsConstants.fileProcessMessages.ERROR);
				fileProcessBean.setFileProcessNotification(labelProcessIndicator);
				return;
			} else if (projectNameField.getText().length() < 8) {
				Alert errorAlert = new Alert(AlertType.ERROR);
				errorAlert.setContentText(wsConstants.fileProcessMessages.PROJECT_CHACH_LENGTH);
				DialogPane dialogPane = errorAlert.getDialogPane();
				dialogPane.getStylesheets().add("style.css");
				errorAlert.showAndWait();
				labelProcessIndicator.setText(wsConstants.fileProcessMessages.ERROR);
				fileProcessBean.setFileProcessNotification(labelProcessIndicator);
				return;

			}

			else if (xsdFilePathField.getText().isEmpty()) {
				Alert errorAlert = new Alert(AlertType.ERROR);
				errorAlert.setContentText(wsConstants.fileProcessMessages.PATH_EMPTY);
				DialogPane dialogPane = errorAlert.getDialogPane();
				dialogPane.getStylesheets().add("style.css");
				errorAlert.showAndWait();
				labelProcessIndicator.setText(wsConstants.fileProcessMessages.ERROR);
				fileProcessBean.setFileProcessNotification(labelProcessIndicator);
				return;
			}

			try {
				labelProcessIndicator.setText(wsConstants.fileProcessMessages.PROCESSING);
				fileProcessBean.setFileProcessNotification(labelProcessIndicator);
				result = xjcConversionClasses.xjcConvertor(secondStage);
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}
			if (result != null) {
				if (result.toString().contains(wsConstants.fileProcessMessages.ERROR_SCHEMA_STRING)) {

					Alert errorAlert = new Alert(AlertType.ERROR);
					errorAlert.setContentText(result.toString());
					DialogPane dialogPane = errorAlert.getDialogPane();
					dialogPane.getStylesheets().add("style.css");
					errorAlert.showAndWait();
					labelProcessIndicator.setText(wsConstants.fileProcessMessages.ERROR_SCHEMA);
					fileProcessBean.setFileProcessNotification(labelProcessIndicator);
					return;

				} else if (!xsdFilePathField.getText().isEmpty()) {

					if (fileProcessBean.getXjcNotofication().equals(wsConstants.fileProcessMessages.SUCCESS)) {
						labelProcessIndicator.setText(wsConstants.fileProcessMessages.SUCCESS);
						CONFIRMATION = new Alert(AlertType.CONFIRMATION);
						CONFIRMATION.setContentText(wsConstants.extentionsAndOthers.LABEL_SUCCESS_IMPORT);
						DialogPane dialogPane = CONFIRMATION.getDialogPane();
						dialogPane.getStylesheets().add("style.css");

						CONFIRMATION.setOnCloseRequest(d -> {

							secondStage.close();
						});
						CONFIRMATION.showAndWait();

						// guiAgent.nodeCreation(primaryStage, splitPane2,
						// menubar);

					}
					guiAgent agent = new nodeCreationDyanamic();
					agent.nodeCreation(borderpane, projectNameField.getText(), scene, splitPane2, primaryStage);
					ImportNewXSDFile.setDisable(true);
				}
			}
		});
		BPane.add(Text_2, 0, 0);
		BPane.add(projectNameField, 0, 1);
		BPane.add(Text_1, 0, 2);
		BPane.add(xsdFilePathField, 0, 3);
		BPane.add(buttonLoad, 1, 3);
		BPane.add(buttonSubmit, 0, 4);
		BPane.add(labelProcessIndicator, 0, 5);
		secondScene.getStylesheets().add("style.css");
		secondStage.setScene(secondScene);

		// Set position of IMPORT_NEW_XSD_TITLE window, related to primary
		// window.
		secondStage.setX(primaryStage.getX() + 250);
		secondStage.setY(primaryStage.getY() + 100);
		secondStage.setResizable(false);
		secondStage.showAndWait();
	}

	public static Task startingTask_02(Stage secondStage) {
		return new Task() {
			@Override
			public Void call() throws Exception {
				for (int i = 0; i < MAX; i++) {
					try {
						Thread.sleep(200);
						fileProcessBean.getFileProcessNotification();
					} catch (InterruptedException e) {
						Thread.interrupted();
						break;
					}
					updateProgress(i + 1, 10);
				}
				return null;
			}
		};
	}

}
