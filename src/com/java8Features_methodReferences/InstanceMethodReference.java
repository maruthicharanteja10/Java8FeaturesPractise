package com.java8Features_methodReferences;

public class InstanceMethodReference {
	public void m1() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		InstanceMethodReference imr = new InstanceMethodReference();
		Runnable r = imr::m1;
		Thread t = new Thread(r);
		t.start();
	}
//	0
//	1
//	2
//	3
//	4
//	5

}
