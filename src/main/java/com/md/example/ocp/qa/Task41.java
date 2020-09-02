package com.md.example.ocp.qa;

import java.util.HashMap;
import java.util.Map;

public class Task41 {

	public static void main(String[] args) {
//		https://javaconceptoftheday.com/java-interview-programs-with-solutions/
//		https://javaconceptoftheday.com/duplicate-characters-in-a-string-in-java/
		String str = "This this is is done by Saket Saket Saket";
		String toLowerCase = str.toLowerCase();
		String[] split = toLowerCase.split(" ");

		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < split.length; i++) {
			if (map.containsKey(split[i])) {
				int count = map.get(split[i]);
				map.put(split[i], count + 1);
			} else {
				map.put(split[i], 1);
			}
		}
		System.out.println(map);
	}
}
