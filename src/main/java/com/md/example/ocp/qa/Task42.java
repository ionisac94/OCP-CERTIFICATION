package com.md.example.ocp.qa;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task42 {

	public static void main(String[] args) {
		findDuplicteCharacterInString("JAVA EE");

	}

	private static void findDuplicteCharacterInString(String string) {

		String toLowerCase = string.toLowerCase();

		String formatedString = toLowerCase.replaceAll("\\s", "");

		char[] chars = formatedString.toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		for (char c : chars) {

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}

		Set<Character> characters = map.keySet();

		for (Character character : characters) {
			if (map.get(character) > 1) {
				System.out.println(character + " " + map.get(character));
			}
		}
	}
}
