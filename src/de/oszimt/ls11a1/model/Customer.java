/*
 * Created on 01.05.2022 by Kay Patzwald
 */
package de.oszimt.ls11a1.model;

import java.util.ArrayList;

import de.oszimt.ls11a1.view.View;

/**
 * Customer class
 * 
 * @author Kay Patzwald
 */
public class Customer {
	private final ArrayList<View> views;
	private String lastname;
	private String firstname;
	private int customerID;
	private String tel;
	private String email;

	/**
	 * Constructor of Customer
	 * 
	 * @param customerID The ID of the customer
	 * @param lastname   The lastname of the customer
	 * @param firstname  The firstname of the customer
	 */
	public Customer(int customerID, String lastname, String firstname) {
		this.customerID = customerID;
		this.lastname = lastname;
		this.firstname = firstname;
		views = new ArrayList<>();
	}

	/**
	 * Constructor of Customer
	 *
	 * @param customerID The ID of the customer
	 * @param lastname   The lastname of the customer
	 * @param firstname  The firstname of the customer
	 * @param email      The email of the customer
	 * @param tel        The tel of the customer
	 */
	public Customer(int customerID, String lastname, String firstname, String email, String tel) {
		this(customerID, lastname, firstname);
		this.email = email;
		this.tel = tel;
	}

	/** Fügt einen Observer ein und benachrichtigt diesen
	 * @param view
	 */
	public void addView(View view) {
		views.add(view);
		view.refresh();
	}

	/**
	 * Getter for customerID.
	 * 
	 * @return Returns the customerID.
	 */
	public int getCustomerID() {
		return customerID;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Getter for firstname.
	 * 
	 * @return Returns the firstname.
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * Getter for lastname.
	 * 
	 * @return Returns the lastname.
	 */
	public String getLastname() {
		return lastname;
	}

	/** Benachrichtigt alle Observer
	 * 
	 */
	public void notifyViews() {
		for (View view : views) {
			view.refresh();
		}
	}

	/** Entfernt einen Observer
	 * @param view
	 */
	public void removeView(View view) {
		views.remove(view);
	}

	/**
	 * Setter for customerID.
	 * 
	 * @param customerID The customerID to set.
	 */
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
		notifyViews();
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Setter for firstname.
	 * 
	 * @param firstname The firstname to set.
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
		notifyViews();
	}

/**
	 * Setter for lastname.
	 * 
	 * @param lastname The lastname to set.
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
		notifyViews();
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"lastname='" + lastname + '\'' +
				", firstname='" + firstname + '\'' +
				", customerID=" + customerID +
				", tel='" + tel + '\'' +
				", email='" + email + '\'' +
				'}';
	}
}
