package com.jreale4.RPG.shared;

import java.util.List;

public class Hero extends Character{
	int experience=0;
	
	public Hero(){
		super.Level=1;
	}
	
	public void generateHero(List<Integer> atk, List<Integer> equip, List<Integer> item){
		for(int i=1; i<=atk.get(0); i+=2){
			Attack attack = new Attack(MoveType.locationOf(atk.get(i)), Move.locationOf(atk.get(i+1)));
			super.addAttackToList(attack);
		}
		
		if(equip.size()>=1){
			for(int i=1; i<=equip.get(0); i+=2){
				super.EquipList.add(new Equipment(EquipmentType.locationOf(equip.get(i)), equip.get(i+1)));
			}
		}
		
		if(item.size()>=1){
			for(int i=1;i<=item.get(0);i++){
				super.ItemList.add(new Item(ItemType.locationOf(item.get(i))));
			}
		}
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
