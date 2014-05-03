package com.jreale4.RPG.server.controllers;

import com.jreale4.RPG.server.model.persist.DatabaseProvider;
import com.jreale4.RPG.server.model.persist.IDatabase;
import com.jreale4.RPG.shared.User;

public class LoginController {
	public User logIn(String userName, String password) {
		IDatabase db = DatabaseProvider.getInstance();
		return db.logIn(userName, password);
	}
	
//	public User newUser(String userName, String password){
//		IDatabase db = DatabaseProvider.getInstance();
//		return db.newUser(userName, password);
//	}
}
