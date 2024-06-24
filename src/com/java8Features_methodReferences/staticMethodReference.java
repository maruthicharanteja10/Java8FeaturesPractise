package com.java8Features_methodReferences;

import java.util.function.Consumer;

interface Myinterface {
	public void m1();
}

public class staticMethodReference {
	public static void m2() {
		System.out.println("These is m2 Method");
	}

	public static void main(String[] args) {
		// Method references means reference from one method to another method
//		Consumer<String> c = (msg) -> System.out.println(msg);
//		c.accept("teja"); // these is called consumer based lambda
		// ----------------------------------------------------
		Myinterface mi = staticMethodReference::m2; // static method reference
		mi.m1();
	}
	//These is m2 Method

}
