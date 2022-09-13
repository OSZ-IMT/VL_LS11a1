/*
 * Created on 01.05.2022 by Kay Patzwald
 */
package de.oszimt.ls11a1.model.customer;

import de.oszimt.ls11a1.view.IView;

import java.util.ArrayList;

/**
 * Customer class
 * 
 * @author Kay Patzwald
 */
public class Customer {
	private final ArrayList<IView> views;
	private String lastname;
	private String firstname;
	private int id;
	private String tel;
	private String email;

	/**
	 * Constructor of Customer
	 * 
	 * @param id The ID of the customer
	 * @param lastname   The lastname of the customer
	 * @param firstname  The firstname of the customer
	 */
	public Customer(int id, String lastname, String firstname) {
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		views = new ArrayList<>();
	}

	/**
	 * Constructor of Customer
	 *
	 * @param id The ID of the customer
	 * @param lastname   The lastname of the customer
	 * @param firstname  The firstname of the customer
	 * @param email      The email of the customer
	 * @param tel        The tel of the customer
	 */
	public Customer(int id, String lastname, String firstname, String email, String tel) {
		this(id, lastname, firstname);
		this.email = email;
		this.tel = tel;
	}

	/** Fügt einen Observer ein und benachrichtigt diesen
	 * @param view
	 */
	public void addView(IView view) {
		views.add(view);
		view.refresh();
	}

	/**
	 * Getter for customerID.
	 * 
	 * @return Returns the customerID.
	 */
	public int getId() {
		return id;
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
		for (IView view : views) {
			view.refresh();
		}
	}

	/** Entfernt einen Observer
	 * @param view
	 */
	public void removeView(IView view) {
		views.remove(view);
	}

	/**
	 * Setter for customerID.
	 * 
	 * @param id The customerID to set.
	 */
	public void setId(int id) {
		this.id = id;
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
				", customerID=" + id +
				", tel='" + tel + '\'' +
				", email='" + email + '\'' +
				'}';
	}
}
