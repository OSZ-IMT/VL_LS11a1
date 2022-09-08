/*
 * Created on 29.06.2022 by Kay Patzwald (patzwald@oszimt.de)
 */
package de.oszimt.ls11a1.controller;

import java.util.ArrayList;

import de.oszimt.ls11a1.model.Customer;
import de.oszimt.ls11a1.view.ViewCustomersPanel;

/**
 * @author Kay Patzwald (patzwald@oszimt.de)
 *
 */
public class ViewCustomersController extends BaseController {
	private ViewCustomersPanel panel;
	private ArrayList<Customer> customers;
	
	/**
	 * Creates a new ViewCustomersController
	 * @param mainController
	 */
	public ViewCustomersController(MainController mainController) {
		super(mainController);
	}

	@Override
	protected void initView() {
		panel = new ViewCustomersPanel(this);
		controller.getMainWindow().setActivePanel("Alle Kunden anzeigen", panel);
		panel.getBackButton().addActionListener(l -> backButtonPressed());

		for (Customer c: customers) {
			panel.getCustomerTable().append(c.toString());
			panel.getCustomerTable().append(System.getProperty("line.separator"));
		}
	}

	private void backButtonPressed() {
		System.out.println("Back button pressed");
		controller.setController("mainView");
	}

	@Override
	protected void initController() {
		initModel();
		initView();
	}

	@Override
	protected void initModel() {
		customers = controller.getDao().getCustomers();
	}

	@Override
	protected void initController(Object data) {
		// TODO Auto-generated method stub
		
	}
	

}
