package com.java8Features_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1 implements TestDemo {

	@Override
	public void display() {
		System.out.println("In Example1 display method");
	}

	@Override
	public void hello() {
		System.out.println("Hello guys");
	}

	public void abc() {
		// InterfaceName.super.Methodname
		TestDemo.super.something();
	}

	static void add() {// it is redefined not overridden
		System.out.println("In example 1 add method");
	}

	public static void main(String[] args) {
		// we can access static method present in interface
		// InterfaceName.staticmethodName()
		TestDemo.add();// to get parent class default method
		Example1.add();// To get static method in the same class
		Example1 e1 = new Example1();
		e1.abc();
		e1.display();
		e1.hello();
		Example1 e2 = null;
		e2.add();
		TestDemo.done();// To get parent class static method

		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		// collection--interface
		// collections--class
		Collections.synchronizedList(l);
	}

//	output
// ------
//	In add method
//	In example 1 add method
//	In something of default member of interface
//	In Example1 display method
//	Hello guys
//	In example 1 add method
//	Interface is done...!

}
