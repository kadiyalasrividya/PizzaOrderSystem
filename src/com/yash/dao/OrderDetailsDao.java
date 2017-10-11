package com.yash.dao;

import java.util.List;
import com.yash.model.OrderDetails;
import com.yash.model.Pizza;

public interface OrderDetailsDao {
	
	public List<Pizza> showAllPizza();
	public List<Pizza> showAllToppings();
	public OrderDetails insertOrder(OrderDetails order);
	public void deleteOrder(OrderDetails order);
	

}
