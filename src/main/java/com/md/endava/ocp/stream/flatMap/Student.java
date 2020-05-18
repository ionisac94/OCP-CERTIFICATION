package com.md.endava.ocp.stream.flatMap;


import java.util.HashSet;
import java.util.Set;

public class Student extends Parent {

	private String name;

	private Set<String> book;


//	public void addBooks(String book) {
//		this.book = new HashSet<>();
//		this.book.add(book);
//	}

	public void addBooks(String book) {
		if (this.book == null) {
			this.book = new HashSet<>();
		}
		this.book.add(book);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getBooks() {
		return book;
	}

	public void setBooks(Set<String> books) {
		this.book = books;
	}
}
