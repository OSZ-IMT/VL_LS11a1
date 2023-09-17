package de.oszimt.fian.hase.model.customer;

import de.oszimt.fian.hase.model.HaseGmbHManagement;

import java.util.ArrayList;

public class CustomerMgmt implements IntCustomerMgmt{

    private final HaseGmbHManagement model;

    public CustomerMgmt(HaseGmbHManagement model) {
        this.model = model;
    }

    //
    // implementation of interface IntCustomerMgmt
    //
    //

    @Override
    public boolean add(Customer customer) {
        return false;

    }

    @Override
    public Customer get(int id) {
        return null;
    }

    @Override
    public ArrayList<Customer> getAll() {
        System.err.println("Wird erst in A3.1 implementiert");
        return new ArrayList<>();
    }

    @Override
    public boolean update(Customer customer) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public HaseGmbHManagement getModel() {
        return null;
    }

    @Override
    public int getNextFreeId() {
        return 0;
    }

    public void loadData() {

    }
}
