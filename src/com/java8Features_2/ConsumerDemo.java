package com.java8Features_2;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<String> c = (name) -> System.out.println(name + ", Good Morning..!");
		c.accept("Teja");
		c.accept("Sai");

		List<Integer> l = Arrays.asList(10, 20, 30, 40, 50);
		// for loop,for each loop,iterator,list iterator
		l.forEach(m -> System.out.println(m));

		// BiConsumer
		BiConsumer<Integer, String> bc = (id, name) -> System.out
				.println("Your Id :" + id + " " + "with name :" + name);
		bc.accept(8, "tej");
	}
//	output 
//	-------
//	Teja, Good Morning..!
//	Sai, Good Morning..!
//	10
//	20
//	30
//	40
//	50
//	Your Id :8 with name :tej

}
