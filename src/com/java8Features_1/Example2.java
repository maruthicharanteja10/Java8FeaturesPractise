package com.java8Features_1;

public class Example2 implements TestDemo {

	@Override
	public void display() {
		System.out.println("In Example2 display method");
	}

	@Override
	public void hello() {
		System.out.println("Hello guys");
	}

	@Override
	public void something() {
		System.out.println("In overriden of something method froom testdemo");
	}

	public static void main(String[] args) {
		Example2 e2 = new Example2();
		e2.something();
		e2.display();
		e2.hello();
	}

//	output
//	------------
//	In overriden of something method froom testdemo
//	In Example2 display method
//	Hello guys

}
