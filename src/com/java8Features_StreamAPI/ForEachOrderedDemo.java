package com.java8Features_StreamAPI;

import java.util.stream.Stream;

public class ForEachOrderedDemo {
	public static void main(String[] args) {
		System.out.println("----Serial Stream-----");
		Stream<Integer> ss = Stream.of(1, 2, 3, 4);
		ss.forEach(n -> System.out.println(n + "::" + Thread.currentThread()));

		System.out.println("-----Parllel Stream-----");
		Stream<Integer> ps = Stream.of(1, 2, 3, 4);
		ps.parallel().forEach(p -> System.out.println(p + "::" + Thread.currentThread()));

		System.out.println();
		Stream<Integer> sss = Stream.of(1, 2, 3, 4);
		sss.forEachOrdered(n -> System.out.println(n + "::" + Thread.currentThread()));
		Stream<Integer> pss = Stream.of(1, 2, 3, 4);
		pss.parallel().forEachOrdered(n -> System.out.println(n + "::" + Thread.currentThread()));
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
//
//	1::Thread[main,5,main]
//	2::Thread[main,5,main]
//	3::Thread[main,5,main]
//	4::Thread[main,5,main]
//	1::Thread[ForkJoinPool.commonPool-worker-3,5,main]
//	2::Thread[ForkJoinPool.commonPool-worker-1,5,main]
//	3::Thread[ForkJoinPool.commonPool-worker-1,5,main]
//	4::Thread[ForkJoinPool.commonPool-worker-1,5,main]

}
