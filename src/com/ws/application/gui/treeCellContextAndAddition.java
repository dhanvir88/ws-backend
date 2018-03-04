package com.ws.application.gui;

import com.ws.application.common.wsConstants;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.cell.TextFieldTreeCell;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class treeCellContextAndAddition extends TextFieldTreeCell<String> {
	private TextField textField;
	private ContextMenu contextmenu = new ContextMenu();

	public treeCellContextAndAddition() {
		MenuItem newDirectory = new MenuItem(wsConstants.treeMenubar.NEW_TEST_DIR);
		MenuItem deleteTestDirectory = new MenuItem(wsConstants.treeMenubar.DELETE);
		MenuItem rename = new MenuItem(wsConstants.treeMenubar.RENAME);
		contextmenu.getItems().addAll(newDirectory, deleteTestDirectory, rename);
		newDirectory.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent t) {
				TreeItem<String> newTestDirectory = new TreeItem<>(wsConstants.treeMenubar.DEFAULT_DIR);
				getTreeItem().getChildren().add(newTestDirectory);
			}
		});
	}

	@Override
	public void updateItem(String item, boolean empty) {
		super.updateItem(item, empty);

		// if the item is not empty and is a root...
		if (!empty && getTreeItem().getParent() == null) {
			setContextMenu(contextmenu);
		}
	}

	@Override
	public void startEdit() {
		super.startEdit();

		if (textField == null) {
			createTextField();
		}
		setText(null);
		setGraphic(textField);
		textField.selectAll();
	}

	@Override
	public void cancelEdit() {
		super.cancelEdit();
		setText(getItem());
		setGraphic(getTreeItem().getGraphic());
	}

	private void createTextField() {
		textField = new TextField(getString());
		textField.setOnKeyReleased(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent t) {
				if (t.getCode() == KeyCode.ENTER) {
					commitEdit(textField.getText());
				} else if (t.getCode() == KeyCode.ESCAPE) {
					cancelEdit();
				}
			}
		});
	}

	private String getString() {
		return getItem() == null ? "" : getItem().toString();
	}
}
