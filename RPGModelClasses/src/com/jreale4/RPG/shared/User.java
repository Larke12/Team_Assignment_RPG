package com.jreale4.RPG.shared;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {	
	/**
	 * Randomly generated serial, delete at will! ~Ryan
	 */
	private static final long serialVersionUID = -1045119253086061997L;
	//private int userId;
	private String userName;
	private String password;
	private List<Integer> atk = new ArrayList<Integer>();
	private List<Integer> equip = new ArrayList<Integer>();
	private List<Integer> item = new ArrayList<Integer>();
	
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
		System.out.println("Attack Array: " + i);
		atk.add(i);
	}
	public List<Integer> getAttackArray(){
		return atk;
	}
	
	public void addToEquipArray(int i){
		System.out.println("Equip Array" + i);
		equip.add(i);
	}
	public List<Integer> getEquipArray(){
		return equip;
	}
	
	public void addToItemArray(int i){
		System.out.println("Item Array" + i);
		item.add(i);
	}
	public List<Integer> getItemArray(){
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
