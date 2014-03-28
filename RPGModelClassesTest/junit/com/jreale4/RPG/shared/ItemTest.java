package com.jreale4.RPG.shared;

import java.util.ArrayList;

import junit.framework.TestCase;

public class ItemTest extends TestCase{
	private Item potion;
	private Item attUp;
	private Item acid;
	ArrayList<Item> i = new ArrayList<Item>();
	protected void setUp(){	
		potion= new Item(ItemType.health);
		attUp= new Item(ItemType.boost);
		acid= new Item(ItemType.poison);
		i.add(potion);
		i.add(attUp);
		i.add(acid);
	}
	public void testItemEffect(){
		assertEquals(5, potion.getItemEffect(1));
		assertEquals(3, attUp.getItemEffect(1));
		assertEquals(-5, acid.getItemEffect(1));	
	}

}
