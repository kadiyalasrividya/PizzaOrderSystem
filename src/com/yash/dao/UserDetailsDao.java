package com.yash.dao;

import com.yash.model.UserDetails;

public interface UserDetailsDao {
	
	public boolean insertUser(UserDetails userDetails);
	public boolean isUserExist(UserDetails UserDetails);
	public UserDetails getUserById(String loginName);
}
