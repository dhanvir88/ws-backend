package com.ws.application.beans;

import javafx.scene.control.Label;

public class fileProcessBean {

	public static String fileLocation = null;
	public static Label fileProcessNotification = null;
	public static String xjcNotofication = null;

	public static String getXjcNotofication() {
		return xjcNotofication;
	}

	public static void setXjcNotofication(String xjcNotofication) {
		fileProcessBean.xjcNotofication = xjcNotofication;
	}

	public static Label getFileProcessNotification() {
		return fileProcessNotification;
	}

	public static void setFileProcessNotification(Label fileProcessNotification) {
		fileProcessBean.fileProcessNotification = fileProcessNotification;
	}

	public static String getFilelocation() {
		return fileLocation;
	}

	public static void setFilelocation(String filelocation) {
		fileLocation = filelocation;
	}
}
