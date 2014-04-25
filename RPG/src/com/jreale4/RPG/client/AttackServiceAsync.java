package com.jreale4.RPG.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.jreale4.RPG.shared.Attack;

public interface AttackServiceAsync {

	void makeSlash(AsyncCallback<Attack> callback);

}
