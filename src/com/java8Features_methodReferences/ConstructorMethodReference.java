package com.java8Features_methodReferences;

import java.util.function.Consumer;
import java.util.function.Supplier;

class Doctor {
	public Doctor() {
		System.out.println("Doctor Constructor....!");
	}

	public Doctor(int i) {
		System.out.println("Doctor Constructorwith parameter....!");
	}
}
public class ConstructorMethodReference {
	public static void main(String[] args) {
		// Doctor d = new Doctor();
		Supplier s = Doctor::new;
		System.out.println(s.get().hashCode());

		// It will not allow parameterized constructor
	}
//	Doctor Constructor....!
//	557041912

}
