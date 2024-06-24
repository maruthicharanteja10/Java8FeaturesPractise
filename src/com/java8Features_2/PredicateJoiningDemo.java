package com.java8Features_2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee {
	String name;
	String dept;
	String location;

	public Employee(String name, String dept, String location) {
		this.name = name;
		this.dept = dept;
		this.location = location;
	}

}


public class PredicateJoiningDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee("teja", "developer", "hyd");
		Employee e2 = new Employee("virat", "cyber", "hyd");
		Employee e3 = new Employee("tarun", "tester", "banglore");
		Employee e4 = new Employee("sai", "developer", "hyd");
		List<Employee> emps = Arrays.asList(e1, e2, e3, e4);
		Predicate<Employee> p1 = m -> m.location.equals("hyd");
		Predicate<Employee> p2 = n -> n.dept.equals("developer");

		// predicate joining
		Predicate<Employee> p = p1.and(p2);
	
		//Display names of employees who are working in hyd location and  a developer
		for (Employee emp : emps) {
			if (p.test(emp)) {
				System.out.println(emp.name);
			}
		}
		System.out.println();
		//Display names of employees who are working in hyd lo9cation  or a developer
		Predicate<Employee> pp = p1.or(p2);
		for (Employee emp : emps) {
			if (pp.test(emp)) {
				System.out.println(emp.name);
			}
		}
		System.out.println();
		//Display names of employees who are working in hyd location,developer and name srts with t
		Predicate<Employee> p3=c->c.name.startsWith("t");
		Predicate<Employee> ppp = p1.and(p2).and(p3);
		for (Employee emp : emps) {
			if (ppp.test(emp)) {
				System.out.println(emp.name);
			}
		}
	}
	
//	teja
//	sai
//
//	teja
//	virat
//	sai
//
//	teja

}
