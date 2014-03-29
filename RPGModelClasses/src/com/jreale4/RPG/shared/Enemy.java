package com.jreale4.RPG.shared;

import java.util.ArrayList;
import java.util.Random;

public class Enemy extends Character {
	
	public Enemy(int HeroLvl){
		this.AttackList=  CreateAttacks();
			//this.EquipList= CreateEquip();
		this.ItemList= CreateItems();
		this.Level= CreateLevel(HeroLvl);
	}
	
	private int CreateLevel(int level){
		float Lvl=level*(450/350);
		return (int)Lvl;
	}
	private ArrayList<Attack> CreateAttacks(){
		Random rand= new Random();
		int listsize= rand.nextInt(50)+1;
		ArrayList<Attack> atklst= new ArrayList<Attack>();
		for(int i=0;i<listsize;i++){
			Attack e= CreateRandAtk();
			atklst.add(e);
		}
		atklst=DuplicateRemover(atklst);
		return atklst;
	}
	private Attack CreateRandAtk(){
		Attack atk;
		Random rand= new Random();
		int randtype= rand.nextInt(10);
		int randmove= rand.nextInt(2);
		
		atk= new Attack(MoveType.locationOf(randtype), Move.locationOf(randmove));
		return atk;
	}
	private ArrayList<Attack> DuplicateRemover(ArrayList<Attack> atklst){
		//TODO: implement
		return atklst;
	}
	private ArrayList<Item> CreateItems(){
		Random rand= new Random();
		int listsize= rand.nextInt(10)+1;
		ArrayList<Item> itemlst= new ArrayList<Item>();
		for(int i=0;i<listsize;i++){
			Item e= CreateRandItem();
			itemlst.add(e);
		}
		
		return itemlst;
	}
	private Item CreateRandItem(){
		Item item;
		Random rand= new Random();
		int randItem= rand.nextInt(3)+1;
		item= new Item(ItemType.locationOf(randItem));
		return item;
	}
		//private ArrayList<Equipment> CreateEquip(){
		//	ArrayList<Equipment> equiplst= new ArrayList<Equipment>();
			
		//	return equiplst;
		//}
		
	// Randomize monster, selected monster uses a random moveset focused
	// around that type of move set (physical, all normal attacks. magic, 
	// magical moves based on their attribute
	
	
}
