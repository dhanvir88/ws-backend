package com.ws.application.tcasewindow;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.ws.application.common.wsConstants;

public class propertyUtil {

	public static String getProperty(String key) {
		Properties pps = new Properties();
		try {
			InputStream in = new BufferedInputStream(new FileInputStream(wsConstants.PATH_PROPERTY));
			pps.load(in);
			String value = pps.getProperty(key);
			return value;

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
