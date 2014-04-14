package com.jreale4.RPG.shared;

import java.io.Serializable;

public class User implements Serializable {	
	//private int userId;
	private String userName;
	private String password;

	public User() {

	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	//	public void storeHero(Hero hero){
	//		this.Player= hero;
	//	}
}
