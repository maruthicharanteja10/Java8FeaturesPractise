package com.java8Features_interviewQuestions;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Answers1To9 {
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

		System.out.println("------1------");
		// method-1
		Map<String, Long> map1 = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(map1);
		// method-2
		long totalcount = employeeList.stream().count();
		System.out.println("total count of employees : " + totalcount);
		Long malecount = employeeList.stream().filter(p -> p.gender.equals("Male")).count();
		System.out.println("Male count : " + malecount);
		System.out.println("Female count : " + (totalcount - malecount));

		System.out.println("------2------");
		employeeList.stream().map(e -> e.department).distinct().forEach(p -> System.out.println(p));
//		employeeList.stream().map(Employee::getDepartment).distinct().forEach(p -> System.out.println(p));

		System.out.println("------3------");
		Map<String, Double> avgg = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(p -> p.getAge())));
		System.out.println(avgg);
//		DoubleSummaryStatistics dm = employeeList.stream().filter(p -> p.gender.equals("Male"))
//				.collect(Collectors.summarizingDouble(p -> p.getAge()));
//		System.out.println(dm.getAverage());

		System.out.println("------4------");
		Employee ee = employeeList.stream()
				.max((t1, t2) -> (t1.getSalary() < t2.getSalary()) ? -1 : (t1.getSalary() == t2.getSalary()) ? 0 : 1)
				.get();
		System.out.println(ee);

//		Optional<Employee> eee = employeeList.stream()
//				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
//		if (eee.isPresent()) {
//			Employee emp = eee.get();
//			System.out.println(emp);
//		}

		System.out.println("------5------");
		employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(i -> i.name)
				.forEach(name -> System.out.println(name));

		System.out.println("------6------");
		Map<String, Long> dpcount = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(dpcount);

		System.out.println("------7------");
		Map<String, Double> avgsalDep = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(p -> p.getSalary())));
		System.out.println(avgsalDep);

		System.out.println("------8------");
		Optional<Employee> emp1 = employeeList.stream()
				.filter(e -> e.getGender().equals("Male") && e.getDepartment().equals("Product Development"))
				.min(Comparator.comparing(Employee::getAge));
		if (emp1.isPresent()) {
			Employee e1 = emp1.get();
			System.out.println(e1);
		}

		System.out.println("------9------");
		Employee exp = employeeList.stream().min((t1, t2) -> (t1.getYearOfJoining() < t2.getYearOfJoining()) ? -1
				: t1.getYearOfJoining() == t2.getYearOfJoining() ? 0 : 1).get();
		System.out.println(exp);
		// Optional<Employee> exp = employeeList.stream()
//		.collect(Collectors.minBy(Comparator.comparing(p -> p.getYearOfJoining())));

	}
}
