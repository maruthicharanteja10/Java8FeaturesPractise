package com.java8Features_2;

public class FunctionalThreadInterface {
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {

			}
		});
		Thread t1 = new Thread(() -> System.out.println("Calling run method"));
	}
}
