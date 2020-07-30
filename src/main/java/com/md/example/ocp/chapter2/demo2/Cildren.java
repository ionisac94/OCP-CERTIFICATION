package com.md.example.ocp.chapter2.demo2;

public class Cildren {

	private String firstName, lastName;

	private String dateOfBirth;

	private int age;

	public Cildren(String firstName, String lastName, String dateOfBirth, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public int getAge() {
		return age;
	}
}
