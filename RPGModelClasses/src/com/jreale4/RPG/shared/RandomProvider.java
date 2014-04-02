package com.jreale4.RPG.shared;

public class RandomProvider {
	private static IRandom theInstance;
	
	public static IRandom getInstance() {
		return theInstance;
	}
	
	public static void setInstance(IRandom rand) {
		theInstance = rand;
	}
}
