package com.jreale4.RPG.shared;

import java.util.ArrayList;

import junit.framework.TestCase;

public class HeroTest extends TestCase{
	private Hero hero1;

	private int lvl;

	private int exp;

	private Attack attack1;
	private Attack attack2;
	private Attack attack3;
	private Attack attack4;
	private Attack attack5;
	ArrayList<Attack> a = new ArrayList<Attack>();

	private Item potion;
	private Item attUp;
	private Item acid;
	ArrayList<Item> i = new ArrayList<Item>();

	private Equipment helmet;
	private Equipment torso;
	private Equipment bracers;
	private Equipment boots;
	ArrayList<Equipment> e = new ArrayList<Equipment>();

	protected void setUp(){

		lvl=1;

		exp=900;
		attack1 = new Attack(MoveType.slash, Move.physical);
		attack2 = new Attack(MoveType.aqua, Move.magic);
		attack3 = new Attack(MoveType.venta, Move.magic);
		attack4 = new Attack(MoveType.flamenKick, Move.physical);
		attack5 = new Attack(MoveType.mare, Move.magic);
		a.add(attack1);
		a.add(attack2);
		a.add(attack3);
		a.add(attack4);
		a.add(attack5);

		potion= new Item(ItemType.health);
		attUp= new Item(ItemType.boost);
		acid= new Item(ItemType.poison);
		i.add(potion);
		i.add(attUp);
		i.add(acid);

		helmet= new Equipment(EquipmentType.head, 1);
		torso= new Equipment(EquipmentType.torso, 2);
		bracers= new Equipment(EquipmentType.arms, 1);
		boots= new Equipment(EquipmentType.feet, 3);
		e.add(helmet);
		e.add(torso);
		e.add(bracers);
		e.add(boots);

		hero1= new Hero();
		hero1.AttackList.addAll(a);
		hero1.EquipList.addAll(e);
		hero1.ItemList.addAll(i);
		hero1.Level=lvl;
		hero1.experience=exp+10;
	}

	public void testLvlUp(){
		assertEquals(910, hero1.getExperience());
		hero1.LevelUp(hero1.experience);
		assertEquals(1, hero1.getLevel());

		hero1.addExp(100);
		assertEquals(1010, hero1.getExperience());
		hero1.LevelUp(hero1.experience);
		assertEquals(2, hero1.getLevel());
	}

	public void testGetMoveType(){
		assertEquals(MoveType.slash,attack1.getMoveType());
		assertEquals(MoveType.aqua,attack2.getMoveType());
		assertEquals(MoveType.venta,attack3.getMoveType());
		assertEquals(MoveType.flamenKick,attack4.getMoveType());
		assertEquals(MoveType.mare,attack5.getMoveType());
	}

	public void testGetMove(){
		assertEquals(Move.physical,attack1.getMove());
		assertEquals(Move.magic,attack3.getMove());
		// Test amount of attacks
		assertEquals(5, hero1.getNumAttacks());
		// Test adding an attack
		hero1.addAttackToList(attack5);
	}

	public void testGetPower(){
		assertEquals( (float)(1), attack1.getAttackPower(1));
		assertEquals( (float)(2.5), attack2.getAttackPower(1));
		assertEquals( (float)(2.5), attack3.getAttackPower(1));
		assertEquals( (float)(3), attack4.getAttackPower(1));
		assertEquals( (float)(5.5), attack5.getAttackPower(1));
	}

	public void testItemEffect(){
		assertEquals(5, hero1.ItemList.get(hero1.ItemList.indexOf(potion)).getItemEffect(hero1.Level));
		assertEquals(3, hero1.ItemList.get(hero1.ItemList.indexOf(attUp)).getItemEffect(hero1.Level));
		assertEquals(-5, hero1.ItemList.get(hero1.ItemList.indexOf(acid)).getItemEffect(hero1.Level));
		// Test to get amount of items
		assertEquals(3, hero1.getNumItems());
	}

	public void testEquipLvl(){
		assertEquals(1, hero1.EquipList.get(hero1.EquipList.indexOf(helmet)).getEquipLvl());
		assertEquals(2, hero1.EquipList.get(hero1.EquipList.indexOf(torso)).getEquipLvl());
		assertEquals(1, hero1.EquipList.get(hero1.EquipList.indexOf(bracers)).getEquipLvl());
		assertEquals(3, hero1.EquipList.get(hero1.EquipList.indexOf(boots)).getEquipLvl());
	}

	public void testEquipType(){
		assertEquals(EquipmentType.head, hero1.EquipList.get(hero1.EquipList.indexOf(helmet)).getEquipmentType());
		assertEquals(EquipmentType.torso, hero1.EquipList.get(hero1.EquipList.indexOf(torso)).getEquipmentType());
		assertEquals(EquipmentType.arms, hero1.EquipList.get(hero1.EquipList.indexOf(bracers)).getEquipmentType());
		assertEquals(EquipmentType.feet, hero1.EquipList.get(hero1.EquipList.indexOf(boots)).getEquipmentType());
	}

	public void testEquipBonus(){
		assertEquals(1, hero1.EquipList.get(hero1.EquipList.indexOf(helmet)).getEquipBonus());
		assertEquals(3, hero1.EquipList.get(hero1.EquipList.indexOf(torso)).getEquipBonus());
		assertEquals(1, hero1.EquipList.get(hero1.EquipList.indexOf(bracers)).getEquipBonus());
		assertEquals(5, hero1.EquipList.get(hero1.EquipList.indexOf(boots)).getEquipBonus());
	}
}
