package com.md.endava.ocp.functional_interfaces;

public interface Eat {

	void eat();

	default boolean canBark() {
		return false;
	}

	static void canSwim() {

	}
}
