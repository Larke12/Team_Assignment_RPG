package com.jreale4.RPG.shared;

import java.util.ArrayList;
import junit.framework.TestCase;

import com.jreale4.RPG.shared.Attack;
import com.jreale4.RPG.shared.MoveStyle;
import com.jreale4.RPG.shared.MoveType;


public class AttackTest extends TestCase {

	private Attack attack1;
	private Attack attack2;
	private Attack attack3;
	private Attack attack4;
	ArrayList<Attack> a = new ArrayList<Attack>();
	
	protected void setUp(){
		attack1= new Attack(MoveType.slash, MoveStyle.physical);
		attack2= new Attack(MoveType.water, MoveStyle.magic);
		attack3= new Attack(MoveType.stab, MoveStyle.physical);
		attack4= new Attack(MoveType.earth, MoveStyle.magic);
		a.add(attack1);
		a.add(attack2);
		a.add(attack3);
		a.add(attack4);
	}
	
	public void testGetMoveType(){
		assertEquals(MoveType.slash,attack1.getMoveType());
		assertEquals(MoveType.water,attack2.getMoveType());
		assertEquals(MoveType.stab,attack3.getMoveType());
		assertEquals(MoveType.earth,attack4.getMoveType());
	}

	public void testGetMove(){
		assertEquals(MoveStyle.physical,attack1.getMove());
		assertEquals(MoveStyle.magic,attack2.getMove());
		assertEquals(MoveStyle.physical,attack3.getMove());
		assertEquals(MoveStyle.magic,attack4.getMove());
	}
	
	public void testGetPower(){
		assertEquals( (float)(1.5), attack1.getAttackPower(attack1.getMoveType(), attack1.getMove(), 1));
		assertEquals( (float)(3), attack2.getAttackPower(attack2.getMoveType(), attack2.getMove(), 1));
		assertEquals( (float)(1), attack3.getAttackPower(attack3.getMoveType(), attack3.getMove(), 1));
		assertEquals( (float)(3.5), attack4.getAttackPower(attack4.getMoveType(), attack4.getMove(), 1));
	}
}
