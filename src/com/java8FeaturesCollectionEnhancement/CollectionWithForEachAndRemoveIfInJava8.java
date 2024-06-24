package com.java8FeaturesCollectionEnhancement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CollectionWithForEachAndRemoveIfInJava8 {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);

		System.out.println("Printing data from collection object without java8");
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		System.out.println("Printing data from collection with java8");
		// Consumer<Integer> c=(x)->System.out.println(x);
		l.forEach((x) -> System.out.println(x));
		System.out.println();
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "teja", 20000));
		emp.add(new Employee(2, "virat", 340000));
		emp.add(new Employee(3, "kohli", 45000));
		emp.add(new Employee(4, "sai", 60000));
		emp.add(new Employee(8, "charan", 5000));

		// ForEach

		for (int i = 0; i < emp.size(); i++) {
			System.out.println("Emp Id :" + emp.get(i).getEmpIdl() + "EmpName :" + emp.get(i).getEmpName()
					+ "Emp salary : " + emp.get(i).getSal());
		}
		System.out.println("------------------");
		emp.forEach((v) -> System.out
				.println("Emp Id :" + v.getEmpIdl() + "EmpName :" + v.getEmpName() + "Emp salary : " + v.getSal()));
		System.out.println();
		emp.forEach((v) -> {
			double sal = v.getSal();
			if (sal > 40000) {
				System.out.println(
						"Emp Id :" + v.getEmpIdl() + "EmpName :" + v.getEmpName() + "Emp salary : " + v.getSal());
			}
		});
		// In the above example no need to pass what type of e object is, since we are
		// calling the forEach on the collection object, compiler will understand what
		// type of objects that collection will store
		System.out.println("-------------------------------");
		// RemoveIf
		for (int i = 0; i < emp.size(); i++) {
			if (emp.get(i).getEmpName().startsWith("s"))

				System.out.println("Emp Id :" + emp.get(i).getEmpIdl() + "EmpName :" + emp.get(i).getEmpName()
						+ "Emp salary : " + emp.get(i).getSal());
		}
		System.out.println("------------------");
		emp.removeIf((r) -> r.getEmpName().startsWith("s"));
		emp.forEach((v) -> System.out
				.println("Emp Id : " + v.getEmpIdl() + " EmpName :" + v.getEmpName() + "Emp salary : " + v.getSal()));
	}
//	Printing data from collection object without java8
//	10
//	20
//	30
//	40
//	Printing data from collection with java8
//	10
//	20
//	30
//	40
//
//	Emp Id :1EmpName :tejaEmp salary : 20000.0
//	Emp Id :2EmpName :viratEmp salary : 340000.0
//	Emp Id :3EmpName :kohliEmp salary : 45000.0
//	Emp Id :4EmpName :saiEmp salary : 60000.0
//	Emp Id :8EmpName :charanEmp salary : 5000.0
//	------------------
//	Emp Id :1EmpName :tejaEmp salary : 20000.0
//	Emp Id :2EmpName :viratEmp salary : 340000.0
//	Emp Id :3EmpName :kohliEmp salary : 45000.0
//	Emp Id :4EmpName :saiEmp salary : 60000.0
//	Emp Id :8EmpName :charanEmp salary : 5000.0
//
//	Emp Id :2EmpName :viratEmp salary : 340000.0
//	Emp Id :3EmpName :kohliEmp salary : 45000.0
//	Emp Id :4EmpName :saiEmp salary : 60000.0
//	-------------------------------
//	Emp Id :4EmpName :saiEmp salary : 60000.0
//	------------------
//	Emp Id : 1 EmpName :tejaEmp salary : 20000.0
//	Emp Id : 2 EmpName :viratEmp salary : 340000.0
//	Emp Id : 3 EmpName :kohliEmp salary : 45000.0
//	Emp Id : 8 EmpName :charanEmp salary : 5000.0

}
