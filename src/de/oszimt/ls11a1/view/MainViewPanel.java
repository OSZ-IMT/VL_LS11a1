/*
 * Created on 19.05.2022 by Kay Patzwald (patzwald@oszimt.de)
 */
package de.oszimt.ls11a1.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author Kay Patzwald (patzwald@oszimt.de)
 *
 */
public class MainViewPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9156150296383517536L;
	private final JButton btnViewCustomers;
	
	private final JPanel main;
	
	public MainViewPanel() {
	
		main = new JPanel();
		main.setLayout(new BorderLayout());
		
		btnViewCustomers = new JButton("Alle Kunden anzeigen");
		main.add(btnViewCustomers, BorderLayout.WEST);
		
		add(main, BorderLayout.CENTER);
	}

	/**
	 * @return the btnViewCustomer
	 */
	public JButton getBtnViewCustomers() {
		return btnViewCustomers;
	}

}
