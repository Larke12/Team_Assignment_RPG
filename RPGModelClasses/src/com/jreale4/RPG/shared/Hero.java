package com.jreale4.RPG.shared;

import java.util.ArrayList;

public class Hero extends Character{
	int experience;
	
	public Hero(int Level, int exp, ArrayList<Attack> attacklist, ArrayList<Item> itemlist, ArrayList<Equipment> equiplist){
		this.Level=Level;
		this.experience=exp;
		this.AttackList=attacklist;
		this.ItemList=itemlist;
		this.EquipList=equiplist;
	}
	
	
	public int getExperience(){
		//returns Hero's exp
		return this.experience;
	}
	
	public void addExp(int expToAdd){
		//adds to Hero's exp
		experience+=expToAdd;
	}
	
	public void LevelUp(int exp){
		//if Hero has enough exp, level up
		// reqExpTolvlUp = Level x (4000/3)
		int req= (super.Level)*(4000/3);
		if((super.Level)==1){
			req=1000;
		}
		if(exp>=req){
			super.Level++;
		}
	}
	
}
