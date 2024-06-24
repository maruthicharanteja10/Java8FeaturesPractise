package com.java8Features_2;

import java.util.List;

public class FunctionalProgrammingWithLambdaExp {
	public void sum(int x, int y) {
		int i = x + y;
		System.out.println(i);
	}

	void show(Employeee e) {
		System.out.println(e.getEmpid() + " " + e.getEmpName());
	}

	void run(TestFunctionalProgramming tf) {

	}

	void jump(TestFunctionalProgramming2 tf) {

	}

	public static void main(String[] args) {
		FunctionalProgrammingWithLambdaExp fl = new FunctionalProgrammingWithLambdaExp();
		Employeee e = new Employeee();
		e.setEmpid(8);
		e.setEmpName("charan teja");
		fl.sum(8, 10);// data
		fl.show(e); // we are passing data as a method argument

		TestFunctionalProgramming t = new A();
		fl.run(t);

//		TestFunctionalProgramming t3=()->System.out.println("Lambda");
//		fl.run(t3);
//passing function argument as a method argument is called functional programming
		fl.run(() -> System.out.println("These called as functional programming"));
		fl.jump((x, y) -> {
			int z = x + y;
			return z;
		});
	}
//output
//-------
//	18
//	8 charan teja

}
