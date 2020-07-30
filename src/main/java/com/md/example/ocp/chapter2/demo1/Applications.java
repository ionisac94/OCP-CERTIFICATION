package com.md.example.ocp.chapter2.demo1;

public class Applications {

	private final String name, url;

	private final Methods methods;

	public Applications(String name, String url, Methods methods) {
		this.name = name;
		this.url = url;
		this.methods = methods;
	}

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}

	public Methods getMethods() {
		return methods;
	}

	@Override
	public String toString() {
		return "Applications{" +
				"name='" + name + '\'' +
				", url='" + url + '\'' +
				", methods=" + methods +
				'}';
	}
}
