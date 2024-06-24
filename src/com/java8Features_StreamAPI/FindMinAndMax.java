package com.java8Features_StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java8FeaturesCollectionEnhancement.Employee;

public class FindMinAndMax {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.addAll(Arrays.asList(26, 8, 71, 35, 80, 44, 53));

		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "teja", 20000));
		emp.add(new Employee(2, "virat", 340000));
		emp.add(new Employee(3, "kohli", 45000));
		emp.add(new Employee(4, "sai", 60000));
		emp.add(new Employee(8, "charan", 5000));
		// Write a program to get min number from Arraylist
		// Approach-1
		/*
		 * int minvalue=numbers.get(0); for(int i=0;i<al.size();i++) {
		 * if(numbers.get(i)<minvalue) { minvalue=numbers.get(i); } }
		 * System.out.println(minvalue);
		 */
		int minvalue = numbers.stream().min((t1, t2) -> (t1 < t2) ? -1 : (t1 == t2) ? 0 : 1).get();
		System.out.println("Min value : " + minvalue);
		// Write a program to get max number from Arraylist
		int maxvalue = numbers.stream().max((t1, t2) -> (t1 < t2) ? -1 : (t1 == t2) ? 0 : 1).get();
		System.out.println("Max value : " + maxvalue);
		// Using collections
		// Write a program to find min salary in employee list
		Employee e1 = emp.stream()
				.min((t1, t2) -> (t1.getSal() < t2.getSal()) ? -1 : t1.getSal() == t2.getSal() ? 0 : 1).get();
		System.out.println("Min salary with Emp name: " + e1.getEmpName() + " - " + e1.getSal());

		Employee e2 = emp.stream()
				.max((t1, t2) -> (t1.getSal() < t2.getSal()) ? -1 : t1.getSal() == t2.getSal() ? 0 : 1).get();
		System.out.println("Max salary with Emp name: " + e2.getEmpName() + " - " + e2.getSal());
		Optional<Employee> e3 = emp.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.getSal())));
		System.out.println("Max salary ::" + e3.get().getEmpName() + "-" + e3.get().getSal());
		Optional<Employee> e4 = emp.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.getSal())));
		System.out.println("Min salary ::" + e4.get().getEmpName() + "-" + e4.get().getSal());
		Double avg=emp.stream().collect(Collectors.averagingDouble(p->p.getSal()));
		System.out.println(avg);
	}
//	Min value : 8
//	Max value : 80
//	Min salary with Emp name: charan - 5000.0
//	Max salary with Emp name: virat - 340000.0
//	Max salary ::virat-340000.0
//	Min salary ::charan-5000.0
//	94000.0

}
