package com.java8Features_2;

public interface FunctionalInterfacePredefinedMethods {
	void show(int x); // consumer -->use accept to call a functional interface method

	String display(int y); // function -->taking some arguments and returning some arguments

	void bye();// runnable

	Object hi(); // supplier -->Not taking any parameters but returning something

	boolean check(double y); // predicate -->test(T t)
	// predicate-->It is used to check the condition and it returns true of false
}
