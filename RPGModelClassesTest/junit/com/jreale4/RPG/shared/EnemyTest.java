
package com.jreale4.RPG.shared;

import junit.framework.TestCase;

public class EnemyTest extends TestCase{

	private Enemy enemy1;
	private int lvl=1;
	
	public void testGetAttack(){
		FakeRandom.init(20, 1, 1, 2, 1, 3, 2, 4, 2, 5, 1, 6, 1, 7, 2, 8, 2, 9, 1, 10, 2, 11, 1, 12, 1, 13, 2, 14, 2, 15, 1, 16, 1, 17, 2, 18, 2, 19, 1, 20, 2, 0, 0);
		enemy1= new Enemy(lvl);
		
		assertEquals(17, enemy1.getNumAttacks());
		
		assertEquals(Move.physical, enemy1.AttackList.get(0).getMove());
		assertEquals(Move.magic, enemy1.AttackList.get(2).getMove());
		
		for(int i=0; i<enemy1.getNumAttacks();i++){
			assertEquals(MoveType.locationOf(i+1),enemy1.AttackList.get(i).getMoveType());
		}
	}

	public void testGetItem(){
		FakeRandom.init(1, 3, 3, 3, 1, 2, 3);
		enemy1= new Enemy(lvl);
		
		assertEquals(ItemType.health, enemy1.ItemList.get(0).getItemType());
		assertEquals(ItemType.boost, enemy1.ItemList.get(1).getItemType());
		assertEquals(ItemType.poison, enemy1.ItemList.get(2).getItemType());
	}
}
