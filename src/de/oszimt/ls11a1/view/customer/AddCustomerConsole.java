package de.oszimt.ls11a1.view.customer;

import de.oszimt.ls11a1.controller.BaseController;
import de.oszimt.ls11a1.controller.customer.AddCustomerController;
import de.oszimt.ls11a1.helper.ConsoleHelper;
import de.oszimt.ls11a1.model.customer.Customer;
import de.oszimt.ls11a1.view.IActualView;

public class AddCustomerConsole implements IActualView {

    @Override
    public void init(BaseController controller, Object... data) {
        String firstName = ConsoleHelper.input("Vorname");
        String lastName = ConsoleHelper.input("Nachname");
        String email = ConsoleHelper.input("E-Mail");
        String tel = ConsoleHelper.input("Telefon");

        Customer c = ((AddCustomerController)controller).addCustomer(lastName, firstName, email, tel);
        System.out.printf("Kunde %s erstellt.\n",c.getId());

        controller.getMainController().setController("viewCustomers");

    }
}
