package com.jreale4.RPG.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("attack")
public interface AttackService extends RemoteService {
	
	public int makeSlash();
	public int makeFire();
	public int EnemyAttack();
}
