package com.yash.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserDetails {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String address;
	private String contact;
	private String email;
	private String loginName;
	private String password;

	public UserDetails(String name, String contact, String address, String email, String loginName,
			String password) {
		this.name = name;
		this.contact = contact;
		this.address = address;
		this.email = email;
		this.loginName = loginName;
		this.password = password;
	}
	
	public UserDetails() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
