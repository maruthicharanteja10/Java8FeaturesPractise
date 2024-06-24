package com.java8Features_All;

import java.util.stream.Stream;

public class ParllelStreamDemo {
	public static void main(String[] args) {
		System.out.println("----Serial Stream-----");
		Stream<Integer> ss = Stream.of(1, 2, 3, 4);
		ss.forEach(n -> System.out.println(n + "::" + Thread.currentThread()));

		System.out.println("-----Parllel Stream-----");
		Stream<Integer> ps = Stream.of(1, 2, 3, 4);
		ps.parallel().forEach(p -> System.out.println(p+ "::" + Thread.currentThread()));
	}
//	----Serial Stream-----
//	1::Thread[main,5,main]
//	2::Thread[main,5,main]
//	3::Thread[main,5,main]
//	4::Thread[main,5,main]
//	-----Parllel Stream-----
//	3::Thread[main,5,main]
//	4::Thread[main,5,main]
//	2::Thread[main,5,main]
//	1::Thread[main,5,main]

}
