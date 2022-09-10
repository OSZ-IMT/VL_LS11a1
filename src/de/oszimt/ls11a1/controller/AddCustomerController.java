/*
 * Created on 21.05.2022 by Kay Patzwald (patzwald@oszimt.de)
 */
package de.oszimt.ls11a1.controller;

/**
 * @author Kay Patzwald (patzwald@oszimt.de)
 *
 */
public class AddCustomerController extends BaseController {

	/**
	 * @param controller
	 */
	public AddCustomerController(MainController controller) {
		super("addCustomer","Kunde hinzufügen",controller);
	}

	@Override
	protected void initController() {
		initView();
	}

	@Override
	protected void initController(Object data) {	}

}
