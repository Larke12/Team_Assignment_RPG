package com.jreale4.RPG.shared;

import java.util.ArrayList;

import junit.framework.TestCase;

public class AttackTest extends TestCase {

	private Attack attack1;
	private Attack attack2;
	private Attack attack3;
	private Attack attack4;
	ArrayList<Attack> a = new ArrayList<Attack>();

	protected void setUp(){
		attack1= new Attack(MoveType.flamenPunch, Move.physical);
		attack2= new Attack(MoveType.aqua, Move.magic);
		attack3= new Attack(MoveType.gigaFlamenBreak, Move.physical);
		attack4= new Attack(MoveType.thundara, Move.magic);
		a.add(attack1);
		a.add(attack2);
		a.add(attack3);
		a.add(attack4);
	}

	public void testGetMoveType(){
		assertEquals(MoveType.flamenPunch,attack1.getMoveType());
		assertEquals(MoveType.aqua,attack2.getMoveType());
		assertEquals(MoveType.gigaFlamenBreak,attack3.getMoveType());
		assertEquals(MoveType.thundara,attack4.getMoveType());
	}

	public void testGetMove(){
		assertEquals(Move.physical,attack1.getMove());
		assertEquals(Move.magic,attack2.getMove());
		assertEquals(Move.physical,attack3.getMove());
		assertEquals(Move.magic,attack4.getMove());
	}

	public void testGetPower(){
		assertEquals( (float)(1.0), attack1.getAttackPower(attack1.getMoveType(), attack1.getMove(), 1));
		assertEquals( (float)(2.5), attack2.getAttackPower(attack2.getMoveType(), attack2.getMove(), 1));
		assertEquals( (float)(1), attack3.getAttackPower(attack3.getMoveType(), attack3.getMove(), 1));
		assertEquals( (float)(4.0), attack4.getAttackPower(attack4.getMoveType(), attack4.getMove(), 1));
	}
}
