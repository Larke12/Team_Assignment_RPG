package com.jreale4.RPG.shared;

public class Item {
	private int id;
	private int HeroId;
	private ItemType itemtype;

	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public int getHeroId() {
		return HeroId;
	}
	
	public void setHeroId(int heroId) {
		HeroId = heroId;
	}
	
	public Item(ItemType itemtype){
		this.itemtype=itemtype;
	}
	
	public void setItemType(int i){
		itemtype=ItemType.locationOf(i);
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
		// Else, it's a potion
		return(-1)*5*(level);
		
		//		if(itemtype==ItemType.poison){
		//			return (-1)*5*(level);
		//		}
	}
}
