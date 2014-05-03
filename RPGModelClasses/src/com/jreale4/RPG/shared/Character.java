package com.jreale4.RPG.shared;

import java.util.ArrayList;
//Character has level, attacks, items, equipment, picture
public class Character {
	int Level; //Character's level.....duh
	ArrayList<Attack> AttackList = new ArrayList<Attack>(); //List of attacks a character has
	ArrayList<Item> ItemList = new ArrayList<Item>(); //List of Items a character has
	ArrayList<Equipment> EquipList = new ArrayList<Equipment>(); //List of equipment a character has
	//something for picture

	public int getLevel(){
		//returns the level of the character
		return this.Level;
	}

	public int getNumAttacks(){
		// return how many attacks the character has
		return AttackList.size();
	}
	
	public int getNumEquip(){
		return EquipList.size();
	}
	
	public int getNumItems(){
		// return how many items a character has
		return ItemList.size();
	}
	
	public Attack getAttack(int spot){
		
		return AttackList.get(spot);
	}

	public void addAttackToList(Attack attack){
		//adds an attack to character's list
		AttackList.add(attack);
	}
	
	public Equipment getEquip(int spot){
		return EquipList.get(spot);
	}
	
	public void addEquipToList(Equipment equip){
		EquipList.add(equip);
	}
	
	public Item getItem(int spot){
		return ItemList.get(spot);
	}
	
	public void addItemToList(Item i){
		ItemList.add(i);
	}
}