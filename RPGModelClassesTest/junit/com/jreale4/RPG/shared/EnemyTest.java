
package com.jreale4.RPG.shared;

import junit.framework.TestCase;

public class EnemyTest extends TestCase{

	private Enemy enemy1;
	private int lvl=1;
	
	public void testGetAttack(){
		FakeRandom.init(4, 3, 1, 5, 1, 6, 2, 8, 2, 0, 0);
		enemy1= new Enemy(lvl);
		
		assertEquals(4, enemy1.getNumAttacks());
		
		assertEquals(MoveType.fira, enemy1.AttackList.get(0).getMoveType());
		assertEquals(Move.physical, enemy1.AttackList.get(0).getMove());
		
		assertEquals(MoveType.flamma, enemy1.AttackList.get(1).getMoveType());
		assertEquals(Move.physical, enemy1.AttackList.get(1).getMove());
		
		assertEquals(MoveType.aqua, enemy1.AttackList.get(2).getMoveType());
		assertEquals(Move.magic, enemy1.AttackList.get(2).getMove());
		
		assertEquals(MoveType.mare, enemy1.AttackList.get(3).getMoveType());
		assertEquals(Move.magic, enemy1.AttackList.get(3).getMove());
	}

	public void testGetItem(){
		FakeRandom.init(1, 3, 3, 3, 1, 2, 3);
		enemy1= new Enemy(lvl);
		
		assertEquals(ItemType.health, enemy1.ItemList.get(0).getItemType());
		assertEquals(ItemType.boost, enemy1.ItemList.get(1).getItemType());
		assertEquals(ItemType.poison, enemy1.ItemList.get(2).getItemType());
	}
}
