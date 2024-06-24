package com.java8Features_StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Limit_Skip {
	public static void main(String[] args) {
		List<String> javaCourses = Arrays.asList("advancejava", "core", "hibernate", "springboot", "restApi",
				"microservices");
		javaCourses.stream().limit(3).forEach(p -> System.out.println(p));
		System.out.println();
		javaCourses.stream().skip(3).forEach(p -> System.out.println(p));
//Write a stream program to display the second largest number
		List<Integer> numbers = Arrays.asList(10, 8, 80, 71, 17, 18, 35, 44, 143, 53);
		System.out.print("Second largest number is : ");
		numbers.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).forEach(p -> System.out.println(p));
		System.out.print("Second smallest number is : ");
		numbers.stream().sorted().limit(2).skip(1).forEach(p -> System.out.println(p));
		System.out.print("third largest number is : ");
		numbers.stream().sorted(Collections.reverseOrder()).limit(3).skip(2).forEach(p -> System.out.println(p));
	}
//	advancejava
//	core
//	hibernate
//
//	springboot
//	restApi
//	microservices
//	Second largest number is : 80
//	Second smallest number is : 10
//	third largest number is : 71

}
