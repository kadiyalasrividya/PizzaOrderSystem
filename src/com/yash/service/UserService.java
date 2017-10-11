package com.yash.service;

import com.yash.model.UserDetails;

public interface UserService {
	public boolean register(UserDetails userDetails);
	public UserDetails getUserById(String loginName);

}
