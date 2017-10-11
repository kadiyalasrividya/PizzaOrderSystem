package com.yash.service;

import com.yash.model.OrderDetails;

public interface OrderService {
	public OrderDetails create(OrderDetails order);
	public void deleteOrder(OrderDetails order);

}
