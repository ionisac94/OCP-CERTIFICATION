package com.md.example.ocp.chapter2.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

	static List<Applications> applicationsList = new ArrayList<>();


	public static void main(String[] args) {

		Applications ips = new Applications("ips", "http://ips.com", Methods.GET);
		Applications hpp = new Applications("hpp", "http://hpp.com", Methods.POST);
		Applications tr = new Applications("tr", "http://tr.com", Methods.GET);
		Applications hrr = new Applications("hrr", "http://hrr.com", Methods.GET);

		applicationsList.add(ips);
		applicationsList.add(hpp);
		applicationsList.add(tr);
		applicationsList.add(hrr);

		List<Applications> applicationsList = getApplicationsListByGetMethod(Main.applicationsList, s -> s.getMethods() == Methods.GET);
		System.out.println(applicationsList);


	}


	public static List<Applications> getApplicationsListByGetMethod(List<Applications> applicationsList, Predicate<Applications> predicate) {

		return applicationsList
				.stream()
				.filter(predicate)
				.collect(Collectors.toList());

	}
}
