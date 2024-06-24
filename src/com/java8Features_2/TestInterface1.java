package com.java8Features_2;

public interface TestInterface1 {
	public void display();

	default void something() {
		System.out.println("In something of default member of interface");
	}

	static void add() {
		System.out.println("In add method");
	}
}
