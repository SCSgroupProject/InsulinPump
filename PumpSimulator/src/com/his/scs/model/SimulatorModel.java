package com.his.scs.model;

public class SimulatorModel {
	
	private String BSLband;
	
	public void findBSLband(int BSL) {
		if(BSL!=0) {
			if(BSL<70) {
				BSLband = "Unsafe Band";
			}
			else if(BSL>70 && BSL<120) {
				BSLband = "Safe Band";
			}
			else if(BSL>120) {
				BSLband = "Undesirable Band";
			}
		}
	}
	
	public String getBSLband() {
		return BSLband;
	}

}
