package com.ws.application.tcasewindow;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.ws.application.common.wsConstants;

public class addingTestSteps extends JPanel {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	public static JButton buttonAddStep;
	public static JButton buttonBack;
	public static JPanel panelDisplayOptions;
	public static JPanel panelButtons;

	public addingTestSteps() {
		super(true);
		System.out.println("Button return");
		initialize();
		addComponent();
		addListener();

	}

	private void initialize() {
		this.setBackground(wsConstants.tcmainwindow.MAIN_BACK_COLOR);
		this.setLayout(new BorderLayout());
	}

	private void addComponent() {

		this.add(testStepOptionDisplay(), BorderLayout.NORTH);
		this.add(Buttons(), BorderLayout.SOUTH);
	}

	private JPanel testStepOptionDisplay() {
		panelDisplayOptions = new JPanel();
		panelDisplayOptions.setBackground(wsConstants.tcmainwindow.MAIN_BACK_COLOR);
		panelDisplayOptions.setLayout(new GridLayout(4, 1));
		JLabel labelTitle = new JLabel(propertyUtil.getProperty("test.case.title"));
		labelTitle.setFont(wsConstants.FONT_TITLE);
		labelTitle.setForeground(wsConstants.tcmainwindow.TOOL_BAR_BACK_COLOR);
		panelDisplayOptions.add(labelTitle);
		return panelDisplayOptions;
	}

	private JPanel Buttons() {
		panelButtons = new JPanel();
		panelButtons.setBackground(wsConstants.tcmainwindow.MAIN_BACK_COLOR);
		panelButtons.setLayout(new GridLayout(4, 1));
		buttonAddStep = new JButton(propertyUtil.getProperty("test.case.button.addteststeps"));
		buttonBack = new JButton(propertyUtil.getProperty("test.case.button.back"));
		panelButtons.add(buttonAddStep);
		panelButtons.add(buttonBack);
		return panelButtons;
	}

	private void addListener() {
		buttonAddStep.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainwindow.addingTestSteps.updateUI();
			}
		});
		buttonBack.addMouseListener(new MouseListener() {

			@SuppressWarnings("static-access")
			@Override
			public void mouseClicked(MouseEvent e) {
				newTcstartUp newTcstartUp = new newTcstartUp();
				addingTestSteps.panelDisplayOptions.removeAll();
				addingTestSteps.panelButtons.removeAll();
				addingTestSteps.panelDisplayOptions.add(newTcstartUp);
				newTcstartUp.addingTestSteps.updateUI();
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}
}
