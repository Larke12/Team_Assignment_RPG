package com.jreale4.RPG.server.controllers;

import com.jreale4.RPG.shared.Attack;
import com.jreale4.RPG.shared.Enemy;
import com.jreale4.RPG.shared.Hero;
import com.jreale4.RPG.shared.Move;
import com.jreale4.RPG.shared.MoveType; // Listed attacks

public class BattleController {

	public int makeSlash(Hero h){
		Attack a = new Attack( MoveType.slash, Move.physical);
		
//		Attack a = h.getAttack(0);
		return (int)a.getAttackPower(1);
	}
	
	public int makeFire(Hero h) {
		Attack a = new Attack(MoveType.fira, Move.magic);
		
//		Attack a = h.getAttack(1);
		return (int)a.getAttackPower(1);
	}

	public int EnemySlash() {
		Attack e = new Attack( MoveType.slash, Move.physical);
//		Attack e = m.getAttack(0);
		return (int)e.getAttackPower(1);
	}

}
