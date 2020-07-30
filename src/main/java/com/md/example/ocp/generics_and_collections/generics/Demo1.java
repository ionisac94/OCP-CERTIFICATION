package com.md.example.ocp.generics_and_collections.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {

//		List<? super Number> list = new ArrayList<Object>();
//
//		list.add(25);
//		System.out.println(list.get(0));
//		System.out.println(list);

		List<? extends String> arrayList = new ArrayList<>();
//		arrayList.add("asdA");
//		arrayList.add("asdA");
//		arrayList.add("asdA");
//		arrayList.add("asdA");

		List<String> list = acceptAll(arrayList);
		System.out.println(list);
	}

	private static List<String> acceptAll(List<? extends String> stringList) {


		ArrayList<String> collect = stringList
				.stream()
				.peek(System.out::println)
				.map(k -> k.toLowerCase())
				.collect(Collectors.toCollection(ArrayList::new));

		return collect;


	}
}
