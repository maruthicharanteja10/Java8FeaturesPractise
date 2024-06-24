package com.java8Features_2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person {
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

//Task
//To list and printy the name of persons whose age is >=18 
public class PredicateDemo1 {
	public static void main(String[] args) {
		Person p1 = new Person("Teja", 22);
		Person p2 = new Person("Tejareddy", 32);
		Person p3 = new Person("Teja", 42);
		Person p4 = new Person("Teja", 12);
		Person p5 = new Person("Teja", 17);
		List<Person> l = Arrays.asList(p1, p2, p3, p4, p5);

		Predicate<Person> p = n -> n.age >= 18;
		for (Person person : l) {
			if (p.test(person)) {
				System.out.println(person.name);
			}
		}
	}
//	output
//	Teja
//	Tejareddy
//	Teja

}
