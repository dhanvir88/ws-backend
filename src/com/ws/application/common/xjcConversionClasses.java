package com.ws.application.common;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.ws.application.beans.fileProcessBean;
import com.ws.application.beans.packageNamebean;
import com.ws.application.gui.menuItemsHandaling;

import javafx.stage.Stage;

public class xjcConversionClasses extends menuItemsHandaling {
	public static StringBuffer xjcConvertor(Stage secondStage) throws InterruptedException {

		StringBuffer output = new StringBuffer();
		String pathofclasses = wsConstants.xsdPackageLocations.SRC;
		String getRawpathOfXsd = fileProcessBean.getFilelocation();
		System.out.println(getRawpathOfXsd);
		String xsdExists = getRawpathOfXsd.replace("\\", "\\\\");
		System.out.println(xsdExists);
		String fileName = packageNamebean.getXsdFileName().replace(".", "");
		String packagename = wsConstants.xsdPackageLocations.PACKAGE;
		String xsdClassPackage = packagename + "." + fileName.replace("_", "");
		System.out.println(xsdClassPackage);
		Process p;
		String cmd = "xjc -d " + pathofclasses + " -p " + xsdClassPackage + " " + xsdExists;
		try {

			p = Runtime.getRuntime().exec("cmd /c " + cmd);
			System.out.println("DONE");
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line = "";
			while ((line = reader.readLine()) != null) {
				output.append(line + "\n");

			}
			p.waitFor();
			System.out.println(output);

			fileProcessBean.setXjcNotofication(wsConstants.fileProcessMessages.SUCCESS);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return output;
	}

}
