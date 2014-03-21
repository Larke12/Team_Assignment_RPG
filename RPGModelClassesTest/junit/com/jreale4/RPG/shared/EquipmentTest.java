package com.jreale4.RPG.shared;

import java.util.ArrayList;

import junit.framework.TestCase;

public class EquipmentTest extends TestCase{
	private Equipment helmet;
	private Equipment torso;
	private Equipment bracers;
	private Equipment pants;
	private Equipment boots;
	private Equipment gloves;
	private Equipment pack;
	ArrayList<Equipment> e = new ArrayList<Equipment>();
	
	
	protected void setUp(){	
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
	}
	public void testEquipLvl(){
		assertEquals(1, helmet.getEquipLvl());
		assertEquals(2, torso.getEquipLvl());
		assertEquals(1, bracers.getEquipLvl());
		assertEquals(2, pants.getEquipLvl());
		assertEquals(3, boots.getEquipLvl());
		assertEquals(2, gloves.getEquipLvl());
		assertEquals(3, pack.getEquipLvl());
	}
	
	public void testEquipType(){
		assertEquals(EquipmentType.head, helmet.getEquipmentType());
		assertEquals(EquipmentType.chest, torso.getEquipmentType());
		assertEquals(EquipmentType.arms, bracers.getEquipmentType());
		assertEquals(EquipmentType.legs, pants.getEquipmentType());
		assertEquals(EquipmentType.feet, boots.getEquipmentType());
		assertEquals(EquipmentType.hands, gloves.getEquipmentType());
		assertEquals(EquipmentType.back, pack.getEquipmentType());
	}
	
	public void testEquipBonus(){
		assertEquals(1, helmet.getEquipBonus());
		assertEquals(3, torso.getEquipBonus());
		assertEquals(1, bracers.getEquipBonus());
		assertEquals(3, pants.getEquipBonus());
		assertEquals(5, boots.getEquipBonus());
		assertEquals(3, gloves.getEquipBonus());
		assertEquals(5, pack.getEquipBonus());
		
	}
}
