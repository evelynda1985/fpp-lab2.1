package com.evelynda.entity;

public class Customer {
	
	private String firstName;
	private String lastName;
	private int socSecurityNum;
	private Address billingAddres;
	private Address shippingAddress;
	
	//public Customer() {	}


	public Customer(String firstName, String lastName, int socSecurityNum, Address billingAddres,
			Address shippingAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socSecurityNum = socSecurityNum;
		this.billingAddres = billingAddres;
		this.shippingAddress = shippingAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSocSecurityNum() {
		return socSecurityNum;
	}

	public void setSocSecurityNum(int socSecurityNum) {
		this.socSecurityNum = socSecurityNum;
	}

	public Address getBillingAddres() {
		return billingAddres;
	}

	public void setBillingAddres(Address billingAddres) {
		this.billingAddres = billingAddres;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", socSecurityNum=" + socSecurityNum
				+ "\n "+ " billingAddres=" + billingAddres + "\n " +  " shippingAddress=" + shippingAddress + "]";
	}
	
	

}
