package com.jreale4.RPG.shared;

public enum ItemType {
	health, boost, poison;

	public static ItemType locationOf(int i){
		if(i==1){
			return health;
		}
		if(i==2){
			return boost;
		}
		// Else return poison
		return poison;
	}
	
	public static int intOf(ItemType type){
		for(int i=1; i<3; i++){
			if(type.equals(locationOf(i))==true){
				return i;
			}
		}
		return 11;
	}
}
