package com.jreale4.RPG.shared;

import java.util.ArrayList;

import junit.framework.TestCase;

public class EnemyTest extends TestCase{

	private Enemy enemy1;

	private Attack attack1;
	private Attack attack2;
	private Attack attack3;
	private Attack attack4;
	ArrayList<Attack> a = new ArrayList<Attack>();

	private Item potion;
	private Item attUp;
	private Item acid;
	ArrayList<Item> i = new ArrayList<Item>();

	public void testGetMoveType(){
		assertEquals(MoveType.slash,attack1.getMoveType());
		assertEquals(MoveType.aqua,attack2.getMoveType());
		assertEquals(MoveType.venta,attack3.getMoveType());
		assertEquals(MoveType.flamenKick,attack4.getMoveType());
	}

	public void testGetMove(){
		assertEquals(Move.physical,attack1.getMove());
		assertEquals(Move.magic,attack3.getMove());
	}

	public void testGetPower(){
		assertEquals( (float)(1.5), attack1.getAttackPower(attack1.getMoveType(), attack1.getMove(), 1));
		assertEquals( (float)(3), attack2.getAttackPower(attack2.getMoveType(), attack2.getMove(), 1));
		assertEquals( (float)(1), attack3.getAttackPower(attack3.getMoveType(), attack3.getMove(), 1));
		assertEquals( (float)(3.5), attack4.getAttackPower(attack4.getMoveType(), attack4.getMove(), 1));
	}

	public void testItemEffect(){
		assertEquals(5, enemy1.ItemList.get(enemy1.ItemList.indexOf(potion)).getItemEffect(enemy1.Level));
		assertEquals(3, enemy1.ItemList.get(enemy1.ItemList.indexOf(attUp)).getItemEffect(enemy1.Level));
		assertEquals(-5, enemy1.ItemList.get(enemy1.ItemList.indexOf(acid)).getItemEffect(enemy1.Level));	
	}
}
