package com.md.endava.ocp.generics_and_collections.generics;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {

		List<? super Number> list = new ArrayList<Object>();

		list.add(25);
		System.out.println(list.get(0));
		System.out.println(list);
	}
}
