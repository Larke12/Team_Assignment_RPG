package com.jreale4.RPG.shared;

import java.io.Serializable;

public class User implements Serializable {	
	/**
	 * Randomly generated serial, delete at will! ~Ryan
	 */
	private static final long serialVersionUID = -1045119253086061997L;
	//private int userId;
	private String userName;
	private String password;
	private Hero Player;

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

	public Hero getHero(){
		return Player;
	}
	public void storeHero(Hero hero){
		this.Player= hero;
	}
}
