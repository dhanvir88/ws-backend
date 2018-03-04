package com.ws.application.gui;

import java.io.FileNotFoundException;

import com.ws.application.common.wsConstants;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class startupPage extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle(wsConstants.title.APP_TITLE);
		Group group = new Group();
		Scene scene = new Scene(group, 800, 650);
		SplitPane splitPane2 = new SplitPane();
		splitPane2.setOrientation(Orientation.HORIZONTAL);
		splitPane2.prefWidthProperty().bind(scene.widthProperty());
		splitPane2.prefHeightProperty().bind(scene.heightProperty());

		MenuBar menubar = new MenuBar();

		BorderPane layout = new BorderPane();
		// File menu
		Menu filemenu = new Menu(wsConstants.menuItems.FILE);
		// Menu items under file

		MenuItem ImportNewXSDFile = new MenuItem(wsConstants.menubarItems.NEW_PROJECT);
		// ImportNewXSDFile.setOnAction(e ->
		// menuItemsHandaling.NewProject(primaryStage, layout, scene,
		// splitPane2, ImportNewXSDFile));
		ImportNewXSDFile.setOnAction(e -> {
			try {
				wsdlFileSelection.NewProject(primaryStage, layout, scene, splitPane2, ImportNewXSDFile);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		filemenu.getItems().add(ImportNewXSDFile);
		filemenu.getItems().add(new SeparatorMenuItem());

		filemenu.getItems().add(new MenuItem(wsConstants.menubarItems.FILE_OPTION_2));
		filemenu.getItems().add(new SeparatorMenuItem());

		filemenu.getItems().add(new MenuItem(wsConstants.menubarItems.FILE_OPTION_3));
		// Main menu Bar

		menubar.getMenus().addAll(filemenu);

		layout.setTop(menubar);
		layout.setCenter(splitPane2);
		group.getChildren().addAll(layout);
		scene.getStylesheets().add("style.css");
		primaryStage.setScene(scene);

		primaryStage.show();

	}
}