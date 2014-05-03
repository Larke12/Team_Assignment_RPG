package com.jreale4.RPG.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.jreale4.RPG.client.LoginService;
import com.jreale4.RPG.server.controllers.LoginController;
import com.jreale4.RPG.shared.Hero;
import com.jreale4.RPG.shared.User;

@SuppressWarnings("serial")
public class LoginServiceImpl extends RemoteServiceServlet implements LoginService {

	@Override
	public User login(String userName, String password) {
		System.out.println("Request to log in username=" + userName + ", password=" + password);
		LoginController controller = new LoginController();
		return controller.logIn(userName, password);
	}

	@Override
	public Hero getHero(User u) {
		LoginController controller = new LoginController();
		
		return controller.getHero(u);
	}

//	@Override
//	public User newUser(String userName, String password) {
//		// TODO Auto-generated method stub
//		LoginController controller = new LoginController();
//		return controller.newUser(userName, password);
//	}
//I like apple pie
}
