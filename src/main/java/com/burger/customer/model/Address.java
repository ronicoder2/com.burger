package com.burger.customer.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component @Getter @Setter
public class Address {
private String Street;
private String zipCode;
private String country;
public String getStreet() {
	return Street;
}
public void setStreet(String street) {
	Street = street;
}
public String getZipCode() {
	return zipCode;
}
public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
}
