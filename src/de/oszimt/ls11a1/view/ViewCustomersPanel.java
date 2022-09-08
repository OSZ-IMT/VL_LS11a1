/*
 * Created on 29.06.2022 by Kay Patzwald (patzwald@oszimt.de)
 */
package de.oszimt.ls11a1.view;

import javax.swing.*;

import de.oszimt.ls11a1.controller.ViewCustomersController;

/**
 * @author Kay Patzwald (patzwald@oszimt.de)
 *
 */
public class ViewCustomersPanel extends JPanel implements View {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1153703845721494660L;

	private final ViewCustomersController controller;

	private JTextArea customerTable;

	private JButton backButton;

	/**
	 * Creates a new ViewCustomersPanel
	 * 
	 * @param controller The Controller of the view
	 */
	public ViewCustomersPanel(ViewCustomersController controller) {
		this.controller = controller;
		initComponents();
	}

	/** Getter for backButton
	 * @return the backButton
	 */
	public JButton getBackButton() {
		return backButton;
	}

	/**
	 * @return the customerTable
	 */
	public JTextArea getCustomerTable() {
		return customerTable;
	}

	/**
	 * Init all view components
	 */
	private void initComponents() {
		customerTable = new JTextArea();
		customerTable.setEditable(false);
		backButton = new JButton("Zurück");

		JScrollPane customerTableScrollPane = new JScrollPane(customerTable);

		// Add UI element to frame
		GroupLayout layout = new GroupLayout(this);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);

		layout.setHorizontalGroup(
				layout.createSequentialGroup().addComponent(customerTableScrollPane)
						.addGroup(layout.createParallelGroup().addComponent(backButton)));

		layout.setVerticalGroup(layout.createSequentialGroup().addGroup(
				layout.createParallelGroup().addComponent(customerTableScrollPane)
						.addGroup(layout.createSequentialGroup().addComponent(backButton))));
		layout.linkSize(SwingConstants.HORIZONTAL, backButton);

		this.setLayout(layout);
	}

	@Override
	public void refresh() {

	}
}
