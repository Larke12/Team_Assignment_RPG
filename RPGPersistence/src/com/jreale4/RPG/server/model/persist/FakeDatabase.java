package com.jreale4.RPG.server.model.persist;

import java.util.ArrayList;
import java.util.List;

import com.jreale4.RPG.shared.User;

public class FakeDatabase implements IDatabase {
	private List<User> userList;
	
	public FakeDatabase() {
		userList = new ArrayList<User>();
		User testUser = new User();
		testUser.setUserName("admin");
		testUser.setPassword("flamwenco");
		userList.add(testUser);
	}

	@Override
	public User logIn(String userName, String password) {
		for (User user : userList) {
			if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}

}
