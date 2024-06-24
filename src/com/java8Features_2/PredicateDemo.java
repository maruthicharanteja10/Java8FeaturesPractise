package com.java8Features_2;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
//	public boolean test(int i) {
//		if (i > 10) {
//			return true;
//		}
//		return false;
//
//	}
	public static void main(String[] args) {
		Predicate<Integer> p = i -> i > 10;
		System.out.println(p.test(8));
		System.out.println(p.test(18));
		
		//Task1 -->Return the person whose name starts with A 
		String[] names= {"Anushka","Virat","Ambani","Ccharn Teja"};
		Predicate<String> p1=name -> name.charAt(0)=='A';
		for(String nameees :names) {
			if(p1.test(nameees)) {
				System.out.println(nameees);
			};
		}
		System.out.println();
		//bi-predicate
		BiPredicate<Integer, Integer> bp=(i,j)->i+j>=30;
		System.out.println(bp.test(2, 19));
		
	}
//	output
//	------
//	false
//	true
//	Anushka
//	Ambani
//
//	false

}
