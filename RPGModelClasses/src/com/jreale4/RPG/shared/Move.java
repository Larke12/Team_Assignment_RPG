package com.jreale4.RPG.shared;

public enum Move {
	physical, magic;

	public static Move locationOf(int i){
		if(i == 1){
			return physical;
		} else {
			return magic;
		}
	}
	
	public static int intOf(Move move){
		for(int i=1; i<2; i++){
			if(move.equals(locationOf(i))==true){
				return i;
			}
		}
		return 11;
	}
}
