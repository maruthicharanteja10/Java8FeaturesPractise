package com.java8Features_StreamAPI;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java8FeaturesCollectionEnhancement.Employee;

public class StreamDemo {
	public void m1(int... a) {
		System.out.println(a.length);
	}

	public static boolean validateName(String s) {
		if (s.startsWith("k")) {
			return true;
		} else {
			return false;
		}
	}

	public static String getName(Employee employee) {
		// TODO Auto-generated method stub
		return employee.getEmpName();
	}

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.addAll(Arrays.asList(10, 20, 30, 40, 50));
		for (Object l : al) {
			System.out.println(l);
		}
		// Collection data structure
		// LinkedList ,stack and queue ,ArrayList->DataStructures
		// stream ->is used to perform the operations on collection object

		// Create a stream
		Stream s = Stream.of(1, 2, 4, 5, "teja");
		Stream<String> s1 = Stream.of("teja", "charan", "sai", "virat");
		// java 1.5-> var-args or variable arguments
		StreamDemo sd = new StreamDemo();
		sd.m1(10);
		sd.m1(10, 20);
		sd.m1(10, 20, 30);
		sd.m1(10, 20, 30, 40, 50, 60);
		// using collections
		List<Employee> emp = new ArrayList<>();
		List<String> empNameList = new ArrayList<>();
		emp.add(new Employee(1, "teja", 20000));
		emp.add(new Employee(2, "virat", 340000));
		emp.add(new Employee(3, "kohli", 45000));
		emp.add(new Employee(4, "sai", 60000));
		emp.add(new Employee(8, "charan", 5000));
		List<Integer> numbers = new ArrayList<>();
		numbers.addAll(Arrays.asList(2, 3, 5, 12, 18, 8, 10));
		for (int i = 0; i < emp.size(); i++) {
//			if (emp.get(i).getEmpName().startsWith("k")) {
//				System.out.println(emp.get(i).getEmpName());
//			}
//			if (validateName(emp.get(i).getEmpName())) {
//				System.out.println(emp.get(i).getEmpName());
//			}
			// To add names in seperate list
			String name = getName(emp.get(i));
			empNameList.add(name);
		}
		// Using Stream
		System.out.println("Code with Stream");
		emp.stream().filter((r) -> r.getEmpName().startsWith("c")).forEach((t) -> System.out.println(t.getEmpName()));
		System.out.println(emp.stream().filter((r) -> r.getEmpName().startsWith("c")));
		// Intermediate operation will not give output
		// Terminal operation will only give outputs
		// Intermediate operations-->filter,map
		// Terminal Operation-->forEach
		// -----------------------------
		// Write a program to collect employee names into separate list from emplist
		List<String> EmpNameList = emp.stream().map((c) -> c.getEmpName()).collect(Collectors.toList());
		System.out.println("EmpName Using Stream" + EmpNameList);
		//------------------------------------------
		// To find even numbers in a arraylist
		numbers.stream().filter((e) -> (e % 2 == 0)).forEach(u -> System.out.print(u+" "));
		Set<Integer> sss = numbers.stream().filter((e) -> (e % 2 == 0)).collect(Collectors.toSet());
		System.out.println();
		System.out.println(sss);
        //-------------------------------------------
		// Write a program to collect employee ids into separate list from emplist
		emp.stream().map(id->id.getEmpIdl()).collect(Collectors.toList());
	}
//	10
//	20
//	30
//	40
//	50
//	1
//	2
//	3
//	6
//	Code with Stream
//	charan
//	java.util.stream.ReferencePipeline$2@1e643faf
//	EmpName Using Stream[teja, virat, kohli, sai, charan]
//	2 12 18 8 10 
//	[2, 18, 8, 10, 12]

}
