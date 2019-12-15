package com.md.endava.ocp.chapter2.demo4_imutability;

import java.util.Date;
import java.util.List;

public class Person {

	private String name, addres, city;

	private Date dateOfBirth;


	public Person(String name, String addres, String city, Date dateOfBirth) {
		this.name = name;
		this.addres = addres;
		this.city = city;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public String getAddres() {
		return addres;
	}

	public String getCity() {
		return city;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", addres='" + addres + '\'' +
				", city='" + city + '\'' +
				", dateOfBirth=" + dateOfBirth +
				'}';
	}
}
