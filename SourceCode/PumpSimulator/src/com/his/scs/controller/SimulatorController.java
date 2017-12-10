 package com.his.scs.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.his.scs.model.SimulatorModel01;
import com.his.scs.model.SimulatorModel;
import com.his.scs.view.SimulatorView01;
import com.his.scs.view.SimulatorView;

public class SimulatorController {
	
	private SimulatorView theView;
	private SimulatorModel theModel;
	
	public SimulatorController(SimulatorView theView, SimulatorModel theModel) {
		
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.addSimulatorListener(new SimulatorListener());
	}
	
	class SimulatorListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			int BSLvalue = 0;
			
			try {
				BSLvalue = theView.getBSLvalue();
				
				theModel.findBSLband(BSLvalue);
				theView.setBSLband(theModel.getBSLband());
			}
			catch(Exception e) {
				theView.displayErrorMessage("ERROR::"+ e);
			}
			
		}
		
	}

}
