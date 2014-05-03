package com.jreale4.RPG.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.jreale4.RPG.shared.Enemy;
import com.jreale4.RPG.shared.Hero;

@RemoteServiceRelativePath("attack")
public interface AttackService extends RemoteService {
	
	public int makeSlash(Hero h);
	
	public int makeFire(Hero h);

	public int EnemyAttack(Enemy m);
}
