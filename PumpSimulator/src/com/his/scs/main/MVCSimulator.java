package com.his.scs.main;
import com.his.scs.controller.SimulatorController;
import com.his.scs.model.SimulatorModel;
import com.his.scs.view.SimulatorView;

public class MVCSimulator {
	
	public static void main(String[] args) {
		
		SimulatorView theView = new SimulatorView();
		SimulatorModel theModel = new SimulatorModel();
		
		SimulatorController theController = new SimulatorController(theView, theModel);
		
		theView.setVisible(true);
	}

}
