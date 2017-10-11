package com.yash.serviceimpl;

import com.yash.dao.UserDetailsDao;
import com.yash.daoimpl.UserDetailsDaoImpl;
import com.yash.model.UserDetails;
import com.yash.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDetailsDao userDetailsDao = null;

	public UserServiceImpl() {
		userDetailsDao = new UserDetailsDaoImpl();
	}

	@Override
	public boolean register(UserDetails userDetails) {
		return userDetailsDao.insertUser(userDetails);

	}

	@Override
	public UserDetails getUserById(String loginName) {
		return userDetailsDao.getUserById(loginName);
	}

}
