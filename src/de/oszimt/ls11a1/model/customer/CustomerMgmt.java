package de.oszimt.ls11a1.model.customer;

import java.util.Arrays;
import java.util.Iterator;

public class CustomerMgmt implements Iterable<Customer>{

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

    public Iterator<Customer> iterator() {
        // bei der ArrayList einfach customers.iterator(); verwenden
        return Arrays.stream(customers).iterator();
    }
}
