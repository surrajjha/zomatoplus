package com.thinkxfactor.zomatoplus.model;

public class Login {
	
	private Long name;
	private String password;
	public Long getName() {
		return name;
	}
	public void setName(Long name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Login(Long name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
