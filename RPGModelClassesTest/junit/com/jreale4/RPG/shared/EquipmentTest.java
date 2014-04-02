package com.jreale4.RPG.shared;

import java.util.ArrayList;

import junit.framework.TestCase;

public class EquipmentTest extends TestCase{
	private Equipment helmet;
	private Equipment torso;
	private Equipment bracers;
	private Equipment boots;
	ArrayList<Equipment> e = new ArrayList<Equipment>();


	protected void setUp(){	
		helmet= new Equipment(EquipmentType.head, 1);
		torso= new Equipment(EquipmentType.torso, 2);
		bracers= new Equipment(EquipmentType.arms, 1);
		boots= new Equipment(EquipmentType.feet, 3);
		e.add(helmet);
		e.add(torso);
		e.add(bracers);
		e.add(boots);
	}
	public void testEquipLvl(){
		assertEquals(1, helmet.getEquipLvl());
		assertEquals(2, torso.getEquipLvl());
		assertEquals(1, bracers.getEquipLvl());
		assertEquals(3, boots.getEquipLvl());
	}

	public void testEquipType(){
		assertEquals(EquipmentType.head, helmet.getEquipmentType());
		assertEquals(EquipmentType.torso, torso.getEquipmentType());
		assertEquals(EquipmentType.arms, bracers.getEquipmentType());
		assertEquals(EquipmentType.feet, boots.getEquipmentType());
	}

	public void testEquipBonus(){
		assertEquals(1, helmet.getEquipBonus());
		assertEquals(3, torso.getEquipBonus());
		assertEquals(1, bracers.getEquipBonus());
		assertEquals(5, boots.getEquipBonus());
	}
}
