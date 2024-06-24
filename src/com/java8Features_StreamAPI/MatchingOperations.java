package com.java8Features_StreamAPI;

import java.util.Arrays;
import java.util.List;

class Person {
	String name;
	String country;

	public Person(String name, String country) {
		this.name = name;
		this.country = country;
	}

}

public class MatchingOperations {
	public static void main(String[] args) {
		Person p1 = new Person("teja", "India");
		Person p2 = new Person("virat", "India");
		Person p3 = new Person("abd", "southafrica");
		Person p4 = new Person("gayle", "westindies");
		Person p5 = new Person("maxwell", "australia");
		List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5);
		boolean status = persons.stream().anyMatch(p -> p.country.equals("India"));
		System.out.println("Any indian available ::" + status);
		boolean status2 = persons.stream().allMatch(p -> p.country.equals("India"));
		System.out.println("All persons from india :" + status2);
		boolean status3 = persons.stream().noneMatch(p -> p.country.equals("newzeland"));
		System.out.println("no persons from newzeland :" + status3);
	}
//	Any indian available ::true
//	All persons from india :false
//	no persons from newzeland :true

}
