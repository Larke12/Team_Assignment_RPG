
package com.jreale4.RPG.shared;

import junit.framework.TestCase;

public class EnemyTest extends TestCase{

	private Enemy enemy1;
	private int lvl=1;
	
	public void testGetMoveType(){
		
		
		FakeRandom.init(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		enemy1= new Enemy(lvl);
	}

	public void testGetMove(){
	}

	public void testGetPower(){
	}

	public void testItemEffect(){
	}
}
