package com.java8Features_StreamAPI;

import java.util.ArrayList;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("teja");
		names.add("virat");
		names.add("kohli");
		names.add("sai");
		names.add("charan");
		names.add("virat");
		names.add("cherry");
		names.add("maruthi ");
		System.out.println(names.stream().collect(Collectors.groupingBy((p) -> p, Collectors.counting())));
		System.out.println();
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "teja", 20000));
		emp.add(new Employee(2, "virat", 340000));
		emp.add(new Employee(2, "maruthi", 340000));
		emp.add(new Employee(3, "kohli", 45000));
		emp.add(new Employee(4, "sai", 60000));
		emp.add(new Employee(10, "kohli", 45000));
		emp.add(new Employee(4, "sai", 60000));
		emp.add(new Employee(8, "charan", 5000));

		Map<String, List<Employee>> ee = emp.stream().collect(Collectors.groupingBy(p -> p.getEmpName()));
		System.out.println(ee);
		System.out.println();
		System.out.println(emp.stream().collect(Collectors.groupingBy(p -> p.getEmpName(), Collectors.counting())));
		System.out.println(emp.stream().collect(Collectors.groupingBy(p -> p.getEmpName())));
		System.out.println();
		DoubleSummaryStatistics d = emp.stream().collect(Collectors.summarizingDouble(p -> p.getSal()));
		System.out.println(d);
		System.out.println("Max salary : " + d.getMax());
		System.out.println("Min salary : " + d.getMin());
		System.out.println("Avg salary : " + d.getAverage());

	}
//	{cherry=1, virat=2, charan=1, kohli=1, sai=1, maruthi =1, teja=1}
//
//	{virat=[empId : 2 EmpName : virat, sal : 340000.0], charan=[empId : 8 EmpName : charan, sal : 5000.0], maruthi=[empId : 2 EmpName : maruthi, sal : 340000.0], kohli=[empId : 3 EmpName : kohli, sal : 45000.0, empId : 10 EmpName : kohli, sal : 45000.0], sai=[empId : 4 EmpName : sai, sal : 60000.0, empId : 4 EmpName : sai, sal : 60000.0], teja=[empId : 1 EmpName : teja, sal : 20000.0]}
//
//	{virat=1, charan=1, maruthi=1, kohli=2, sai=2, teja=1}
//	{virat=[empId : 2 EmpName : virat, sal : 340000.0], charan=[empId : 8 EmpName : charan, sal : 5000.0], maruthi=[empId : 2 EmpName : maruthi, sal : 340000.0], kohli=[empId : 3 EmpName : kohli, sal : 45000.0, empId : 10 EmpName : kohli, sal : 45000.0], sai=[empId : 4 EmpName : sai, sal : 60000.0, empId : 4 EmpName : sai, sal : 60000.0], teja=[empId : 1 EmpName : teja, sal : 20000.0]}
//
//	DoubleSummaryStatistics{count=8, sum=915000.000000, min=5000.000000, average=114375.000000, max=340000.000000}
//	Max salary : 340000.0
//	Min salary : 5000.0
//	Avg salary : 114375.0

}
