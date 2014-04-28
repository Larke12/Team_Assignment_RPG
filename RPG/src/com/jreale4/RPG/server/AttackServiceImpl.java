package com.jreale4.RPG.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.jreale4.RPG.client.AttackService;
import com.jreale4.RPG.server.controllers.BattleController;

@SuppressWarnings("serial")
public class AttackServiceImpl extends RemoteServiceServlet implements
		AttackService {

	@Override
	public int makeSlash() {
		// TODO Auto-generated method stub
		BattleController controller = new BattleController();
		
		return controller.makeSlash();
	}

}
