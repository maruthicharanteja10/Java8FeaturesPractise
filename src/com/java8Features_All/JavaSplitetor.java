package com.java8Features_All;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class JavaSplitetor {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("teja", "virat", "kohli");
		Spliterator<String> sp = names.stream().spliterator();
		sp.forEachRemaining(p -> System.out.println(p));
	}
//	teja
//	virat
//	kohli

}
