package com.ws.application.gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.ws.applcation.handle.dataProvider;
import com.ws.application.beans.fileProcessBean;
import com.ws.application.beans.packageNamebean;
import com.ws.application.common.wsConstants;
import com.ws.application.common.xjcConversionClasses;

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

public abstract class wsdlFileSelection {
	public static File file = null;

	public static Alert CONFIRMATION = null;
	final static int MAX = 10;
	final static Label labelProcessIndicator = new Label();
	static TextField xsdFilePathField = new TextField();
	static xjcConversionClasses xjcConvertor = new xjcConversionClasses();
	static StringBuffer result = null;
	nodeCreationDyanamic node = null;

	public static void NewProject(Stage primaryStage, BorderPane borderpane, Scene scene, SplitPane splitPane2, MenuItem ImportNewXSDFile) throws FileNotFoundException {

		GridPane BPane = new GridPane();
		BPane.setAlignment(Pos.CENTER);
		BPane.setHgap(10);
		BPane.setVgap(12);
		Scene secondScene = new Scene(BPane, 350, 180);

		Stage secondStage = new Stage();
		secondStage.setTitle(wsConstants.title.NEW_PROJECT);
		Label Text_1 = new Label(wsConstants.extentionsAndOthers.LABEL_ENTER_LOCATION_PATH);
		xsdFilePathField.setMaxWidth(300);
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
				System.out.println("the file has not been selected:- " + file.toString());
			}
		});

		ProgressBar pbar = new ProgressBar();
		pbar.setProgress(0);
		buttonSubmit.setOnAction(e -> {
			labelProcessIndicator.setVisible(true);
			fileProcessBean.setFilelocation(xsdFilePathField.getText());
			File fileOnField = new File(xsdFilePathField.getText());
			packageNamebean.setXsdFileName(fileOnField.getName());

			if (xsdFilePathField.getText().isEmpty()) {
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
				File sourcefile = new File(xsdFilePathField.getText());
				File distibationAddress = new File("wsdlFiles");
				dataProvider.copyFileInWorkSpace(sourcefile, distibationAddress);
				secondStage.close();

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			guiAgent agent = new nodeCreationDyanamic();
			agent.nodeCreation(borderpane, xsdFilePathField.getText(), scene, splitPane2, primaryStage);
			ImportNewXSDFile.setDisable(true);

		});
		BPane.add(Text_1, 0, 0);
		BPane.add(xsdFilePathField, 0, 1);
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

}
