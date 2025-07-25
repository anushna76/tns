package com.tnsif.customer;

public class Customer {
	private int customerID;
	private String name;
	private String address;
	private int contact;
	public Customer(int customerID, String name, String address, int contact) {
		super();
		this.customerID = customerID;
		this.name = name;
		this.address = address;
		this.contact = contact;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", name=" + name + ", address=" + address + ", contact=" + contact
				+ "]";
	}
	

}
