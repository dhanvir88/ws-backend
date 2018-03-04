package com.ws.application.gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.xml.bind.annotation.XmlElement;

import org.xml.sax.SAXException;

import com.ws.applcation.handle.dataBinding;
import com.ws.applcation.handle.dataProvider;
import com.ws.applcation.handle.requesthandler;
import com.ws.application.beans.createTestStructureStepBean;
import com.ws.application.beans.itemSelectionBean;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class itemContentFactoryImpl {

	private static itemContentFactoryImpl itemcontentfactoryimpl = null;
	createTestStructureStepBean createteststructure = new createTestStructureStepBean();
	itemSelectionBean itemselection = new itemSelectionBean();
	dataProvider provider = new dataProvider();
	requesthandler handler = new requesthandler();
	Field[] requestElements;
	Field[] innerRequestElements;
	File xsdDir;
	private XmlElement xmlelement;
	private ArrayList<String> subRequestElementsEnum;

	// public itemContentFactoryImpl() throws Exception {

	public itemContentFactoryImpl() throws Exception {
		Stage primaryStage = new Stage();
		primaryStage.setTitle(" Form JavaFX Application");
		GridPane gridPane = createRegistrationFormPane();
		addUIControls(gridPane);
		Scene scene = new Scene(gridPane, 800, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static itemContentFactoryImpl getInstance() throws Exception {
		if (itemcontentfactoryimpl == null) {
			itemcontentfactoryimpl = new itemContentFactoryImpl();
		}
		return itemcontentfactoryimpl;
	}

	private GridPane createRegistrationFormPane() {

		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setPadding(new Insets(40, 40, 40, 40));
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
		columnOneConstraints.setHalignment(HPos.RIGHT);
		ColumnConstraints columnTwoConstrains = new ColumnConstraints(200, 200, Double.MAX_VALUE);
		columnTwoConstrains.setHgrow(Priority.ALWAYS);
		gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
		return gridPane;
	}

	private void addUIControls(GridPane gridPane) throws ClassNotFoundException, InstantiationException, IllegalAccessException, FileNotFoundException, UnsupportedEncodingException, SAXException {
		Label headerLabel = new Label("TC Form");
		headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
		gridPane.add(headerLabel, 0, 0, 2, 1);
		GridPane.setHalignment(headerLabel, HPos.CENTER);
		GridPane.setMargin(headerLabel, new Insets(20, 0, 20, 0));

		Label nameLabel = new Label("XSD Selection : ");
		gridPane.add(nameLabel, 0, 1);

		itemSelectionBean.xsdSelectionOnRun.setPrefHeight(40);
		gridPane.add(itemSelectionBean.xsdSelectionOnRun, 1, 1);
		for (String xsdlist : provider.listXSDFilesParsed()) {
			itemSelectionBean.xsdSelectionOnRun.getItems().add(xsdlist);
		}
		itemSelectionBean.xsdSelectionOnRun.setValue("select parent xsd");

		itemSelectionBean.xsdSelectionOnRun.valueProperty().addListener(e -> {
			try {
				if (itemSelectionBean.xsdSelectionOnRun.getValue() != null) {

					createteststructure.setXsdSelection(itemSelectionBean.xsdSelectionOnRun.getValue());
					System.out.println(itemSelectionBean.xsdSelectionOnRun.getValue());
					// dataBinding.getInstance().bindItemData();

				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		Label emailLabel = new Label("Request Name:  ");
		gridPane.add(emailLabel, 0, 2);

		itemSelectionBean.requestCallSelectionOnRun.setPrefHeight(40);
		gridPane.add(itemSelectionBean.requestCallSelectionOnRun, 1, 2);
		itemSelectionBean.requestCallSelectionOnRun.getItems().addAll(provider.listXSDComplexElementTypes());
		itemSelectionBean.requestCallSelectionOnRun.setValue("select request Element");
		itemSelectionBean.requestCallSelectionOnRun.valueProperty().addListener(e -> {

			handler.requesthandlerimpl();

		});

		Label passwordLabel = new Label("Password : ");
		gridPane.add(passwordLabel, 0, 3);

		PasswordField passwordField = new PasswordField();
		passwordField.setPrefHeight(40);
		gridPane.add(passwordField, 1, 3);

		Button submitButton = new Button("Submit");
		submitButton.setPrefHeight(40);
		submitButton.setDefaultButton(true);
		submitButton.setPrefWidth(100);
		submitButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent t) {
				try {
					createteststructure.setTestCaseNumber("1");
					dataBinding.getInstance().bindItemData();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		TextArea text = new TextArea("");
		gridPane.add(text, 0, 2, 4, 1);
		gridPane.add(submitButton, 0, 4, 2, 1);
		GridPane.setHalignment(text, HPos.LEFT);
		GridPane.setHalignment(submitButton, HPos.CENTER);
		GridPane.setMargin(submitButton, new Insets(20, 0, 20, 0));

	}

	public boolean isClass(String className) {
		try {
			// System.out.println("ClassName:- " + className);
			Class.forName(className);
			return true;
		} catch (ClassNotFoundException e) {
			return false;
		}
	}

	public boolean isClassEnum(String className) {
		try {
			// System.out.println("ClassName Enum:- " + className);

			Class<?> enumClass = Class.forName(className);

			if (enumClass.isEnum()) {
				return true;
			}
		} catch (ClassNotFoundException e) {
			return false;
		}
		return false;
	}

	public Field[] callElementIterate(String classpath) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Class<?> c = Class.forName(classpath);
		c.newInstance();
		Field fields[] = c.getDeclaredFields();
		return fields;
	}

	public int getNumberOfSubFields(String classpath) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> c = Class.forName(classpath);
		c.newInstance();

		int numberOffields = 0;
		if (c.getDeclaredFields().length > 0) {
			numberOffields = c.getDeclaredFields().length;
		}
		return numberOffields;

	}

	public String callSubElementFieldIterate(HashMap<Integer, String> mapsubelements) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		for (Entry<Integer, String> e : mapsubelements.entrySet()) {
			Object key = e.getKey();
			Object value = e.getValue();
			System.out.println("Key :-  " + key);
			System.out.println("value :-  " + value);

		}

		return null;
	}

	public static ArrayList<String> reverseReturn(ArrayList<String> alist) {
		if (alist == null || alist.isEmpty()) {
			return null;
		}

		ArrayList<String> rlist = new ArrayList<>(alist);

		Collections.reverse(rlist);
		return rlist;
	}
}
