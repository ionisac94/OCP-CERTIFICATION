package com.md.endava.ocp.stream.demo1;

public class User {

	private String name, surName, address;

	private int age;

	private double salary;

	public User(String name, String surName, String address, int age, double salary) {
		this.name = name;
		this.surName = surName;
		this.address = address;
		this.age = age;
		this.salary = salary;
	}

	public User() {
	}

	public String getName() {
		return name;
	}

	public String getSurName() {
		return surName;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", surName='" + surName + '\'' +
				", address='" + address + '\'' +
				", age=" + age +
				", salary=" + salary +
				'}';
	}
}
