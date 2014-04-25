package com.jreale4.RPG.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.jreale4.RPG.shared.Attack;

public interface AttackService extends RemoteService {
	
	public Attack makeSlash();
}
