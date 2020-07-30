package com.md.example.ocp.stream.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoMapUsers {

	public static void main(String[] args) {


		User alex = new User("Alex", "Donciu", "str.Studentilor", 30, 200.2);
		User ion = new User("Ion", "Isac", "str.Studentilor", 29, 220.2);
		User Vlad = new User("Vlad", "Banescu", "str.Studentilor", 30, 2904.2);

		List<User> userList = new ArrayList<>();

		userList.add(alex);
		userList.add(ion);
		userList.add(Vlad);
		userList.add(Vlad);

//		List<String> stringList = getStringList(userList);
//		System.out.println(stringList);

		Object o = new User();

		User s = (User) o;

//		Object o2 = alex;


	}

	private static List<String> getStringList(List<User> userList) {


		List<Object> collect = userList.stream().map(get -> (Object) get).collect(Collectors.toList());


		ArrayList<String> stringArrayList = collect.stream().map(map -> (String) map).collect(Collectors.toCollection(ArrayList::new));

		List<String> list = new ArrayList<>();

//		for (int i = 0; i < stringArrayList.size(); i++) {
//			list.add(stringArrayList.get(i).getName());
//		}

		return list;
	}
}
