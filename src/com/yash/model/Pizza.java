package com.yash.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Pizza {
	@Id
	@GeneratedValue
	private int id;
	private String size;
	private String pizzaType;
	private double price;
	@OneToMany
	@JoinTable(name = "pizza_toppings")
	private List<Toppings> toppings;
	
	
	public Pizza(String pizzaType, String size, double price ) {
		this.pizzaType = pizzaType;
		this.size= size;
		this.price = price;
	}

	public List<Toppings> getToppings() {
		return toppings;
	}

	public void setToppings(List<Toppings> toppings) {
		this.toppings = toppings;
	}

	public String getPizzaType() {
		return pizzaType;
	}

	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}

	public int getId() {
		return id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}
