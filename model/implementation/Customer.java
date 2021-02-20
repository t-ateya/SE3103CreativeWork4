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

	@Override
	public String toString() {
		return "Customer{" + "ID=" + ", FullName=" + fullName + ", Address" + address + "}\n";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

}
