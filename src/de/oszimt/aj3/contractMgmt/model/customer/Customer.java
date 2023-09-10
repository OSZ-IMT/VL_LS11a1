package de.oszimt.aj3.contractMgmt.model.customer;

import de.oszimt.aj3.contractMgmt.model.Address;

import java.time.LocalDate;

public class Customer {
	private int id;
	private String firstname;
	private String lastname;
	private Address address;
	private LocalDate birthday;
	private String email;
	private static int nextID = 1009900;  // this is only for internal usage.
	
	public Customer(String firstname, String lastname, LocalDate birthday, String email,
			Address address) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.id = generateNewID();
		this.birthday = birthday;
		this.email = email;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	private int generateNewID() {
		return ++nextID;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + id + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", birthday=" + birthday + ", email=" + email + ", address=" + address + "]";
	}

	@Override
	public boolean equals(Object o) {
		if ( o instanceof Customer) {
			Customer tempCustomer = (Customer) o;
			if (this.id == tempCustomer.getId())
				return true;
		}
		return false;
	}
	
}
