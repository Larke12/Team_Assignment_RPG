package com.jreale4.RPG.shared;

import java.util.ArrayList;
	//Character has level, list of attacks, items, picture
public class Character {
	int Level=0;
	ArrayList<Attack> AttackList = new ArrayList<Attack>();
	ArrayList<Item> ItemList = new ArrayList<Item>();
	//something for picture
	
	public int getLevel(){
		return this.Level;
	}
	
	public int getNumAttacks(){
		// return the length of the attacks variable
		return AttackList.size();
	}
	
	public int getNumItems(){
		// return the length of the items variable
		return ItemList.size();
	}
	
	public void addAttackToList(Attack attack){
		AttackList.add(attack);
	}
}