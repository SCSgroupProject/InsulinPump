package com.his.scs.view;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DoctorModeView extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2552640378990036066L;

	private JLabel mode_label;
	private LevelIndicatorView levelIndicatorView;
	private int batteryLevel_int;

	public DoctorModeView(int batteryLevel) {

		JPanel simulatorPanel = new JPanel();
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(450, 1000);
		setBatteryLevel_int(batteryLevel);
		initializeViews();
		simulatorPanel.add(mode_label);
		simulatorPanel.add(levelIndicatorView);
		levelIndicatorView.setVisible(true);
		this.add(simulatorPanel);

	}

	public int getBatteryLevel_int() {
		return batteryLevel_int;
	}

	public void setBatteryLevel_int(int batteryLevel_int) {
		this.batteryLevel_int = batteryLevel_int;
	}

	private void initializeViews() {
		mode_label = new JLabel("Doctor Mode");
		levelIndicatorView = new LevelIndicatorView(getBatteryLevel_int());

	}

}
