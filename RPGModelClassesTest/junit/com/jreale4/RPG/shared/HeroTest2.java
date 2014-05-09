package com.jreale4.RPG.shared;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.jreale4.RPG.client.RPC;

import junit.framework.TestCase;

public class HeroTest2 extends GWTTestCase{
	Hero h;
	
	
	
	public void testGetAttack(){
		assertEquals(MoveType.slash, h.getAttack(0).getMoveType());
	}



	@Override
	public String getModuleName() {
		// TODO Auto-generated method stub
		return null;
	}
}
