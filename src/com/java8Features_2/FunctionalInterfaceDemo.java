package com.java8Features_2;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
	public void show();
	// @Functional interface annotation will not allow to add more than one abstract
	// method in interface

	default void m1() {

	}

	default void m2() {

	}

	static void m3() {

	}

	static void m4() {

	}
	// But it allows any number of default and static methods in interface
}
