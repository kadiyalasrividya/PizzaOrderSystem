package com.yash.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.yash.dao.OrderDetailsDao;
import com.yash.model.OrderDetails;
import com.yash.model.Pizza;
import com.yash.model.UserDetails;
import com.yash.util.HibernateUtil;

public class OrderDetailsDaoImpl implements OrderDetailsDao{

	@Override
	public OrderDetails insertOrder(OrderDetails order) {
		Session session=HibernateUtil.openSession();
		Transaction tx=null;
		try{
			tx=session.getTransaction();
			tx.begin();
			session.saveOrUpdate(order);
			tx.commit();
		}
		catch(HibernateException ex){
			if(tx!=null){
				tx.rollback();
			}
			ex.printStackTrace();
		}
		finally{
			session.close();
		}
		return order;
		
	}
	
	@Override
	public void deleteOrder(OrderDetails order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Pizza> showAllPizza() {
		List<Pizza> pizzaTypes = new ArrayList<>();

			pizzaTypes = new ArrayList<Pizza>();
			
			pizzaTypes.add( new Pizza( "Margherita", "small", 75.00d) );
			pizzaTypes.add( new Pizza("Margherita", "medium", 180.00d) );
			pizzaTypes.add( new Pizza( "Margherita", "large", 330.00d) );
			pizzaTypes.add( new Pizza( "Fresh Veggies", "small", 130.00d) );
			pizzaTypes.add( new Pizza( "Fresh Veggies", "medium", 265.00d) );
			pizzaTypes.add( new Pizza( "Fresh Veggies", "large",425.00d) );
			pizzaTypes.add( new Pizza( "Country Special", "small",150.00d) );
			pizzaTypes.add( new Pizza( "Country Special", "medium",280.00d) );
			pizzaTypes.add( new Pizza( "Country Special", "large",450.00d) );
			pizzaTypes.add( new Pizza( "Farmhouse", "small",175.00d) );
			pizzaTypes.add( new Pizza( "Farmhouse", "medium",325.00d) );
			pizzaTypes.add( new Pizza( "Farmhouse", "large",490.00d) );
			pizzaTypes.add( new Pizza( "Green Mexican Wave", "small",190.00d) );
			pizzaTypes.add( new Pizza( "Green Mexican Wave", "medium",350.00d) );
			pizzaTypes.add( new Pizza( "Green Mexican Wave", "large",520.00d) );
			pizzaTypes.add( new Pizza( "Barbeque Chicken", "small",210.00d) );
			pizzaTypes.add( new Pizza( "Barbeque Chicken", "medium",370.00d) );
			pizzaTypes.add( new Pizza( "Barbeque Chicken", "large",525.00d) );
			pizzaTypes.add( new Pizza( "Chicken Mexicana", "small",220.00d) );
			pizzaTypes.add( new Pizza( "Chicken Mexicana", "medium",390.00d) );
			pizzaTypes.add( new Pizza( "Chicken Mexicana", "large",540.00d) );
			pizzaTypes.add( new Pizza( "Buffalo chicken", "small",220.00d) );
			pizzaTypes.add( new Pizza( "Chicken Mexicana", "medium",410.00d) );
			pizzaTypes.add( new Pizza( "Chicken Mexicana", "large",575.00d) );
					
		return pizzaTypes;
	}

	@Override
	public List<Pizza> showAllToppings() {
		
		
		return null;
	}

}
