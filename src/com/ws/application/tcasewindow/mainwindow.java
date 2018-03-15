package com.ws.application.tcasewindow;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.ws.application.common.wsConstants;

public class mainwindow {

	private JFrame frame;
	private static JPanel mainPanel;
	private static JPanel mainPanelCenter;
	public static newTcstartUp newTcstartUp;
	public static addingTestSteps addingTestSteps;

	public mainwindow() {
		initialize();
	}

	private void initialize() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frame = new JFrame();
		frame.setBounds(wsConstants.tcmainwindow.MAIN_WINDOW_X, wsConstants.tcmainwindow.MAIN_WINDOW_Y, wsConstants.tcmainwindow.MAIN_WINDOW_WIDTH, wsConstants.tcmainwindow.MAIN_WINDOW_HEIGHT);
		frame.setTitle(wsConstants.tcmainwindow.TEST_NAME);
		frame.setBackground(wsConstants.tcmainwindow.MAIN_BACK_COLOR);
		mainPanel = new JPanel(true);
		mainPanel.setBackground(Color.white);
		mainPanel.setLayout(new BorderLayout());
		leftToolBar lefttoolbar = new leftToolBar();
		mainPanel.add(lefttoolbar, BorderLayout.WEST);
		newTcstartUp = new newTcstartUp();
		addingTestSteps = new addingTestSteps();
		mainPanelCenter = new JPanel(true);
		mainPanelCenter.setLayout(new BorderLayout());
		mainPanelCenter.add(newTcstartUp, BorderLayout.CENTER);

		mainPanel.add(mainPanelCenter, BorderLayout.CENTER);
		frame.add(mainPanel);
		frame.setVisible(true);
	}
}
