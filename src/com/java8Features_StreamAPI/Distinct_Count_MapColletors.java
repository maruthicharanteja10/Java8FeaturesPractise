package com.java8Features_StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Distinct_Count_MapColletors {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(71, 80, 53, 8, 18, 18, 26, 80, 44, 8, 53);
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "teja", 20000));
		emp.add(new Employee(2, "virat", 340000));
		emp.add(new Employee(2, "maruthi", 340000));
		emp.add(new Employee(3, "kohli", 45000));
		emp.add(new Employee(4, "sai", 60000));
		emp.add(new Employee(8, "charan", 5000));
		// Write a program to print number of duplicate elements
		int duplicateElements = (int) ((int) numbers.size() - numbers.stream().distinct().count());
		System.out.println("Duplicate Elements in the list :" + duplicateElements);
		// To remove duplicates from a given list
		numbers.stream().distinct().forEach(p -> System.out.print(p + " "));
		System.out.println();
// distinct in collections we added hashcode and equals as a default for these to execute
		emp.stream().distinct().forEach((p) -> System.out.println(p));

		// Write a program to convert given emplist into hashmap<empId,Emp>
		Map<Integer, Employee> mp = emp.stream().distinct().collect(Collectors.toMap(p -> p.getEmpIdl(), p -> p));
		System.out.println("Object Key : " + mp);

		// Write a program to create a list of emp names whose name starts with k or A
		List<String> s1 = emp.stream().filter(p -> p.getEmpName().startsWith("k") || p.getEmpName().startsWith("c"))
				.map(q -> q.getEmpName()).collect(Collectors.toList());
		System.out.println("Names of the Employees : " + s1);
	}
//	Duplicate Elements in the list :4
//	71 80 53 8 18 26 44 
//	empId : 1 EmpName : teja, sal : 20000.0
//	empId : 2 EmpName : virat, sal : 340000.0
//	empId : 3 EmpName : kohli, sal : 45000.0
//	empId : 4 EmpName : sai, sal : 60000.0
//	empId : 8 EmpName : charan, sal : 5000.0
//	Object Key : {1=empId : 1 EmpName : teja, sal : 20000.0, 2=empId : 2 EmpName : virat, sal : 340000.0, 3=empId : 3 EmpName : kohli, sal : 45000.0, 4=empId : 4 EmpName : sai, sal : 60000.0, 8=empId : 8 EmpName : charan, sal : 5000.0}
//	Names of the Employees : [kohli, charan]

}
