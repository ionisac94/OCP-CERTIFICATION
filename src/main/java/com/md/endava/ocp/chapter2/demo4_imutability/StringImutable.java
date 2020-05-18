package com.md.endava.ocp.chapter2.demo4_imutability;

public class StringImutable {

	public static void main(String[] args) {

		String string1 = "hello";

		System.out.println(string1);

		String string2 = string1;

		System.out.println(string2);


		string1 = string1 + "world";

		System.out.println(string1);

		System.out.println(string2);


	}
}
