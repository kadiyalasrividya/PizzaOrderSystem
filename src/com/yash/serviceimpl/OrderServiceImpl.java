package com.yash.serviceimpl;

import com.yash.dao.OrderDetailsDao;
import com.yash.daoimpl.OrderDetailsDaoImpl;
import com.yash.model.OrderDetails;
import com.yash.service.OrderService;

public class OrderServiceImpl implements OrderService {
	
	private OrderDetailsDao orderDetailsDao = null;

	public OrderServiceImpl() {
	orderDetailsDao = new OrderDetailsDaoImpl();
	}

	@Override
	public OrderDetails create(OrderDetails order) {
		return orderDetailsDao.insertOrder(order);
		
	}

	@Override
	public void deleteOrder(OrderDetails order) {
		// TODO Auto-generated method stub
		
	}

}
