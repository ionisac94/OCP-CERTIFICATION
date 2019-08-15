package com.md.endava.ocp.stream.match;

import java.util.Arrays;
import java.util.List;

public class Match2 {

	public static void main(String[] args) {


		List<String> stringList = Arrays.asList("assds", "endava", "globalPayment", "srd");

		long count = stringList
				.stream()
				.map(s -> s.length())
				.filter(p -> p % 2 == 0)
				.count();

		System.out.println(count);

	}

}
