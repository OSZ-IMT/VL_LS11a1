package de.oszimt.ls11a1.model.customer;

public class CustomerMgmt {

    private final Customer[] customers;

    public CustomerMgmt(){
        customers = new Customer[3];
    }

    public void add(Customer c) {
        customers[c.getId()] = c;
    }

    public void remove(Customer c) {
        customers[c.getId()] = null;
    }

    public Customer get(int id) {
        return customers[id];
    }

    public int size() {
        return customers.length;
    }

    public int getNextFreeID(){
        return customers.length;
    }
}
