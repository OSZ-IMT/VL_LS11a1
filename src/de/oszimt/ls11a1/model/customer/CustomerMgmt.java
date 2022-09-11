package de.oszimt.ls11a1.model.customer;

public class CustomerMgmt {

    private final Customer[] customers;

    public CustomerMgmt(){
        customers = new Customer[3];
        customers[0] = new Customer(0, "Bellenbaum", "Mira", "mira.bellenbaum@gmail.com", "004930123456789");
        customers[1] = new Customer(1, "Gator", "Ali", "ali.gator@web.de", "004444123435446789");
        customers[2] = new Customer(2, "Ghurt", "Jo", "jo.ghurt@mailbox.org", "0049157653465");
    }

    public void add(Customer c) {
        customers[c.getCustomerID()] = c;
    }

    public Customer get(int id) {
        return customers[id];
    }

    public int size() {
        return customers.length;
    }
}
