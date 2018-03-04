package com.ws.application.gui;

import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public interface guiAgent {

	public void nodeCreation(BorderPane pane, String projectName, Scene scene, SplitPane splitPane2, Stage primaryStage);

}
