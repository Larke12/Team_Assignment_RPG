package com.jreale4.RPG.shared;

public class Attack {
	private MoveType movetype;
	private MoveStyle move;
	
	public Attack(MoveType movetype, MoveStyle move){
		this.movetype=movetype;
		this.move=move;
	}
	
	public MoveType getMoveType(){
		return movetype;
	}
	public MoveStyle getMove(){
		return move;
	}
	
	public float getAttackPower(MoveType movetype, MoveStyle move, int Level){
		float Power=getMoveTypePower(movetype);
		Power+=getMovePower(move);
		Power= Power*Level/2;
		return Power;
	}
	private int getMoveTypePower(MoveType movetype){
		int Power=0;
		if(getMoveType()==MoveType.stab || getMoveType()==MoveType.slash){
			Power=1;
		}
		if(getMoveType()==MoveType.fire){
			Power=2;
		}
		if(getMoveType()==MoveType.water){
			Power=3;
		}
		if(getMoveType()==MoveType.earth){
			Power=4;
		}
		if(getMoveType()==MoveType.air){
			Power=5;
		}
		if(getMoveType()==MoveType.lightning){
			Power=6;
		}
		return Power;
	}
	private int getMovePower(MoveStyle move){
		int Power=0;
		if(getMove()==MoveStyle.physical){
			Power=2;
		}
		if(getMove()==MoveStyle.magic){
			Power=3;
		}
		return Power;
	}
}
