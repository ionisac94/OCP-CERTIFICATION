package com.md.example.ocp.paterns.singleton;

public class RomanianNdsResolverImpl implements NdsResolver {

	private double nds;

	public RomanianNdsResolverImpl() {
		this.nds = getNdsFromCentralBank();
	}

	@Override
	public double getNds() {
		return nds;
	}

	private double getNdsFromCentralBank() {
		return 0.8;
	}
}
