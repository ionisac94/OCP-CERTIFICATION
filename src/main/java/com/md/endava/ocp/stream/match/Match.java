package com.md.endava.ocp.stream.match;

import java.util.Arrays;
import java.util.List;

public class Match {

	public static void main(String[] args) {


		List<String> stringList = Arrays.asList("assds", "endava", "globalPayment", "srd");


		boolean b1 = stringList
				.stream()
				.map(l -> l.length())
				.allMatch(p -> p % 2 == 0);

		boolean b2 = stringList
				.stream()
				.map(l -> l.length())
				.anyMatch(p -> p % 2 == 0);

		boolean b3 = stringList
				.stream()
				.map(l -> l.length())
				.noneMatch(p -> p % 2 == 0);

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

}
