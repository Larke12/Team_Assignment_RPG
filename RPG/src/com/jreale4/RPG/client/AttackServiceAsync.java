package com.jreale4.RPG.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface AttackServiceAsync {

	void makeSlash(AsyncCallback<Integer> callback);

	void makeFire(AsyncCallback<Integer> callback);

	void EnemyAttack(AsyncCallback<Integer> asyncCallback);

}
