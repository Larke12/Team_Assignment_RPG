package com.jreale4.RPG.shared;


import java.util.Random;

public class RealRandom implements IRandom {
	private Random rng = new Random();

	@Override
	public int nextInt(int n) {
		return rng.nextInt(n);
	}
}