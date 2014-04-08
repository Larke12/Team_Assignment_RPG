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
		int listsize= RandomProvider.getInstance().nextInt(10);
		ArrayList<Attack> atklst= new ArrayList<Attack>();
		for(int i=0;i<listsize;i++){
			Attack e= CreateRandAtk();
			atklst.add(e);
		}
		atklst=FlamencoRemover(atklst);
		//atklst=DuplicateRemover(atklst);
		return atklst;
	}
	private Attack CreateRandAtk(){
		Attack atk;
		int randtype= RandomProvider.getInstance().nextInt(10);
		int randmove= RandomProvider.getInstance().nextInt(2);

		atk= new Attack(MoveType.locationOf(randtype), Move.locationOf(randmove));
		return atk;
	}
	private ArrayList<Attack> FlamencoRemover(ArrayList<Attack> atklst) {
		ArrayList<Attack> temp= new ArrayList<Attack>();
		for(Attack a: atklst){
			temp.add(a);
		}
		for(Attack a: temp){
			if(a.getMoveType()==MoveType.flamenKick || a.getMoveType()==MoveType.flamenPunch || a.getMoveType()==MoveType.gigaFlamenBreak){
				atklst.remove(a);
			}
		}
		return atklst;
	}
		/*private ArrayList<Attack> DuplicateRemover(ArrayList<Attack> atklst){
			//TODO: FIX-UP
			ArrayList<Attack> temp= new ArrayList<Attack>();
			for(Attack a: atklst){
				temp.add(a);
			}
			for(Attack a: temp){
				for(int i=0;i<temp.size();i++){
					if(a.equals(atklst.get(i))){
						boolean didRemove=atklst.remove(a);
					}
				}
			}
			return atklst;
		}*/
	private ArrayList<Item> CreateItems(){
		int listsize=RandomProvider.getInstance().nextInt(10);
		ArrayList<Item> itemlst= new ArrayList<Item>();
		for(int i=0;i<listsize;i++){
			Item e= CreateRandItem();
			itemlst.add(e);
		}
		return itemlst;
	}
	private Item CreateRandItem(){
		Item item;
		int randItem=RandomProvider.getInstance().nextInt(3);
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
