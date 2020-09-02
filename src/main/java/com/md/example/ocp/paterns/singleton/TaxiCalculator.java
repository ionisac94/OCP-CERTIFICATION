package com.md.example.ocp.paterns.singleton;

public class TaxiCalculator {

	private NdsResolver ndsResolver;

	public TaxiCalculator(NdsResolver ndsResolver) {
		this.ndsResolver = ndsResolver;
	}

	public double calculateWithNds(double price) {
		double nds = ndsResolver.getNds();
		return (nds * price) + price;
	}
}
