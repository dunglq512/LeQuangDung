package com.hus.login;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "login", eager = true)
public class Login {
	private String username = null;
	private String password = null;
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
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
	
	public String check1(){
		if(username.equals("dunglq") && password.equals("anhdung123"))
			return "NewFile";
		else{
			
			return "0";
		}
		
	}
}
