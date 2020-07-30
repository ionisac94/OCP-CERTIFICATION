package com.md.example.ocp.generics_and_collections.generics;

import java.util.Arrays;
import java.util.Comparator;

public class Demo2 {

	public static void main(String[] args) {

	}
}


class MyComparator implements Comparator<String> {


	public int compare(String x, String y) {

		return x.toLowerCase().compareTo(y.toLowerCase());

	}


	public static void main(String[] args) {
		MyComparator myComparator = new MyComparator();

		String[] strings = {"123", "ABD", "Abc", "acb"};

		Arrays.sort(strings, myComparator);

		for (String s : strings) {
			System.out.println(s + " ");
		}

	}
}