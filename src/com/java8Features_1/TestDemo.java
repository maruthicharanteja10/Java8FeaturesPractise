package com.java8Features_1;

public interface TestDemo {
	public void display();

	void hello();

//Interface has concrete methods from 1.8 version
	// Interface concrete method should have static and default method
	// the default in java8 interface will provide backward compatability
	// it can be overridden in implementation classes
	default void something() {
		System.out.println("In something of default member of interface");
	}

	default void show() {
		System.out.println("In show method");
	}

	// static methods cannot be overridden in implementation classes
	static void done() {
		System.out.println("Interface is done...!");
	}

	static void add() {
		System.out.println("In add method");
	}

	private void hi() {
		System.out.println("In hi method");
	}
}
