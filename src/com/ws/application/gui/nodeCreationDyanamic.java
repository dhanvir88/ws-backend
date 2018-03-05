package com.ws.application.gui;

import com.ws.application.tcasewindow.mainwindow;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.TextFieldTreeCell;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Callback;

public class nodeCreationDyanamic extends TextFieldTreeCell<String> implements guiAgent {

	@Override
	public void nodeCreation(BorderPane borderpane, String projectName, Scene scene, SplitPane splitPane2, Stage primaryStage) {

		VBox treeContainer = new VBox();
		ComboBox<String> actionDropDown = new ComboBox<>();
		Button button = new Button("submit");
		actionDropDown.getItems().addAll("Action", "Creat new step");
		actionDropDown.setValue("Action");
		actionDropDown.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				try {
					System.out.println("repeated");
					// new itemContentFactoryImpl();
					new mainwindow();

				} catch (Exception e) {

					e.printStackTrace();
				}
			}

		});

		TabPane tabPane = new TabPane();
		tabPane.getStylesheets().add("style.css");
		Tab tab = new Tab();
		tab.setText("new tab");
		tab.setContent(new Rectangle());
		tabPane.getTabs().add(tab);
		TreeItem<String> RootItem = new TreeItem<>(projectName);
		RootItem.setExpanded(true);
		TreeView<String> tree = new TreeView<>(RootItem);
		tree.setShowRoot(true);
		tree.setEditable(true);
		tree.setCellFactory(new Callback<TreeView<String>, TreeCell<String>>() {
			@Override
			public TreeCell<String> call(TreeView<String> p) {
				return new treeCellContextAndAddition();
			}
		});
		treeContainer.getChildren().addAll(actionDropDown, button);
		splitPane2.getItems().addAll(tree, treeContainer);
		splitPane2.setDividerPositions(0.3f, 0.6f, 0.9f);

		return;

	}

	public void vboxTabIntializationImpl() {

	}

}
