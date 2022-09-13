/*
 * Created on 21.05.2022 by Kay Patzwald (patzwald@oszimt.de)
 */
package de.oszimt.ls11a1.controller.customer;

import de.oszimt.ls11a1.controller.BaseController;
import de.oszimt.ls11a1.controller.MainController;

/**
 * @author Kay Patzwald (patzwald@oszimt.de)
 *
 */
public class RemoveCustomerController extends BaseController {

	public RemoveCustomerController(MainController controller) {
		super("removeCustomer","Kunde löschen",controller);
	}

	@Override
	protected void initController() {
		initView();
	}

	@Override
	protected void initController(Object... data) {}

	public void removeCustomer(int id){
		getModel().getCustomers().remove(getModel().getCustomers().get(id));
	}

}
