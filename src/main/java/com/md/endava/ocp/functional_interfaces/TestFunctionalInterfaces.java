package com.md.endava.ocp.functional_interfaces;

public class TestFunctionalInterfaces {

	public static void main(String[] args) {

		D d = new D();

		d.m("john");


	}
}

class D {

	public void m(final String x) {

		System.out.println(x);

		String string = x.toString();
		String s = x.toUpperCase();

		System.out.println(s);

		System.out.println(string);

	}
}
