package com.jreale4.RPG.shared;

public class Item {
	private ItemType itemtype;
	
	public Item(ItemType itemtype){
		this.itemtype=itemtype;
	}
	
	public ItemType getItemType(){
		//returns what type of item it is
		return this.itemtype;
	}
	
	public int getItemEffect(int level){
		//gets the item's effect by the type of item and the Character's level
		if(itemtype==ItemType.health){
			return 5*(level);
		}
		if(itemtype==ItemType.boost){
			return 3*(level);
		}
		if(itemtype==ItemType.poison){
			return (-1)*5*(level);
		}
		return 0;
	}
	
}
