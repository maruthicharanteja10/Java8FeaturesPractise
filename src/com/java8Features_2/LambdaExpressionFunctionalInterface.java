package com.java8Features_2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaExpressionFunctionalInterface {

	public static void main(String[] args) {

		// whenever you write a lambda that interface should have only 1 abstract method
		// because compiler cannot differentiate which method is implementing by the
		// user
		// predefined functional interfaces -->consumer,function,predicate,supplier
		// which are present in java.util.pacakages
		
		
//----------------------------------------------------------------------------------------------
		
		Consumer<Integer> a = (t) -> {
			System.out.println("Method with paramaters without return type : " + t);
		};
		a.accept(8);

		Function<Integer, Integer> c = (m) -> {
			System.out.println("Method with paramaters with return type : " + (m));
			return m;
		};
		System.out.println(c.apply(10));

		Runnable t4 = () -> {
			System.out.println("Method without paramaters without return type : " + " " + "These is teja");
		};
		t4.run();

		Supplier<String> t5 = () -> {
			return "charan teja reddy";
		};
		System.out.println("Method without paramaters with return type : " + t5.get());

	}
//	output
//	------
//	Method with paramaters without return type : 8
//	Method with paramaters with return type : 10
//	10
//	Method without paramaters without return type :  These is teja
//	Method without paramaters with return type : charan teja reddy

}
