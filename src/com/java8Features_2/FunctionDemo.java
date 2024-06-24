package com.java8Features_2;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<String, Integer> f = (name) -> {
			return name.length();
			//f=name->name.length()
		};
		System.out.println(f.apply("Charan teja"));
		System.out.println(f.apply("maruthi"));
		
		//Bifunction
		BiFunction<Integer, String, String> bf=(id,name)-> name+" with id "+ id;
		System.out.println(bf.apply(8, "charan"));
	}
//	output
//	--------
//	11
//	7
//	charan with id 8

}
