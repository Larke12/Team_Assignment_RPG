package com.jreale4.RPG.shared;

import java.util.ArrayList;

public class Enemy extends Character {
	
	public Enemy(int Level, ArrayList<Attack> attacklist, ArrayList<Item> itemlist, ArrayList<Equipment> equiplist){
		this.Level=Level;
		this.AttackList=attacklist;
		this.ItemList=itemlist;
		this.EquipList=equiplist;
	}
	
	// Randomize monster, selected monster uses a random moveset focused
	// around that type of move set (physical, all normal attacks. magic, 
	// magical moves based on their attribute
}
