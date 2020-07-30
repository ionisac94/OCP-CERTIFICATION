package com.md.example.ocp.generics_and_collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Catzel implements Comparable<Catzel> {

	public static void main(String[] args) {

		Catzel JACK = new Catzel("CJack", "maro", 2);//377
		Catzel PIKA = new Catzel("Pika", "negru", 2);//389
		Catzel SARIC = new Catzel("AS", "castaniu", 3);//499
		Catzel BINGO = new Catzel("Bingo", "Alb", 4);//495
		Catzel BINGO2 = new Catzel("Bingo", "Alb", 5);//495

		List<Catzel> catzelList = new ArrayList<>();
		catzelList.add(JACK);
		catzelList.add(PIKA);
		catzelList.add(SARIC);
		catzelList.add(BINGO);
		catzelList.add(BINGO2);
		System.out.println(BINGO.equals(BINGO2));
		System.out.println(BINGO.compareTo(BINGO2));

		catzelList.forEach(System.out::println);

		Collections.sort(catzelList);

		System.out.println("=====================");

		catzelList.forEach(System.out::println);


	}

	private String nume, culoare;
	private int virsta;

	public Catzel(String nume, String culoare, int virsta) {
		this.nume = nume;
		this.culoare = culoare;
		this.virsta = virsta;
	}

	public String getNume() {
		return nume;
	}

	public String getCuloare() {
		return culoare;
	}

	public int getVirsta() {
		return virsta;
	}

	@Override
	public int compareTo(Catzel catzel) {

		return this.nume.compareTo(catzel.nume);
	}
/**
 * 		CJack parametru
 *
 * 		1 this.Pica compareTo CJack rezult 13
 *
 * 		Pika parametru
 *
 * 		2 this.ASarictrrre compareTo Pika rezult -15
 *
 * 		CJack parametru
 *
 * 		3 this.ASarictrrre compareTo CJack rezult -2
 *
 * 		CJack parametru
 *
 * 		4 this.BINGO compareTo CJack rezult -1
 *
 * 		ASarictrrre parametru
 *
 * 		5 this.BINGO compareTo ASarictrrre rezult 1
 * */

//	@Override
//	public boolean equals(Object obj) {
//
//		if (obj == null) {
//			return false;
//		}
//		if (!(obj instanceof Object)) {
//			return false;
//		}
//		if (obj instanceof Catzel) {
//
//			Catzel catzel = (Catzel) obj;
//
//			return this.nume.equals(catzel.nume);
//		}
//		return false;
//	}

	@Override
	public int hashCode() {
		return Objects.hash(nume);
	}

	@Override
	public String toString() {
		return "Catzel{" +
				"nume='" + nume + '\'' +
				", culoare='" + culoare + '\'' +
				", virsta=" + virsta +
				'}';
	}
}
