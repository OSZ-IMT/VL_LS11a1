package de.oszimt.fian.hase.model.customer;
import de.oszimt.fian.hase.model.HaseGmbHManagement;

import java.util.ArrayList;

public interface IntCustomerMgmt {
	
	/**
	 * Add a new customer 
	 * @param customer
	 */
	boolean add(Customer customer);
  
	/**
	 * Returns the customer whose ID was passed as a parameter
	 * @param id
	 * @return Customer object
	 */
	Customer get(int id);
	
	/**
	 * Returns a list with all customers
	 * @return {@link ArrayList}
	 */
	ArrayList<Customer> getAll();
	
	/**
	 * Replaces an existing customer with the customer 
	 * which was transfered as a parameter
	 * @param customer
	 * @return true if it was successful, else false
	 */
	boolean update(Customer customer);
	
	/**
	 * Removes an existing customer
	 * @param id
	 * @return true if it was successful, false otherwise
	 */
	boolean delete(int id);

	/**
	 * Return the base model
	 * @return base model
	 */
	HaseGmbHManagement getModel();

	/**
	 * Load the data
	 */
	void loadData();

	/**
	 * Return the next free id
	 * @return next id
	 */
	int getNextFreeId();

	/**
	 * Return the numbers of customer
	 * @return size
	 */
	int size();

}
