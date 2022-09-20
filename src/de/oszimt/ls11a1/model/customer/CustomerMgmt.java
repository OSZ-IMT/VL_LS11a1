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

    /**
     * Gibt den Kunden anhand seiner ID (getID) zurück.
     * @param id, CustomerID
     * @return Customer
     */
    public Customer get(int id) {
        return customers[id];
    }

    public int size() {
        return customers.length;
    }

    /**
     * 1Stern: Gibt die nächste freie ID für einen neuen Kunden zurück, keine ID darf doppelt vorkommen
     * 3Stern: Berücksichtigung von Löschungen. Es sollen zusätzlich zur 1Stern Aufgabe keine ID Lücken entstehen.
     * @return ID
     */
    public int getNextFreeID(){
        return customers.length;
    }

    /**
     * Notwendig für Schleifenaufrufe for und foreach
     * @return Iterator
     */
    public Iterator<Customer> iterator() {
        // bei der ArrayList einfach customers.iterator(); verwenden
        return Arrays.stream(customers).iterator();
    }
}
