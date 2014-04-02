package com.jreale4.RPG.shared;

import java.util.Arrays;
import java.util.Iterator;

public class FakeRandom implements IRandom {
	private Iterator<Integer> iter;
	
	public FakeRandom(Iterator<Integer> iter) {
		this.iter = iter;
	}

	@Override
	public int nextInt(int n) {
		return iter.next();
	}

	public static void init(Integer... values) {
		RandomProvider.setInstance(new FakeRandom(Arrays.asList(values).iterator()));
	}
}