package com.jreale4.RPG.client.controllers;

import com.jreale4.RPG.shared.Attack;
import com.jreale4.RPG.shared.MoveType; // Listed attacks

public class BattleController {

	private Attack attack;

	// Uses main physical attack, temp: Slash
	public String Attack() {
		// Calculate attack damage
		attack.equals(MoveType.slash);
		// Damage enemy, lower HP gauge
		
		return "Dan used Slash!";
	}

	// Takes a magic attack, mimics attack(?)
	public String Magic() {
		// Copy-pasta attack(?)
		return null;
	}

}
