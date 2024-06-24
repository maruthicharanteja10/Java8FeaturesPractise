package com.java8Features_StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorAndComparableExample implements Comparator<Integer> {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		List<Integer> al2 = new ArrayList<>();
		al.addAll(Arrays.asList(10, 60, 90, 20, 40));
		al2.addAll(Arrays.asList(30, 10, 88, 71, 18, 35));
		System.out.println(al);// insertion order

		// Write a program to sort array list in ascending order
		Collections.sort(al);
		System.out.println(al);
		System.out.println("Sorting method before :" + al);
		Collections.sort(al, new ComparatorAndComparableExample());
		System.out.println("Sorting method after :" + al);

		System.out.println(al2);
		Collections.sort(al2, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return (o1 < o2) ? 1 : o1 == o2 ? 0 : -1;
			}
		});
		System.out.println(al2);

	}

	@Override
	public int compare(Integer o1, Integer o2) {

		return (o1 < o2) ? 1 : ((o1 == o2) ? 0 : -1);
	}
//	[10, 60, 90, 20, 40]
//	[10, 20, 40, 60, 90]
//	Sorting method before :[10, 20, 40, 60, 90]
//	Sorting method after :[90, 60, 40, 20, 10]
//	[30, 10, 88, 71, 18, 35]
//	[88, 71, 35, 30, 18, 10]

}
