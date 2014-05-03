package com.jreale4.RPG.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.jreale4.RPG.shared.Hero;
import com.jreale4.RPG.shared.User;

@RemoteServiceRelativePath("login")
public interface LoginService extends RemoteService {
	/**
	 * Return the {@link User} object associated with given username and password.
	 * 
	 * @param userName the username
	 * @param password the password
	 * @return the {@link User} object, or null if the username/password
	 *         doesn't match any existing user
	 */
	public User login(String userName, String password);
//	public User newUser(String userName, String password);

	Hero getHero(User result);
}
