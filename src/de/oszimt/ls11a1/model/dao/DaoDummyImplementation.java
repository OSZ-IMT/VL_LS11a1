/*
 * Created on 20.05.2022 by Kay Patzwald (patzwald@oszimt.de)
 */
package de.oszimt.ls11a1.model.dao;

import java.util.ArrayList;

import de.oszimt.ls11a1.helper.Log;
import de.oszimt.ls11a1.model.Customer;

/**
 * @author Kay Patzwald (patzwald@oszimt.de)
 *
 */
public class DaoDummyImplementation implements IDao {

	private ArrayList<Customer> customerList;

	private int lastCustomerID;

	private DaoDummyImplementation() {
		initialize();
	}

	/**
	 * COMMENT missing
	 * 
	 * @return
	 */
	public static DaoDummyImplementation createDaoDummyImplementation() {
		return new DaoDummyImplementation();
	}

	private void initialize() {
		customerList = new ArrayList<>();
		lastCustomerID = 0;
		
		customerList.add(new Customer(++lastCustomerID, "Müller", "Anne", "anne.mueller@gmail.com", "004930123456789"));
		customerList.add(new Customer(++lastCustomerID, "Gator", "Ali", "ali.gator@web.de", "004444123435446789"));
		customerList.add(new Customer(++lastCustomerID, "Ghurt", "Jo", "jo.ghurt@mailbox.org", "0049157653465"));
		Log.debug("Initialize the DaoDummyImplementation");
	}

	@Override
	public void saveCustomer(Customer newCustomer) {
		newCustomer.setCustomerID(++lastCustomerID);
		customerList.add(newCustomer);
		Log.debug("Saved new customer with id: " + newCustomer.getCustomerID());
	}

	@Override
	public Customer getCustomer(int id) {
		for (Customer customer : customerList) {
			if (customer.getCustomerID() == id) {
				Log.debug("Returned customer with id: " + id);
				return customer;
			}
		}
		Log.debug("Found no customer with id: " + id);
		return null;
	}

	@Override
	public ArrayList<Customer> getCustomers() {
		Log.debug("Returned a list with all customers");
		return customerList;
	}

	@Override
	public boolean modifyCustomer(Customer customer) {
		if (customerList.contains(customer)) {
			customerList.remove(customer);
			customerList.add(customer);
			Log.debug("Modified customer with id: " + customer.getCustomerID());
			return true;
		}

		Log.debug(
				"Don't modify customer because I do not found a customer with id: "
						+ customer.getCustomerID());
		return false;

	}

	/**
	 * TODO Comment missing
	 * 
	 * @return the last used customer id
	 */
	@Override
	public int getLastCustomerID() {
		return lastCustomerID;
	}
}
