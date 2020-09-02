package com.md.example.ocp.qa;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		System.out.println("About to check if a string is a number or not");

		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();

		if (Helper.checkIfStringIsNumber(s) && s.length() > 2) {
			System.out.println("Hey, you entered a valid number :)...thx");
		} else {
			System.out.println("sorry, try with a valid number :)");
		}

	}
}


class Helper {

	public static boolean checkIfStringIsNumber(String numberToCheck) {

		try {
			Integer.parseInt(numberToCheck);
		} catch (NumberFormatException e) {
			System.out.println("sorry, you should enter a valid number");
			return false;
		}

		return true;
	}

}