package model.util;

public class Address {
	private Street street;
	private String city;
	private String country;
	private int zipCode;

	public Address(Street street, String city, String country, int zipCode) {
		this.street = street;
		this.city = city;
		this.country = country;
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address{" + "street=" + street + ", City=" + city + ", Country=" + country + ", zipCode=" + zipCode
				+ "}";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Street getStreet() {
		return street;
	}

	public void setStreet(Street street) {
		this.street = street;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
}
