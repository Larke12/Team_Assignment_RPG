package com.jreale4.RPG.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.jreale4.RPG.client.AttackService;
import com.jreale4.RPG.server.controllers.BattleController;
import com.jreale4.RPG.shared.Enemy;
import com.jreale4.RPG.shared.Hero;

@SuppressWarnings("serial")
public class AttackServiceImpl extends RemoteServiceServlet implements
AttackService {

	@Override
	public int makeSlash(Hero h) {
		BattleController controller = new BattleController();

		return controller.makeSlash(h);
	}
	
	@Override
	public int makeFire(Hero h) {
		BattleController controller = new BattleController();
		return controller.makeFire(h);
	}

	@Override
	public int EnemyAttack(Enemy m) {
		// TODO Auto-generated method stub
		BattleController controller = new BattleController();
		return controller.EnemySlash(m);
	}
}
