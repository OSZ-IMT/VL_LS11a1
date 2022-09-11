package de.oszimt.ls11a1.model;

import de.oszimt.ls11a1.model.customer.Customer;
import de.oszimt.ls11a1.model.customer.CustomerMgmt;

public class Model {

    private final CustomerMgmt customers;

    public Model() {
        this.customers = new CustomerMgmt();

        customers.add(new Customer(0, "Bellenbaum", "Mira", "mira.bellenbaum@gmail.com", "004930123456789"));
        customers.add(new Customer(1, "Gator", "Ali", "ali.gator@web.de", "004444123435446789"));
        customers.add(new Customer(2, "Ghurt", "Jo", "jo.ghurt@mailbox.org", "0049157653465"));
    }

    public CustomerMgmt getCustomers() {
        return customers;
    }
}
