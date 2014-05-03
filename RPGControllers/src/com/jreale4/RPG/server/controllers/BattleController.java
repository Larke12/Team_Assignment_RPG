package com.jreale4.RPG.server.controllers;

import com.jreale4.RPG.shared.Attack;
import com.jreale4.RPG.shared.Enemy;
import com.jreale4.RPG.shared.Hero;
import com.jreale4.RPG.shared.Move;
import com.jreale4.RPG.shared.MoveType; // Listed attacks

public class BattleController {

	public int makeSlash(Hero h){
		Attack a = h.getAttack(0);
		return (int)a.getAttackPower(a.getMoveType(), a.getMove(), 1);
	}
	
	public int makeFire(Hero h) {
		
		return 0;
	}

	public int EnemySlash(Enemy m) {
	
		return 0;
	}

}
