package com.md.example.ocp.qa;

import java.util.HashMap;
import java.util.Map;

public class Task43 {

	// Task Endava interview
	public static void main(String[] args) {

		String string1 = "team";
		String string2 = "meat";

		System.out.println("are strings anagram ?: " + checkString(string1, string2));

	}

	public static boolean checkString(String s1, String s2) {
		return getSCharacterCount(s1).equals(getSCharacterCount(s2));
	}

	private static Map<Character, Integer> getSCharacterCount(String stringToBeCounted) {

		Map<Character, Integer> map2 = new HashMap<>();

		char[] chars2 = stringToBeCounted.toCharArray();

		for (int i = 0; i < chars2.length; i++) {

			Character character2 = chars2[i];

			if (map2.get(character2) == null) {

				map2.put(character2, 1);
			} else {
				map2.put(character2, map2.get(character2) + 1);
			}

		}
		return map2;
	}
}
