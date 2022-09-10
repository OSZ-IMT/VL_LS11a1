/*
 * Created on 21.05.2022 by Kay Patzwald (patzwald@oszimt.de)
 */
package de.oszimt.ls11a1.controller;

/**
 * @author Kay Patzwald (patzwald@oszimt.de)
 *
 */
public class ViewCustomerController extends BaseController {

	/**
	 * @param controller
	 */
	public ViewCustomerController(MainController controller) {
		super("viewCustomer","Kunde anzeigen",controller);
	}

	@Override
	protected void initController() {
	}

	@Override
	protected void initController(Object data) {
		initView();
		view.init(this, data);
	}

}
