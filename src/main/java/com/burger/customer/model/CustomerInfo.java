package com.burger.customer.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component @Getter @Setter
public class CustomerInfo {

	private String name;
	private String email;
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
