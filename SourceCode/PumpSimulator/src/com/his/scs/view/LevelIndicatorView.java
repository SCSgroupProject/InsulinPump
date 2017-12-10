package com.his.scs.view;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class LevelIndicatorView extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2552640378990036066L;

	private JProgressBar batteryProgressBar_pBar;
	private JLabel batteryLabel_label;
	private int currentBatteryLevel_int;

	public LevelIndicatorView(int batteryLevel) {

		JPanel simulatorPanel = new JPanel();
		setCurrentBatteryLevel_int(batteryLevel);

		this.setSize(100, 600);
		initializeViews();

		simulatorPanel.add(batteryLabel_label);
		simulatorPanel.add(batteryProgressBar_pBar);
		this.add(simulatorPanel);

	}

	private void initializeViews() {
		batteryLabel_label = new JLabel("Battery");
		initializeProgressBars();
	}

	private void initializeProgressBars() {
		batteryProgressBar_pBar = new JProgressBar(0, 100);
		batteryProgressBar_pBar.setValue(getCurrentBatteryLevel_int());
		batteryProgressBar_pBar.setStringPainted(true);

	}

	public void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}

	public int getCurrentBatteryLevel_int() {
		return currentBatteryLevel_int;
	}

	public void setCurrentBatteryLevel_int(int currentBatteryLevel_int) {
		this.currentBatteryLevel_int = currentBatteryLevel_int;
	}

}
