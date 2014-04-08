package com.jreale4.RPG.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.jreale4.RPG.client.LoginService;
import com.jreale4.RPG.server.controllers.LoginController;
import com.jreale4.RPG.shared.User;

public class LoginServiceImpl extends RemoteServiceServlet implements LoginService {

	@Override
	public User login(String userName, String password) {
		System.out.println("Request to log in username=" + userName + ", password=" + password);
		LoginController controller = new LoginController();
		return controller.logIn(userName, password);
	}

}
