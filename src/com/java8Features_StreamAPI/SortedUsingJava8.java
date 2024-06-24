package com.java8Features_StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;



public class SortedUsingJava8 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.addAll(Arrays.asList(26, 8, 71, 35, 80, 44, 53));

		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "teja", 20000));
		emp.add(new Employee(2, "virat", 340000));
		emp.add(new Employee(3, "kohli", 45000));
		emp.add(new Employee(4, "sai", 60000));
		emp.add(new Employee(8, "charan", 5000));
		
		// Write a program to sort the list of numbers
		System.out.println("Sorted Numbers : " + numbers.stream().sorted().collect(Collectors.toList()));
		// Write a program to sort the list of numbers in descending order
		System.out.println("Sorted Numbers descending : "
				+ numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));

		// sorting using comparator
		System.out.println("Sorted Numbers using comparator : "
				+ numbers.stream().sorted((t1, t2) -> (t1 < t2) ? -1 : t1 == t2 ? 0 : 1).collect(Collectors.toList()));
		System.out.println("sort in desending using comparator : "
				+ numbers.stream().sorted((t1, t2) -> (t1 < t2) ? 1 : t1 == t2 ? 0 : -1).collect(Collectors.toList()));
		
		// collections sorting of Employees
		System.out.println("sort of employees");
		emp.stream().sorted().forEach((p) -> System.out.println(p));
		// collections sorting of Employees in reverse order
		System.out.println("Sort of employees in descending order");
		emp.stream().sorted(Collections.reverseOrder()).forEach((p) -> System.out.println(p));

		//Sort based on Employee salary
		System.out.println("Sort based on Employee salary");
		emp.stream().sorted((t1,t2)->t1.getSal()<t2.getSal()?-1:t1.getSal()==t2.getSal()?0:1).forEach(p->System.out.println(p));
		//Sort based on Employee salary
		System.out.println("Sort based on Employee salary in descending order");
		emp.stream().sorted((t1,t2)->t1.getSal()<t2.getSal()?1:t1.getSal()==t2.getSal()?0:-1).forEach(p->System.out.println(p));

	}
}
