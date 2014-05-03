package com.jreale4.RPG.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.jreale4.RPG.shared.Enemy;
import com.jreale4.RPG.shared.Hero;

public interface AttackServiceAsync {

	void makeSlash(Hero h, AsyncCallback<Integer> callback);

	void makeFire(Hero h, AsyncCallback<Integer> callback);

	void EnemyAttack(Enemy m, AsyncCallback<Integer> asyncCallback);

}
