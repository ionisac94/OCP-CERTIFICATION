package com.md.endava.ocp.functional_interfaces;

public class InterfaceTest {


	public void testInterface() {
		int x = 0;
		Eat eat = () -> System.out.println("neam neam" + x);
	}

	public static void main(String[] args) {
		InterfaceTest interfaceTest = new InterfaceTest();

		interfaceTest.testInterface();
	}

}
