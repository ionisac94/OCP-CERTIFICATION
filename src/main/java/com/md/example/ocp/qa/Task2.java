package com.md.example.ocp.qa;

public class Task2 {

	public static void main(String[] args) {

		// TODO remove spaces from string

		String s1 = "hello  world , how are y ou";

		String withOutSpace = s1.replaceAll("\\s", "");

		System.out.println(withOutSpace);


	}

}
