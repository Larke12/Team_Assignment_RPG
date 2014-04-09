package com.jreale4.RPG.shared;

public class User {
	private String userName;
	private String password;
	private Hero Player= new Hero(0, 0, null, null, null);

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

	public void storeHero(Hero hero){
		this.Player= hero;
	}
}