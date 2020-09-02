package com.md.example.ocp;

import java.time.LocalDateTime;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello world " + LocalDateTime.now());

		String property = System.getProperty("os.name");
		System.out.println(property);

		System.out.println("====================");
		Properties properties = System.getProperties();


		System.out.println("properties.getProperty(\"os.mame\") = " + properties.getProperty("os.name"));
	}
}
