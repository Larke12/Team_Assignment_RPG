package com.jreale4.RPG.shared;

import java.util.ArrayList;

public class Enemy extends Character {
	
	public Enemy(int Level, ArrayList<Attack> attacklist, ArrayList<Item> itemlist, ArrayList<Equipment> equiplist){
		this.Level=Level;
		this.AttackList=attacklist;
		this.ItemList=itemlist;
		this.EquipList=equiplist;
	}
}
