package com.chick.model.object;

import com.chick.model.ab.Profile;

public class Account extends Profile {
	
	private String username ;
	private String password;
	public Account(String id, String name, String username, String password) {
		super(id, name);
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
	
}
