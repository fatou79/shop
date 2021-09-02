package com.service;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("shoes") && password.equals("size");
	}

}
