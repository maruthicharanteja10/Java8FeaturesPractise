package com.java8Features_All;

import java.util.StringJoiner;

public class StringJoinerDemo {
	public static void main(String[] args) {
		
		StringJoiner sj = new StringJoiner("-");
		sj.add("maruthi");
		sj.add("Charan");
		sj.add("Teja");
		System.out.println(sj);
		StringJoiner sj2 = new StringJoiner("-", "(", ")");
		sj2.add("maruthi");
		sj2.add("Charan");
		sj2.add("Teja");
		System.out.println(sj2);
	}
//	maruthi-Charan-Teja
//	(maruthi-Charan-Teja)

}
