package com.his.scs.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.his.scs.controller.SimulatorController01;
import com.his.scs.controller.SimulatorController;
import com.his.scs.model.DoctorModeModel;
import com.his.scs.model.SimulatorModel01;
import com.his.scs.model.SimulatorModel;

public class HomeView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2552640378990036066L;
	private JButton selectOkButton_btn;
	private JComboBox<String> modeSelection_cb;
	public final static int PATIENT_MODE = 1;
	public final static int DOCTOR_MODE = 2;
	public final static int EMERGENCY_MODE = 3;
	private int selectedMode_int = 1;
	private JPanel simulatorPanel;
	private JPanel lastSelectedPanel;

	public HomeView() {

		simulatorPanel = new JPanel();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000, 1000);
		initialize();
		this.add(simulatorPanel);
	}

	public void initialize() {

		String list[] = { "Patient", "Doctor", "Emergency" };
		modeSelection_cb = new JComboBox(list);
		simulatorPanel.add(modeSelection_cb);
		selectOkButton_btn = new JButton("OK");
		simulatorPanel.add(selectOkButton_btn);
		addListener();
		selectMode();

	}

	public void switchMode() {

	}

	public void addListener() {
		selectOkButton_btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String mode = (String) modeSelection_cb.getSelectedItem();
				if (mode.equals("Patient")) {
					selectedMode_int = PATIENT_MODE;
				} else if (mode.equals("Doctor")) {
					selectedMode_int = DOCTOR_MODE;
				} else if (mode.equals("Emergency")) {
					selectedMode_int = EMERGENCY_MODE;
				}
				selectMode();
			}

		});
	}

	public void selectMode() {
		if (lastSelectedPanel != null) {
			lastSelectedPanel.removeAll();
			simulatorPanel.remove(lastSelectedPanel);
			simulatorPanel.invalidate();
			simulatorPanel.revalidate();
			switch (selectedMode_int) {
			case DOCTOR_MODE:

				DoctorModeModel doctorModeModel = new DoctorModeModel();
				DoctorModeView doctorModeView = new DoctorModeView(doctorModeModel.getBatteryLevel());
				simulatorPanel.add(doctorModeView);
				this.add(simulatorPanel);
				lastSelectedPanel = (DoctorModeView) doctorModeView;
				break;

			case PATIENT_MODE:
				SimulatorView simulatorView = new SimulatorView();
				SimulatorModel simulatorModel = new SimulatorModel();

				SimulatorController theController = new SimulatorController(simulatorView, simulatorModel);

				simulatorPanel.add(simulatorView);
				this.add(simulatorPanel);
				lastSelectedPanel = (SimulatorView) simulatorView;
				break;
			case EMERGENCY_MODE:
				break;

			
			}
		}else {
			SimulatorView simulatorView = new SimulatorView();
			SimulatorModel simulatorModel = new SimulatorModel();

			SimulatorController theController = new SimulatorController(simulatorView, simulatorModel);

			simulatorPanel.add(simulatorView);
			this.add(simulatorPanel);
			lastSelectedPanel = (SimulatorView) simulatorView;
		}

	}

}
