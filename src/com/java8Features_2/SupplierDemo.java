package com.java8Features_2;

import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		Supplier<String> s = () -> {
			String otp = "";
			for (int i = 1; i <= 5; i++) {
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}
//	21211
//	05953
//	64532
//	00428

}
