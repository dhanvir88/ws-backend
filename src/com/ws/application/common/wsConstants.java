package com.ws.application.common;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;

import com.ws.application.tcasewindow.propertyUtil;

public class wsConstants {

	public final static String PATH_PROPERTY = "config/config.properties";

	public static class SoapHeaderConstants {
		public static final String PPS_AGW_NAME_SPACE_PREFIX = "ppsagw";
		public static final String PPS_AGW_NAME_SPACE = "http://www.ericsson.com/pps/ppsagw/1.0";
	}

	public static class title {
		public static final String APP_TITLE = "Ws Checker";
		public static final String IMPORT_NEW_XSD_TITLE = "Importing New XSD File";
		public static final String NEW_PROJECT = "New Project";
		public static final String SUCCESS = "Success";
	}

	public static class menuItems {
		public static final String FILE = "_File";
		public static final String EDIT = "_Edit";
		public static final String VIEW = "_View";
	}

	public static class menubarItems {
		public static final String FILE_OPTION_1 = "Import New XSD file";
		public static final String FILE_OPTION_2 = "Import Existing Project";
		public static final String FILE_OPTION_3 = "Replacing Existing XSD";
		public static final String NEW_PROJECT = "New Project";

	}

	public static class extentionsAndOthers {
		public static final String FILE_TYPES = "xsd files (*.txt)";
		public static final String FILES = "*.xml";
		public static final String NAME_OF_PROJECT = "Name of project";
		public static final String LABEL_ENTER_LOCATION_PATH = "Enter location of the XSD file to be imported";
		public static final String LABEL_SUCCESS_IMPORT = "Successfully imported xsd file";

	}

	public static class appButtons {
		public static final String BUTTON_LOAD_XSD = "Find";
		public static final String BUTTON_XSD_SUBMIT = "Process";
		public static final String BUTTON_OK = "OK";

	}

	public static class xsdPackageLocations {
		public static final String PACKAGE = "com.classes.xjc";
		public static final String SRC = "src";
		public static final String NAME_TYPE_SEPERATOR = "MAPPED_WITH_NAME";
	}

	public static class fileProcessMessages {
		public static final String SUCCESS = "SUCCESS";
		public static final String FAILED = "FAILED";
		public static final String ERROR = "Error";
		public static final String PROCESSING = "Processing......";
		public static final String ERROR_SCHEMA = "Error Reading Schema";
		public static final String ERROR_SCHEMA_STRING = "Failed to read schema document";
		public static final String PATH_EMPTY = "XSD path can't be Empty";
		public static final String PROJECT_NAME_EMPTY = "Project Name Can't be Empty";
		public static final String PROJECT_CHACH_LENGTH = "Project Name should contains more than 8 characters.";
	}

	public static class treeMenubar {
		public static final String NEW_TEST_DIR = "New Test Directory";
		public static final String DEFAULT_DIR = "Test Folder";
		public static final String RENAME = "Delete";
		public static final String DELETE = "Rename";
	}

	public static class tcmainwindow {
		public final static int MAIN_WINDOW_X = 240;
		public final static int MAIN_WINDOW_Y = 100;
		public final static int MAIN_WINDOW_WIDTH = 885;
		public final static int MAIN_WINDOW_HEIGHT = 636;
		public final static String TEST_NAME = " New Test Case";
		public final static Color MAIN_BACK_COLOR = Color.WHITE;
		public final static Color TOOL_BAR_BACK_COLOR = new Color(37, 174, 96);
		public final static int MAIN_H_GAP = 50;
	}

	public final static Font FONT_TITLE = new Font(propertyUtil.getProperty("ds.ui.font.family"), 0, 27);
	public final static ImageIcon ICON_SETTING = new ImageIcon("images/setting.png");
	public final static ImageIcon ICON_SETTING_ENABLE = new ImageIcon("images/settingEnable.png");
	public final static ImageIcon ICON_STATUS = new ImageIcon("images/status.png");
	public final static ImageIcon ICON_STATUS_ENABLE = new ImageIcon("images/statusEnable.png");
}
