package com.jreale4.RPG.shared;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.jreale4.RPG.client.RPC;

import junit.framework.TestCase;

public class HeroTest2 extends TestCase{
	Hero h;
	
	protected void setUp(){
		RPC.loginService.login("jreale", "darking", new AsyncCallback<User>() {

			@Override
			public void onSuccess(User result) {
				if (result == null) {
					// no such user
					String text = "No Such User Exists";
					System.out.println(text);

				} else {
					// login successful
					System.out.println("Login Successful!");
					
				}
			}

			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
