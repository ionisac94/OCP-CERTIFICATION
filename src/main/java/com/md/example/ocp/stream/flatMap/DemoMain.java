package com.md.example.ocp.stream.flatMap;

import java.util.ArrayList;
import java.util.List;

public class DemoMain {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setName("Florin");

		student1.addBooks("Spring 4");
		student1.addBooks("Spring 5");
		student1.addBooks("Java SE 8");
		student1.addBooks("Java EE 8");


		Student student2 = new Student();
		student2.setName("Tony");

		student2.addBooks("Jpa 2.1");
		student2.addBooks("Jpa 2.2");


		Student student3 = new Student();
		student3.setName("Marcus");

		student3.addBooks("Git");
		student3.addBooks("ELK");
		student3.addBooks("Java SE 8");


		List<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);

		students
				.stream()
				.peek(System.out::println)
				.peek(System.out::println);
	}
}
