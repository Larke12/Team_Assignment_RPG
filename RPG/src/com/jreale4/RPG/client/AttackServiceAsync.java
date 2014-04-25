package com.jreale4.RPG.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.jreale4.RPG.shared.Attack;

public interface AttackServiceAsync {

	void makeSlash(AsyncCallback<Integer> callback);

}
