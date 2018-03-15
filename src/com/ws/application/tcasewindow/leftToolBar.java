package com.ws.application.tcasewindow;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;

import com.ws.application.common.wsConstants;

public class leftToolBar extends JPanel {

	private static final long serialVersionUID = 1L;
	private static buttonHandler addingConfiguration;
	private static buttonHandler presentStatus;

	public leftToolBar() {
		initialize();
		addButtion();
		// addListener();
	}

	private void initialize() {
		Dimension preferredSize = new Dimension(48, wsConstants.tcmainwindow.MAIN_WINDOW_HEIGHT);
		this.setPreferredSize(preferredSize);
		this.setMaximumSize(preferredSize);
		this.setMinimumSize(preferredSize);
		this.setBackground(wsConstants.tcmainwindow.TOOL_BAR_BACK_COLOR);
		this.setLayout(new GridLayout(2, 1));
	}

	private void addButtion() {

		JPanel panelUp = new JPanel();
		panelUp.setBackground(wsConstants.tcmainwindow.TOOL_BAR_BACK_COLOR);
		panelUp.setLayout(new FlowLayout(-2, -2, -4));
		presentStatus = new buttonHandler(wsConstants.ICON_STATUS_ENABLE, wsConstants.ICON_STATUS_ENABLE, wsConstants.ICON_STATUS, propertyUtil.getProperty("test.case.title"));
		addingConfiguration = new buttonHandler(wsConstants.ICON_SETTING, wsConstants.ICON_SETTING_ENABLE, wsConstants.ICON_SETTING, propertyUtil.getProperty("ds.ui.setting.title"));
		panelUp.add(presentStatus);
		panelUp.add(addingConfiguration);
		this.add(panelUp);

	}
}
