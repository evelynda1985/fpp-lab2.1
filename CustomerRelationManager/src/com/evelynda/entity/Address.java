package com.evelynda.entity;


public class Address {
	
	private String street;
	private String state;
	private String zip;
	private String country;
	
	
	
	public Address() {	}

	public Address(String street, String state, String zip, String country) {
		this.street = street;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", state=" + state + ", zip=" + zip + ", country=" + country + "]";
	}
	
		

}
