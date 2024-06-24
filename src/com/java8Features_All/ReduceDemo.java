package com.java8Features_All;
import java.util.Arrays;
public class ReduceDemo {
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5 };
//		int sum = 0;
//		for (int i : num) {
//			sum = sum + i;
//		}
//		System.out.println(sum);

		int reduce=Arrays.stream(num).reduce(0, (a,b)->a+b);
		System.out.println(reduce);
	}
}
