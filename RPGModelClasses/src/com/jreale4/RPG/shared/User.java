package com.jreale4.RPG.shared;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {	
	/**
	 * Randomly generated serial, delete at will! ~Ryan
	 */
	private static final long serialVersionUID = -1045119253086061997L;
	//private int userId;
	private String userName;
	private String password;
	private ArrayList<Integer> atk;
	private ArrayList<Integer> equip;
	private ArrayList<Integer> item;
	
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
	
	public void addToAttackArray(int i){
		atk.add(i);
	}
	public ArrayList<Integer> getAttackArray(){
		return atk;
	}
	
	public void addToEquipArray(int i){
		equip.add(i);
	}
	public ArrayList<Integer> getEquipArray(){
		return equip;
	}
	
	public void addToItemArray(int i){
		item.add(i);
	}
	public ArrayList<Integer> getItemArray(){
		return item;
	}
	/*
 		public Hero getHero(){
			return Player;
		}
		public void storeHero(Hero hero){
			this.Player= hero;
		}
	*/
}
