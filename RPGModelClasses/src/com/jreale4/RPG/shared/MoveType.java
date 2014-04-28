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
			return fira;
		}
		if(i==4){
			return firus;
		}
		if(i==5){
			return flamma;
		}
		if(i==6){
			return aqua;
		}
		if(i==7){
			return aquas;
		}
		if(i==8){
			return mare;
		}
		if(i==9){
			return venta;
		}
		if(i==10){
			return ventus;
		}
		if(i==11){
			return caelum;
		}
		if(i==12){
			return terra;
		}
		if(i==13){
			return terras;
		}
		if(i==14){
			return saxum;
		}
		if(i==15){
			return thundara;
		}
		if(i==16){
			return thundaras;
		}
		if(i==17){
			return lucem;
		}
		if(i==18){
			return flamenPunch;
		}
		if(i==19){
			return flamenKick;
		}
		if(i==20){
			return gigaFlamenBreak;
		}
		return null;
	}
	
	public static int intOf(MoveType move){
		for(int i=1; i<20; i++){
			if(move.equals(locationOf(i))==true){
				return i;
			}
		}
		return 33;
	}
}
