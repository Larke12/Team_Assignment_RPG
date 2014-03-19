package com.jreale4.RPG.shared;

import java.util.ArrayList;

public class CharacterTest {
	private Hero hero1;
	
	private int lvl;
	
	private int exp;
	
	private Attack attack1;
	private Attack attack2;
	private Attack attack3;
	private Attack attack4;
	ArrayList<Attack> a = new ArrayList<Attack>();
	
	private Item potion;
	private Item attUp;
	private Item acid;
	ArrayList<Item> i = new ArrayList<Item>();
	
	private Equipment helmet;
	private Equipment torso;
	private Equipment bracers;
	private Equipment pants;
	private Equipment boots;
	private Equipment gloves;
	private Equipment pack;
	ArrayList<Equipment> e = new ArrayList<Equipment>();
	
	protected void setUp(){
		
		lvl=1;
		
		exp=900;
		
		attack1= new Attack(MoveType.physical, Move.slash);
		attack2= new Attack(MoveType.water, Move.magic);
		attack3= new Attack(MoveType.physical, Move.stab);
		attack4= new Attack(MoveType.earth, Move.magic);
		a.add(attack1);
		a.add(attack2);
		a.add(attack3);
		a.add(attack4);
		
		potion= new Item(ItemType.health);
		attUp= new Item(ItemType.boost);
		acid= new Item(ItemType.poison);
		i.add(potion);
		i.add(attUp);
		i.add(acid);
		
		helmet= new Equipment(EquipmentType.head, 1);
		torso= new Equipment(EquipmentType.chest, 2);
		bracers= new Equipment(EquipmentType.arms, 1);
		pants= new Equipment(EquipmentType.legs, 2);
		boots= new Equipment(EquipmentType.feet, 3);
		gloves= new Equipment(EquipmentType.hands, 2);
		pack= new Equipment(EquipmentType.back, 3);
		e.add(helmet);
		e.add(torso);
		e.add(bracers);
		e.add(pants);
		e.add(boots);
		e.add(gloves);
		e.add(pack);
		
		hero1= new Hero(lvl, exp+10, a, i, e);
	}
	
	public void testLvlUp(){
		hero1.LevelUp(hero1.experience);
	}
}
