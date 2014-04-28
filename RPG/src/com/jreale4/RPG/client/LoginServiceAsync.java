package com.jreale4.RPG.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.jreale4.RPG.shared.User;

public interface LoginServiceAsync {

	void login(String userName, String password, AsyncCallback<User> callback);

	void newUser(String userName, String password, AsyncCallback<User> callback);

}
