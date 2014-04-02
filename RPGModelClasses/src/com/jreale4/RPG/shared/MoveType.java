package com.jreale4.RPG.shared;

public enum MoveType {
	stab, slash, fira, firus, flamma, aqua, aquas, mare, venta, ventus, caelum, terra, terras, saxum, thundara, thundaras, lucem, flamenPunch, flamenKick, gigaFlamenBreak;

	public static MoveType locationOf(int i) {
		if(i==1){
			return stab;
		}
		if(i==2){
			return slash;
		}
		if(i==3){
			return flamenPunch;
		}
		if(i==4){
			return flamenKick;
		}
		if(i==5){
			return gigaFlamenBreak;
		}
		if(i==6){
			return fira;
		}
		if(i==7){
			return aqua;
		}
		if(i==8){
			return venta;
		}
		if(i==9){
			return terra;
		}
		if(i==10){
			return thundara;
		}
		return null;
	}
}
