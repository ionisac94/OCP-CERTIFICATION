package com.md.endava.ocp.chapter2.demo4_imutability;

public class MutableClass {

	private int numberOfmethods;

	private double rate;

	public int getNumberOfmethods() {
		return numberOfmethods;
	}

	public void setNumberOfmethods(int numberOfmethods) {
		this.numberOfmethods = numberOfmethods;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "MutableClass{" +
				"numberOfmethods=" + numberOfmethods +
				", rate=" + rate +
				'}';
	}
}
