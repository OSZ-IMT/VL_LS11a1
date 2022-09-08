/*
 * Created on 21.05.2022 by Kay Patzwald (patzwald@oszimt.de)
 */
package de.oszimt.ls11a1.controller;

import de.oszimt.ls11a1.view.MainViewPanel;

/**
 * @author Kay Patzwald (patzwald@oszimt.de)
 *
 */
public class MainViewController extends BaseController {
	private MainViewPanel panel;
	
	/**
	 * @param controller
	 */
	public MainViewController(MainController controller) {
		super(controller);
	}

	@Override
	protected void initView() {
		panel = new MainViewPanel();
		
		controller.getMainWindow().setActivePanel("Hauptmenü", panel);

		panel.getBtnViewCustomers().addActionListener(l -> viewCustomersAction());
	}

	private void viewCustomersAction() {
		System.out.println("viewCustomersAction()");
		controller.setController("viewCustomers");
		//controller.setController(new ViewCustomerController(controller));
	}

	@Override
	protected void initController() {
		initView();
	}

	@Override
	protected void initModel() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void initController(Object data) {
		// TODO Auto-generated method stub
		
	}

}
