package com.jreale4.RPG.client;

import com.google.gwt.core.shared.GWT;

public class AttackRPC {
	public static final AttackServiceAsync attackService =
			GWT.create(AttackService.class);
}
