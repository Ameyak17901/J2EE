package com.demo.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private int addrid;
	private String street;
	private String city;
	private String state;
	public Address() {
		super();
	}
	
	public Address(int addrid,String street, String city,String state) {
		super();
		this.addrid = addrid;
		this.street = street;
		this.city = city;
		this.state = state; 
	}
	public int getAddrid() {
		return addrid;
	}
	public void setAddrid(int addrid) {
		this.addrid = addrid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [addrid=" + addrid + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	
	
}
