package com.jreale4.RPG.shared;

public class Equipment {
	EquipmentType eqtype;
	int eqlvl;
	public Equipment(EquipmentType eqtp, int eqlvl){
		this.eqtype=eqtp;
		this.eqlvl=eqlvl;
	}
	
	public int getEquipLvl(){
		return this.eqlvl;
	}
	
	public EquipmentType getEquipmentType(){
		return this.eqtype;
	}
	
	public int getEquipBonus(){
		int temp=this.eqlvl;
		temp= temp*(5/3);
		return temp;
	}
	
}
