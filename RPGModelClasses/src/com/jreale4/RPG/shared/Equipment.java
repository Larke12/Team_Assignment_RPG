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
		//returns bonus given by equipment by equation
		// Bonus = Elvl x (5/3)
		double temp=this.eqlvl;
		temp= temp*(5.0/3.0);
		return (int)temp;
	}
	
}
