package model.implementation;

import model.util.Address;

public class Customer {
	private String ID;
	private String fullName;
	private Address address;

	public Customer(String ID, String fullName, Address address) {
		this.ID = ID;
		this.fullName = fullName;
		this.address = address;
	}

}
