package com.md.endava.ocp.generics_and_collections.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Catzel implements Comparable<Catzel> {

	public static void main(String[] args) {

		Catzel JACK = new Catzel("CJack", "maro", 2);//377
		Catzel PIKA = new Catzel("Pika", "negru", 2);//389
		Catzel SARIC = new Catzel("ASarictrrre", "castaniu", 3);//499
		Catzel BINGO = new Catzel("Bingo", "Alb", 4);//495

		System.out.println(JACK.equals(SARIC));

		System.out.println(JACK.hashCode());
		System.out.println(PIKA.hashCode());

		System.out.println("/////////////////////////////////////////");

		List<Catzel> catzels = Arrays.asList(PIKA, JACK, BINGO, SARIC);
		System.out.println(catzels);
		Collections.sort(catzels);
		System.out.println(catzels);



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


	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Object)) {
			return false;
		}
		if (obj instanceof Catzel) {

			Catzel catzel = (Catzel) obj;

			return this.nume.equals(catzel.nume);
		}
		return false;
	}

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
