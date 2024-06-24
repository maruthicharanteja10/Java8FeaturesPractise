package com.java8Features_2;

public class LambdaExpressionExample {
	public static void add() {
		TestInterface5 tt = () -> {
			return "helloworld";
		};
		System.out.println(tt.hi());
	}

	public static void main(String[] args) {
//Lambda is an anonymous function -->with no modifier,No name,No return type
		// whenever you write a lambda that interface should have only 1 abstract method
		// because compiler cannot differentiate which method is implementing by the
		// user
//from 1.8v java is also called as functional programming language
// functional programming means everything is represented in the form of functions
		// Functions can exist outside of the class
		// Functions can be stored into a reference variable
		// A function can be passed as parameters to0 other methods
		TestInterface2 a = (t) -> {
			System.out.println("Method with paramaters without return type : " + t);
		};
		a.show(8);

		// without using brackets
		// if we have single line in body brackets is optional
		TestInterface3 b = (t) -> t;
		System.out.println("Method with paramaters with return type : " + b.display(10));

		// using brackets
		TestInterface3 c = (m) -> {
			int x = 17;
			System.out.println("Method with paramaters with return type : " + (m + x));
			return m;
		};
		c.display(18);

		TestInterface4 t4 = () -> {
			System.out.println("Method without paramaters without return type : " + " " + "These is teja");
		};
		t4.byee();

		TestInterface5 t5 = () -> {
			return "charan teja reddy";
		};
		System.out.println("Method without paramaters with return type : " + t5.hi());

		add();
	}
//	output
//	---------
//	Method with paramaters without return type : 8
//	Method with paramaters with return type : 10
//	Method with paramaters with return type : 35
//	Method without paramaters without return type :  These is teja
//	Method without paramaters with return type : charan teja reddy
//	helloworld

}
