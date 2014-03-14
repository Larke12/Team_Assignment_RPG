package com.jreale4.RPG.server;
	//Character has level, experience, list of attacks, items, picture
public class Character {
	int Level;
	int experience;
	//something for attacks
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
}