package com.md.endava.ocp.chapter2.demo4_imutability;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

		Person person = new Person("John", "str. Studentilor", "London", new Date());

		System.out.println(person);

		Date dateOfBirth = person.getDateOfBirth();

		dateOfBirth.setTime(1);

		System.out.println(person);
	}
}
