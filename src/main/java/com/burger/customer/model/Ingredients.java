package com.burger.customer.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component @Getter @Setter
public class Ingredients {

	public int getSalad() {
		return salad;
	}
	public void setSalad(int salad) {
		this.salad = salad;
	}
	public int getBacon() {
		return bacon;
	}
	public void setBacon(int bacon) {
		this.bacon = bacon;
	}
	public int getCheese() {
		return cheese;
	}
	public void setCheese(int cheese) {
		this.cheese = cheese;
	}
	public int getMeat() {
		return meat;
	}
	public void setMeat(int meat) {
		this.meat = meat;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	private int salad;
	private int bacon;
	private int cheese;
	private int meat;
	private float price;
}
