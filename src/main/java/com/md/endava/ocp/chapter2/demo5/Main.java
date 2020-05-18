package com.md.endava.ocp.chapter2.demo5;

import com.md.endava.ocp.chapter2.demo3.Animal;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {


		Animal fish = new Animal("fish", false, true);
		Animal reptile = new Animal("reptile", false, false);
		Animal snack = new Animal("snack", false, true);
		Animal tiger = new Animal("tiger", true, true);


		List<Animal> collect = Stream.of(fish, reptile, snack, tiger)
				.peek(System.out::println)
				.filter((Animal a) -> { return a.canSwim();})
				.peek(System.out::println)
				.collect(Collectors.toList());

		System.out.println(collect);
	}
}
