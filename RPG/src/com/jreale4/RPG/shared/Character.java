package com.jreale4.RPG.shared;

import java.util.ArrayList;
	//Character has level, experience, list of attacks, items, picture
public class Character {
	int Level=0;
	int experience=0;
	Attack strike = new Attack(MoveType.physical, Move.slash);
	ArrayList<Attack> AttackList = new ArrayList<Attack>();
	//something for items
	//something for picture
	
	public int getLevel(){
		return this.Level;
	}
	
	public int getExp(){
		return this.experience;
	}
	
	public int getNumAttacks(){
		// return the length of the attacks variable
		return -1;
	}
	
	public int getNumItems(){
		// return the length of the items variable
		return -1;
	}
	
	public void addAttackToList(Attack attack){
		AttackList.add(attack);
	}
}