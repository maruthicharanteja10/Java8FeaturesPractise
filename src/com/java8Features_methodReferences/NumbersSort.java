package com.java8Features_methodReferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NumbersSort {
	public static void main(String[] args) {
		// Approach-1 without lambda
		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(40);
		System.out.println("Before sort : " + al);
		Collections.sort(al, new NumberComparator());
		System.out.println("After sort : " + al);

		// Approach-2 with lambda
		List<Integer> al2 = new ArrayList<>();
		al2.add(90);
		al2.add(20);
		al2.add(50);
		al2.add(40);
		System.out.println("Before sort : " + al2);
		Collections.sort(al2, (i, j) -> i > j ? -1 : 1);
		System.out.println("After sort : " + al2);

	}
//	Before sort : [10, 20, 50, 40]
//	After sort : [50, 40, 20, 10]
//	Before sort : [90, 20, 50, 40]
//	After sort : [90, 50, 40, 20]

}

class NumberComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 > o2) {
			return -1;
		} else if (o1 < o2) {
			return 1;
		}
		return 0;
	}
}
