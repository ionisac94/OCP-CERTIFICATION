package com.md.example.ocp.qa;

public class Task22 {

	public static void main(String[] args) {

		// TODO remove spaces from string with out replaceAll method from String class

		String s1 = "	hello  world , how are y ou	";

		String[] split = s1.split("\\s");

		StringBuffer buffer = new StringBuffer();

		for (int i = 0; i < split.length; i++) {

			if ((split[i] !=  " ") && (split[i] != "\\t")) {

				buffer.append(split[i]);
			}
		}

		System.out.println(buffer);

	}

}
