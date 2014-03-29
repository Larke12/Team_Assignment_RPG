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
		if(i==3){
			return poison;
		}
		return null;
	}
}
