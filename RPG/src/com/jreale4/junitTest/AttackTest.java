package com.jreale4.junitTest;

import java.util.ArrayList;
import junit.framework.TestCase;

import com.jreale4.RPG.shared.Attack;
import com.jreale4.RPG.shared.Move;
import com.jreale4.RPG.shared.MoveType;


public class AttackTest extends TestCase {

	private Attack attack1;
	private Attack attack2;
	private Attack attack3;
	private Attack attack4;
	ArrayList<Attack> a = new ArrayList<Attack>();
	
	protected void setUp(){
		attack1= new Attack(MoveType.physical, Move.slash);
		attack2= new Attack(MoveType.water, Move.magic);
		attack3= new Attack(MoveType.physical, Move.stab);
		attack4= new Attack(MoveType.earth, Move.magic);
		a.add(attack1);
		a.add(attack2);
		a.add(attack3);
		a.add(attack4);
	}
	
	public void testGetMoveType(){
		assertEquals(MoveType.physical,attack1.getMoveType());
		assertEquals(MoveType.water,attack2.getMoveType());
		assertEquals(MoveType.physical,attack3.getMoveType());
		assertEquals(MoveType.earth,attack4.getMoveType());
	}

	public void testGetMove(){
		assertEquals(Move.slash,attack1.getMove());
		assertEquals(Move.magic,attack2.getMove());
		assertEquals(Move.stab,attack3.getMove());
		assertEquals(Move.magic,attack4.getMove());
	}
	
	public void testGetPower(){
		assertEquals( (float)(1.5), attack1.getAttackPower(attack1.getMoveType(), attack1.getMove(), 1));
		assertEquals( (float)(3), attack2.getAttackPower(attack2.getMoveType(), attack2.getMove(), 1));
		assertEquals( (float)(1), attack3.getAttackPower(attack3.getMoveType(), attack3.getMove(), 1));
		assertEquals( (float)(3.5), attack4.getAttackPower(attack4.getMoveType(), attack4.getMove(), 1));
	}
}
