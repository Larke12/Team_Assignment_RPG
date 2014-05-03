package com.jreale4.RPG.shared;

public class Equipment {
	private int id;
	private int HeroId;
	EquipmentType eqtype;
	int eqlvl;
	
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
	
	public Equipment(EquipmentType eqtp, int eqlvl){
		this.eqtype=eqtp;
		this.eqlvl=eqlvl;
	}

	public void setEquipLvl(int i){
		eqlvl=i;
	}
	
	public int getEquipLvl(){
		return this.eqlvl;
	}
	
	public void setEquipType(int i){
		eqtype= EquipmentType.locationOf(i);
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
