package com.md.example.ocp.qa;

public class Task21 {

	public static void main(String[] args) {

		// TODO remove spaces from string with out replaceAll method from String class

		String s1 = "	hello  world , how are y ou	";

		char[] chars = s1.toCharArray();

		StringBuffer buffer = new StringBuffer();


		for (int i = 0; i < chars.length; i++) {

			if ((chars[i] != ' ') && (chars[i] != '\t')) {

				buffer.append(chars[i]);
			}
		}

		System.out.println(buffer);

	}

}
