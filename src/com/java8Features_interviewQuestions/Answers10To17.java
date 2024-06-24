package com.java8Features_interviewQuestions;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Answers10To17 {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 50500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 30200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		System.out.println("------10------");
		Map<String, Long> sales = employeeList.stream().filter(d -> d.getDepartment().equals("Sales And Marketing"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(sales);

		System.out.println("------11------");
		Map<String, Double> avgsal = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(p -> p.getSalary())));
		System.out.println(avgsal);

		System.out.println("------12------");
		Map<String, List<Employee>> nm = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		Set<Map.Entry<String, List<Employee>>> entrySet = nm.entrySet();
		for (Map.Entry<String, List<Employee>> entry : entrySet) {
			System.out.print(entry.getKey() + " : ");
			List<Employee> list = entry.getValue();
			for (Employee e : list) {
				System.out.print(e.getName() + ",");
			}
			System.out.println();
		}

		System.out.println("------13------");
		DoubleSummaryStatistics sal = employeeList.stream().collect(Collectors.summarizingDouble(p -> p.getSalary()));
		System.out.println("Total salary ::" + sal.getSum());
		System.out.println("averag salary ::" + sal.getAverage());

		System.out.println("------14------");
//		seperate the employees who are younger or equal to 25 years 
//		from those employees who are older than 25 years

		Map<Boolean, List<Employee>> older = employeeList.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() > 25));
		Set<Entry<Boolean, List<Employee>>> entrySet1 = older.entrySet();
		for (Entry<Boolean, List<Employee>> entry : entrySet1) {
			if (entry.getKey()) {
				System.err.println("Employees older than 25 years :");
			} else {
				System.err.println("Employees younger than or equal to 25 years :");
			}
			List<Employee> list = entry.getValue();
			for (Employee e : list) {
				System.out.print(e.getName() + ",");
			}
			System.out.println();
		}

		System.out.println("------15------");
		Optional<Employee> oldest = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
		System.out.println("Name ::" + oldest.get().getName() + ",Age :: " + oldest.get().getAge() + ",Department ::"
				+ oldest.get().getDepartment());

		System.out.println("------16------");
		Optional<Employee> secsal = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.skip(1).findFirst();
		System.out.println(secsal.get());
//		List<Employee> secsal1 = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
//				.collect(Collectors.toList());
//		System.out.println(secsal1.get(1));

		System.out.println("------17------");
		 employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.skip(1).forEach(p->System.out.println(p.getName()+"::"+p.getSalary()));
	}
}
