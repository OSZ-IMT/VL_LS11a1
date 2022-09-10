/*
 * Created on 21.05.2022 by Kay Patzwald (patzwald@oszimt.de)
 */
package de.oszimt.ls11a1.controller;

/**
 * @author Kay Patzwald (patzwald@oszimt.de)
 *
 */
public class ViewCustomersController extends BaseController {

	/**
	 * @param controller
	 */
	public ViewCustomersController(MainController controller) {
		super("viewCustomers","Alle Kunden anzeigen",controller);
	}

	@Override
	protected void initController() {
		initView();
	}

	@Override
	protected void initController(Object data) {	}

}
