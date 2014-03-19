package com.jreale4.RPG.shared;

public class Item {
	private ItemType itemtype;
	
	public Item(ItemType itemtype){
		this.itemtype=itemtype;
	}
	
	public ItemType getItemType(){
		return this.itemtype;
	}
	
}
