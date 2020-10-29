package com.burger.customer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter

@Document
public class customer {

	
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Ingredients getIngredients() {
		return ingredients;
	}
	public void setIngredients(Ingredients ingredients) {
		this.ingredients = ingredients;
	}
	public CustomerInfo getCustomerinfo() {
		return customerinfo;
	}
	public void setCustomerinfo(CustomerInfo customerinfo) {
		this.customerinfo = customerinfo;
	}
	@Id
	private String orderNumber;
	private Ingredients ingredients;
	private CustomerInfo customerinfo;
	
	
	
}
