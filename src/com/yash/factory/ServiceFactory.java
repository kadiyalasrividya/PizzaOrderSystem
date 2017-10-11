package com.yash.factory;

import com.yash.serviceimpl.UserServiceImpl;

public class ServiceFactory {
	public static UserServiceImpl getUserServiceImpl(){
		return new UserServiceImpl();
	}

}
