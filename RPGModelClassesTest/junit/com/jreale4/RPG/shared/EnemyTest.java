package com.jreale4.RPG.shared;

import junit.framework.TestCase;

public class EnemyTest extends TestCase{
	
	private Enemy enemy1;
	int lvl=1;
	
	public void testGetMoveType(){
		//RandomProvider.setInstance(new FakeRandom(Arrays.asList(1, 2, 3, 4, 5).iterator()));
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
