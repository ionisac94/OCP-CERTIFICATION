package com.md.example.ocp.stream.demo3;

import com.md.example.ocp.stream.demo1.User;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {

		List<User> userList = new ArrayList<>();

		User ion = new User("Ion", "Isac", "Bucharest", 23, 2234.0);
		User gim = new User("Gim", "Bixy", "London", 23, 2344.0);
		User cornel = new User("Cornel", "Vadim", "Prahova", 54, 1222.3);

		userList.add(ion);
		userList.add(gim);
		userList.add(cornel);

		User ionelUser = getIonelUser(userList);

		System.out.println(ionelUser);

	}


	public static User getIonelUser(List<User> userList) {

		User user = userList
				.stream()
				.filter(e -> e.getName() == "Ion").findFirst().get();


		return user;

	}
}
