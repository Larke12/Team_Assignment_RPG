package com.jreale4.RPG.server.model.persist;

import com.jreale4.RPG.shared.User;

public interface IDatabase {
	public User logIn(String userName, String password);
}
