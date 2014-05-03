package com.jreale4.RPG.shared;

public class Attack {
	private int id;
	private int HeroId;
	private MoveType movetype;
	private Move move;

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
	
	public Attack(MoveType movetype, Move move){
		this.movetype=movetype;
		this.move=move;
	}
	
	public void setMoveType(int i){
		movetype = MoveType.locationOf(i);
	}
	public void setMove(int m){
		move=Move.locationOf(m);
	}
	
	public MoveType getMoveType(){
		//returns what type of move (e.g. stab, flamenKick, terra)
		return movetype;
	}
	public Move getMove(){
		//returns what move the attack is classified as (e.g. physical, magic)
		return move;
	}

	public float getAttackPower(int Level){
		//returns the power of an attack by the equation
		//		P= (MTP+MP)/2
		float Power=getMoveTypePower();
		Power+=getMovePower();
		Power= Power*Level/2;
		return Power;
	}
	private int getMoveTypePower(){
		//returns the power variable for each MoveType, varies on magic type or overwhelming power of the move
		int Power=0;
		if(getMoveType()==MoveType.slash || getMoveType()==MoveType.stab){
			Power=1;
		}
		if(getMoveType()==MoveType.fira || getMoveType()==MoveType.aqua || getMoveType()==MoveType.terra || getMoveType()==MoveType.venta || getMoveType()==MoveType.thundara){
			Power=3;
		}
		if(getMoveType()==MoveType.flamenPunch || getMoveType()==MoveType.flamenKick){
			Power=5;
		}
		if(getMoveType()==MoveType.firus || getMoveType()==MoveType.aquas || getMoveType()==MoveType.terras || getMoveType()==MoveType.ventus || getMoveType()==MoveType.thundaras){
			Power=6;
		}
		if(getMoveType()==MoveType.flamma || getMoveType()==MoveType.mare || getMoveType()==MoveType.saxum || getMoveType()==MoveType.caelum || getMoveType()==MoveType.lucem){
			Power=9;
		}
		if(getMoveType()==MoveType.gigaFlamenBreak) {
			Power=10;
		}
		return Power;
	}
	private int getMovePower(){
		//returns the power variable for each Move
		int Power=0;
		if(getMove()==Move.physical){
			Power=1;
		}
		if(getMove()==Move.magic){
			Power=2;
		}
		return Power;
	}
}
