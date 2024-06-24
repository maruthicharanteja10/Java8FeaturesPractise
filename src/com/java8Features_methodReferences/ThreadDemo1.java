package com.java8Features_methodReferences;

//Approach-1
public class ThreadDemo1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		ThreadDemo1 td = new ThreadDemo1();
		Thread t = new Thread(td);
		t.start();
		System.out.println("--1--");
		// Approach-2
		Runnable rrr = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i <= 10; i++) {
					System.out.println(i);
				}
			}
		};
		Thread t2 = new Thread(rrr);
		t2.start();
		System.out.println("--2--");
		// Approach-3 using lambda expression
		Runnable rr = () -> {
			for (int i = 11; i <= 20; i++) {
				System.out.println(i);
			}
		};
		Thread tt = new Thread(rr);
		tt.start();
	}
//	--1--
//	0
//	1
//	2
//	3
//	4
//	5
//	6
//	7
//	8
//	9
//	10
//	--2--
//	0
//	1
//	2
//	3
//	4
//	5
//	6
//	7
//	8
//	9
//	10
//	11
//	12
//	13
//	14
//	15
//	16
//	17
//	18
//	19
//	20
}
