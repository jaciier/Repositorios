package com.hoteles.certifications.model;

public class LoginModel {
	private String passwoord;
	private String user;
	
	public LoginModel(String user, String passwoord) {
		this.user = user;
		this.passwoord = passwoord;
	}
	
	public String getUser() {
		
		return user;
	}
	public String getPasswoord() {
		
		return passwoord;
	}
	
	public void setUser(String User) {
		this.user = User;
	}
	public void setPasswoord(String Passwoord) {
		this.user = Passwoord;
	}
}
