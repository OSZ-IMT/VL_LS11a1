package de.oszimt.aj3.contractMgmt.model.employee;

import de.oszimt.aj3.contractMgmt.model.Address;

public class Employee {
	private int id;
	private String firstname;
	private String lastname;
	private Address address;
	private String email;
	private String telephone;
	private static int nextID= 10000;   // this is only for internal usage.
	
	public Employee(String firstname, String lastname, 
			Address address, String email, String telephone) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.id = generateNewID();
		this.email = email;
		this.telephone = telephone;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + id + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", address=" + address + ", email=" + email + ", telephone=" + telephone + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if ( o instanceof Employee) {
			Employee tempEmployee = (Employee) o;
            return this.id == tempEmployee.getId();
		}
		return false;
	}
	
	

}
