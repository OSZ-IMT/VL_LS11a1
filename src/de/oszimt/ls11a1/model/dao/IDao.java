/*
 * Created on 01.05.2022 by Kay Patzwald
 */
package de.oszimt.ls11a1.model.dao;

import java.util.ArrayList;

import de.oszimt.ls11a1.model.Customer;

/**
 * Interface for the Data Access Object
 * @author Kay Patzwald
 */
public interface IDao {
	
	/**
	 * Save the customer to dao
	 * @param newCustomer
	 */
	void saveCustomer(Customer newCustomer);
  
	/**
	 * Loads a customer with a given id
	 * @param id
	 * @return Customer
	 */
	Customer getCustomer(int id);
	
	/**
	 * Returns a list with all customers in the db
	 * @return {@link ArrayList}
	 */
	ArrayList<Customer> getCustomers();
	
	/**
	 * Modify the attributes of a customer
	 * @param customer
	 */
	boolean modifyCustomer(Customer customer);
	
	int getLastCustomerID();
}
