package com.java8Features_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1 {

	static void add() {
		System.out.println("In example 1 add method");
	}

	public static void main(String[] args) {

		TestInterface1.add();
		Example1.add();
		Example1 e1 = new Example1();

		// lambda correspondance to an interface and specifically abstract method
		// present in interface
		// whenever you write a lambda that interface should have only 1 abstract method
		String s = "Teja";
		int i = 10;
		// Lambda Expression
		// (Without implementing interface we can use method of interface)
		TestInterface1 t = () -> {
			int x = 10;
			System.out.println("In Example1 display method : " + x);
		};
		t.display();
		TestInterface1 t1 = () -> System.out.println("In Example 1 methodddds");
		t1.display();
	}
//output
//-------
//In add method
//In example 1 add method
//In Example1 display method : 10
//In Example 1 methodddds

}
