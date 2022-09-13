/*
 * Created on 21.05.2022 by Kay Patzwald (patzwald@oszimt.de)
 */
package de.oszimt.ls11a1.controller.customer;

import de.oszimt.ls11a1.controller.BaseController;
import de.oszimt.ls11a1.controller.MainController;
import de.oszimt.ls11a1.model.customer.Customer;

/**
 * @author Kay Patzwald (patzwald@oszimt.de)
 *
 */
public class AddCustomerController extends BaseController {

	public AddCustomerController(MainController controller) {
		super("addCustomer","Kunde hinzufügen",controller);
	}

	@Override
	protected void initController() {
		initView();
	}

	@Override
	protected void initController(Object... data) {}

	public Customer addCustomer(String lastName, String firstName, String email, String tel){
		Customer c = new Customer(getModel().getCustomers().getNextFreeID(), lastName, firstName, email, tel);
		getModel().getCustomers().add(c);
		return c;
	}

}
