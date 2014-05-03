package com.jreale4.RPG.shared;

import java.util.ArrayList;

import junit.framework.TestCase;

public class AttackTest extends TestCase {

	private Attack attack1;
	private Attack attack2;
	private Attack attack3;
	private Attack attack4;
	private Attack attack5;
	private Attack attack6;

	ArrayList<Attack> a = new ArrayList<Attack>();

	protected void setUp(){
		attack1= new Attack(MoveType.flamenPunch, Move.physical);
		attack2= new Attack(MoveType.aqua, Move.magic);
		attack3= new Attack(MoveType.gigaFlamenBreak, Move.physical);
		attack4= new Attack(MoveType.thundara, Move.magic);
		attack5= new Attack(MoveType.ventus, Move.magic);
		attack6= new Attack(MoveType.lucem, Move.magic);
		a.add(attack1);
		a.add(attack2);
		a.add(attack3);
		a.add(attack4);
		a.add(attack5);
		a.add(attack6);
	}

	public void testGetMoveType(){
		assertEquals(MoveType.flamenPunch,attack1.getMoveType());
		assertEquals(MoveType.aqua,attack2.getMoveType());
		assertEquals(MoveType.gigaFlamenBreak,attack3.getMoveType());
		assertEquals(MoveType.thundara,attack4.getMoveType());
		assertEquals(MoveType.ventus,attack5.getMoveType());
		assertEquals(MoveType.lucem,attack6.getMoveType());
	}

	public void testGetMove(){
		assertEquals(Move.physical,attack1.getMove());
		assertEquals(Move.magic,attack2.getMove());
		assertEquals(Move.physical,attack3.getMove());
		assertEquals(Move.magic,attack4.getMove());
		assertEquals(Move.magic,attack5.getMove());
		assertEquals(Move.magic,attack6.getMove());
	}

	public void testGetPower(){
		assertEquals( (float)(3.0), attack1.getAttackPower(attack1.getMoveType(), attack1.getMove(), 1));
		assertEquals( (float)(2.5), attack2.getAttackPower(attack2.getMoveType(), attack2.getMove(), 1));
		assertEquals( (float)(5.5), attack3.getAttackPower(attack3.getMoveType(), attack3.getMove(), 1));
		assertEquals( (float)(2.5), attack4.getAttackPower(attack4.getMoveType(), attack4.getMove(), 1));
		assertEquals( (float)(4.0), attack5.getAttackPower(attack5.getMoveType(), attack5.getMove(), 1));
		assertEquals( (float)(5.5), attack6.getAttackPower(attack6.getMoveType(), attack6.getMove(), 1));
	}
}
