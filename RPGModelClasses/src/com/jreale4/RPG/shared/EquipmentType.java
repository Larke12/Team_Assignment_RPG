package com.jreale4.RPG.shared;

public enum EquipmentType {
	head, torso, arms, feet;
	
	public static EquipmentType locationOf(int i){
		if(i==1){
			return head;
		}
		if(i==2){
			return torso;
		}
		if(i==3){
			return arms;
		}
		if(i==4){
			return feet;
		}
		return null;
	}
	
	public static int intOf(EquipmentType type){
		for(int i=1; i<2; i++){
			if(type.equals(locationOf(i))==true){
				return i;
			}
		}
		return 11;
	}
}
