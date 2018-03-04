package com.ws.application.beans;

import javafx.scene.control.ComboBox;

public class itemSelectionBean {
	public static ComboBox<String> xsdSelectionOnRun = new ComboBox<>();
	public static ComboBox<String> requestCallSelectionOnRun = new ComboBox<>();
	public static String classTreeIterate = null;
	public static String fieldNameOnRun = null;
	public static String fieldTypeOnRun = null;
	public static String requestProcessingCall = null;

	public static String getRequestProcessingCall() {
		return requestProcessingCall;
	}

	public static void setRequestProcessingCall(String requestProcessingCall) {
		itemSelectionBean.requestProcessingCall = requestProcessingCall;
	}

	public static String getFieldTypeOnRun() {
		return fieldTypeOnRun;
	}

	public static void setFieldTypeOnRun(String fieldTypeOnRun) {
		itemSelectionBean.fieldTypeOnRun = fieldTypeOnRun;
	}

	public static String getFieldNameOnRun() {
		return fieldNameOnRun;
	}

	public static void setFieldNameOnRun(String fieldNameOnRun) {
		itemSelectionBean.fieldNameOnRun = fieldNameOnRun;
	}

	public static String getClassTreeIterate() {
		return classTreeIterate;
	}

	public static void setClassTreeIterate(String classTreeIterate) {
		itemSelectionBean.classTreeIterate = classTreeIterate;
	}

	public ComboBox<String> getRequestCallSelectionOnRun() {
		return requestCallSelectionOnRun;
	}

	public void setRequestCallSelectionOnRun(ComboBox<String> requestCallSelectionOnRun) {
		itemSelectionBean.requestCallSelectionOnRun = requestCallSelectionOnRun;
	}

	public ComboBox<String> getXsdSelectionOnRun() {
		return xsdSelectionOnRun;
	}

	public void setXsdSelectionOnRun(ComboBox<String> xsdSelectionOnRun) {
		itemSelectionBean.xsdSelectionOnRun = xsdSelectionOnRun;
	}
}
