package com.demo.model;

public class MyUser {
	private String user_name;
	private String password;
	public MyUser() {
		super();
	}
	public MyUser(String user_name, String password) {
		super();
		this.user_name = user_name;
		this.password = password;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "MyUser [user_name=" + user_name + ", password=" + password + "]";
	}
	
}
