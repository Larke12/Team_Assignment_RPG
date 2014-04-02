package com.jreale4.RPG.shared;

public enum Move {
	physical, magic;

	public static Move locationOf(int i){
		if(i==1){
			return physical;
		}
		// Else it is magic.
		return magic;
	}
}
