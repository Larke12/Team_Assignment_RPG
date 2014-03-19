package com.jreale4.RPG.shared;

public class Hero extends Character{
	int experience=0;
	
	public int getExperience(){
		return this.experience;
	}
	
	public void LevelUp(int exp, int lvl){
		int req=0;
		if(lvl==1){
			req=1000;
		}
		req= lvl*(4000/3);
		if(exp==req){
			lvl++;
			super.Level=lvl;
		}
			
	}
}
