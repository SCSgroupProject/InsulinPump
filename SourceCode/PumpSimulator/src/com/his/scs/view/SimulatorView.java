package com.his.scs.view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimulatorView extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2552640378990036066L;
	private JLabel BSLlabel = new JLabel("Enter Blood Sugar Level:: ");
	private JTextField BSLvalue = new JTextField(3);
	private JButton enterButton = new JButton("Go");
	private JTextField BSLband = new JTextField(15);
	private JLabel HormoneLabel = new JLabel("Hormone Injected:: ");
	private JTextField HormoneField = new JTextField(15);
	
	public SimulatorView(){
		
		JPanel simulatorPanel = new JPanel();
		
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(450,600);
		
		simulatorPanel.add(BSLlabel);
		simulatorPanel.add(BSLvalue);
		simulatorPanel.add(enterButton);
		simulatorPanel.add(BSLband);
		simulatorPanel.add(HormoneLabel);
		simulatorPanel.add(HormoneField);
		
		this.add(simulatorPanel);
		
	}
	
	public int getBSLvalue() {
		return Integer.parseInt(BSLvalue.getText());
	}
	
	public String getBSLband() {
		return BSLband.toString();
	}
	
	public void setBSLband(String band) {
		BSLband.setText(band);
	}
	
	public void addSimulatorListener(ActionListener listenForEnterButton) {
		enterButton.addActionListener(listenForEnterButton);
	}
	
	public void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}

}
