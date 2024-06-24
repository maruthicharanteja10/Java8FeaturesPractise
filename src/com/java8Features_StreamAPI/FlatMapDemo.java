package com.java8Features_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {
	public static void main(String[] args) {
		List<String> javaCourses = Arrays.asList("advancejava", "core", "hibernate", "springboot");
		List<String> uicourses = Arrays.asList("html", "js", "css", "bootstrap");
		List<List<String>> courses = Arrays.asList(javaCourses, uicourses);
		courses.stream().forEach(p -> System.out.println(p));
		Stream<String> fms = courses.stream().flatMap(s -> s.stream());
		fms.forEach(c -> System.out.println(c));
	}
//	[advancejava, core, hibernate, springboot]
//	[html, js, css, bootstrap]
//	advancejava
//	core
//	hibernate
//	springboot
//	html
//	js
//	css
//	bootstrap

}
