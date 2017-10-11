package com.yash.test;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.yash.model.OrderDetails;
import com.yash.model.Pizza;
import com.yash.model.Toppings;
import com.yash.model.UserDetails;

public class TestApplication {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		UserDetails userDetails = new UserDetails(null, null, null, null, null, null);
		userDetails.setName("Srividya");
		userDetails.setContact("5154145501");
		userDetails.setAddress("16617 maple Street, Clive, IA, 50325");
		userDetails.setEmail("srividya@gmail.com");
		userDetails.setLoginName("srividya");
		userDetails.setPassword("srividya");
		
		Pizza pizza = new Pizza("Margherita", "small", 70);
		session.save(pizza);
		pizza = new Pizza("Margherita", "medium", 180);
		session.save(pizza);
		pizza = new Pizza("Margherita", "large", 330);
		session.save(pizza);
		pizza = new Pizza("Fresh Veggies", "small", 150);
		session.save(pizza);
		pizza = new Pizza("Fresh Veggies", "medium", 265);
		session.save(pizza);
		pizza = new Pizza("Fresh Veggies", "large", 425);
		session.save(pizza);
		pizza = new Pizza("Country Special", "small", 150);
		session.save(pizza);
		pizza = new Pizza("Country Special", "medium", 280);
		session.save(pizza);
		pizza = new Pizza("Country Special", "large", 450);
		session.save(pizza);
		pizza = new Pizza("farmhouse", "small", 175);
		session.save(pizza);
		pizza = new Pizza("farmhouse", "medium", 325);
		session.save(pizza);
		pizza = new Pizza("farmhouse", "large", 490);
		session.save(pizza);
		pizza = new Pizza("Green Mexican Wave", "small", 190);
		session.save(pizza);
		pizza = new Pizza("Green Mexican Wave", "medium", 350);
		session.save(pizza);
		pizza = new Pizza("Green Mexican Wave", "large", 520);
		session.save(pizza);
		pizza = new Pizza("Barbeque Chicken", "small", 190);
		session.save(pizza);
		pizza = new Pizza("Barbeque Chicken", "medium", 370);
		session.save(pizza);
		pizza = new Pizza("Barbeque Chicken", "large", 525);
		session.save(pizza);
		pizza = new Pizza("Chicken Mexicana", "small", 225);
		session.save(pizza);
		pizza = new Pizza("Chicken Mexicana", "medium", 390);
		session.save(pizza);
		pizza = new Pizza("Chicken Mexicana", "large", 540);
		session.save(pizza);
		pizza = new Pizza("Buffalo Chicken", "small", 270);
		session.save(pizza);
		pizza = new Pizza("Buffalo Chicken", "medium", 410);
		session.save(pizza);
		pizza = new Pizza("Buffalo Chicken", "large", 575);
		session.save(pizza);

		Toppings toppings = new Toppings("Olives", 20);
		session.save(toppings);
		toppings = new Toppings("Onions", 30);
		session.save(toppings);
		toppings = new Toppings("Crisp BellPeppers", 30);
		session.save(toppings);
		toppings = new Toppings("Golden Corn", 40);
		session.save(toppings);
		toppings = new Toppings("fresh Tomato", 45);
		session.save(toppings);
		toppings = new Toppings("Chunky Chicken", 50);
		session.save(toppings);
		toppings = new Toppings("Chicken Sausage", 55);
		session.save(toppings);
		toppings = new Toppings("Hot N Spicy Chicken", 60);
		session.save(toppings);
		toppings = new Toppings("Extra Cheese", 70);
		session.save(toppings);

		ArrayList<Pizza> pizzaList = new ArrayList<>();
		ArrayList<Toppings> toppingsList = new ArrayList<>();
		toppings = new Toppings("Hot N Spicy Chicken", 60);
		toppingsList.add(toppings);
		toppings = new Toppings("fresh Tomato", 45);
		toppingsList.add(toppings);
		pizza.setToppings(toppingsList);
		pizzaList.add(pizza);
		OrderDetails orderDetails = new OrderDetails();
		orderDetails.setUserDetails(userDetails);
		orderDetails.setTotal(70);
		orderDetails.setPizza(pizzaList);
		orderDetails.setStatus("Baking");

		session.save(userDetails);
		session.save(orderDetails);
		session.getTransaction().commit();

	}
}
