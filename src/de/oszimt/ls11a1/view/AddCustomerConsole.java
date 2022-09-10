package de.oszimt.ls11a1.view;

import de.oszimt.ls11a1.controller.BaseController;
import de.oszimt.ls11a1.model.Customer;

public class AddCustomerConsole implements IActualView{

    @Override
    public void init(BaseController controller) {
        String firstName = ConsoleHelper.input("Vorname");
        String lastName = ConsoleHelper.input("Nachname");
        String email = ConsoleHelper.input("E-Mail");
        String tel = ConsoleHelper.input("Telefon");

        Customer c = new Customer(controller.getModel().getCustomers().size(), lastName, firstName, email, tel);
        controller.getModel().getCustomers().addCustomer(c);
        System.out.printf("Kunde %s erstellt.\n",c.getCustomerID());

        controller.getMainController().setController("viewCustomers");

    }

    @Override
    public void init(BaseController controller, Object data) {
    }
}
