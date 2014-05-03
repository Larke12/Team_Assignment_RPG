package com.jreale4.RPG.shared;

public class Hero extends Character{
	private int id;
	private int userId;
	int experience=0;

	public Hero(){
		super.Level=1;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getExperience(){
		//returns Hero's exp
		return this.experience;
	}

	public void addExp(int expToAdd){
		//adds to Hero's exp
		experience+=expToAdd;
	}

	public void LevelUp(int exp){
		//if Hero has enough exp, level up
		// reqExpTolvlUp = Level x (4000/3)
		int req= (super.Level)*(4000/3);
		if((super.Level)==1){
			req=1000;
		}
		if(exp>=req){
			super.Level++;
		}
	}

}
