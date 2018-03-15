package com.ws.application.tcasewindow;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

import com.ws.application.common.wsConstants;

public class newTcstartUp extends JPanel {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	public static JTextField textfield;
	public static JTextArea descriptionArea;
	public static JTextArea preconditionsArea;
	public static JButton buttonNext;
	public static JButton buttonBack;
	public static JPanel testCaseDesriptionPanel;
	public static JPanel panelButtons;
	public static JPanel addTestStepsPanel;
	public static addingTestSteps addingTestSteps;

	public newTcstartUp() {
		super(true);
		initialize();
		addComponent();
		addListener();

	}

	private void initialize() {
		this.setBackground(wsConstants.tcmainwindow.MAIN_BACK_COLOR);
		this.setLayout(new BorderLayout());

	}

	private void addComponent() {

		this.add(testCaseDesriptionframe(), BorderLayout.NORTH);
		this.add(Buttons(), BorderLayout.SOUTH);
	}

	private JPanel testCaseDesriptionframe() {
		testCaseDesriptionPanel = new JPanel();
		testCaseDesriptionPanel.setBackground(wsConstants.tcmainwindow.MAIN_BACK_COLOR);
		testCaseDesriptionPanel.setLayout(new GridLayout(4, 1));
		JLabel labelTitle = new JLabel(propertyUtil.getProperty("test.case.title"));
		labelTitle.setFont(wsConstants.FONT_TITLE);
		labelTitle.setForeground(wsConstants.tcmainwindow.TOOL_BAR_BACK_COLOR);
		textfield = new JTextField(100);
		Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
		textfield.setBorder(border);
		textfield.setPreferredSize(new Dimension(200, 25));
		JLabel description = new JLabel(propertyUtil.getProperty("test.case.description"));
		description.setFont(wsConstants.FONT_TITLE);
		description.setForeground(wsConstants.tcmainwindow.TOOL_BAR_BACK_COLOR);
		descriptionArea = new JTextArea();
		descriptionArea.setBorder(border);
		descriptionArea.setPreferredSize(new Dimension(400, 25));
		JLabel preconditions = new JLabel(propertyUtil.getProperty("test.case.preconditions"));
		preconditions.setFont(wsConstants.FONT_TITLE);
		preconditions.setForeground(wsConstants.tcmainwindow.TOOL_BAR_BACK_COLOR);
		preconditionsArea = new JTextArea();
		preconditionsArea.setBorder(border);
		preconditionsArea.setPreferredSize(new Dimension(400, 25));
		testCaseDesriptionPanel.add(labelTitle);
		testCaseDesriptionPanel.add(textfield);
		testCaseDesriptionPanel.add(description);
		testCaseDesriptionPanel.add(descriptionArea);
		testCaseDesriptionPanel.add(preconditions);
		testCaseDesriptionPanel.add(preconditionsArea);
		return testCaseDesriptionPanel;
	}

	private JPanel Buttons() {
		panelButtons = new JPanel();
		panelButtons.setBackground(wsConstants.tcmainwindow.MAIN_BACK_COLOR);
		panelButtons.setLayout(new GridLayout(4, 1));
		buttonNext = new JButton(propertyUtil.getProperty("test.case.button.addteststeps"));
		// buttonBack = new
		// JButton(propertyUtil.getProperty("test.case.button.back"));
		panelButtons.add(buttonNext);
		// panelButtons.add(buttonBack);
		return panelButtons;
	}

	private void addListener() {
		buttonNext.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addingTestSteps = new addingTestSteps();
				newTcstartUp.testCaseDesriptionPanel.removeAll();
				newTcstartUp.panelButtons.removeAll();
				newTcstartUp.testCaseDesriptionPanel.add(addingTestSteps);
				mainwindow.newTcstartUp.updateUI();

			}
		});
	}
}
