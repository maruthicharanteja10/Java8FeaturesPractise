package com.java8Features_All;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.io.*;

public class Input_output_StreamsInJava {
	public static void main(String[] args) throws Exception {
		// write a program to read a file data and print on its console
//		FileReader fr = new FileReader(new File("info.txt"));
//		BufferedReader br = new BufferedReader(fr);
//		String line = br.readLine();
//		while (line != null) {
//			System.out.println(line);
//			line=br.readLine();
//		}
//		br.close();
		String filename = "info.txt";
		List<String> lines = new ArrayList<>();
		try (Stream<String> stream = Files.lines(Paths.get(filename))) {
//			stream.forEach(line -> System.out.println(line));
			stream.filter(line -> line.startsWith("H")).forEach(line -> System.out.println(line));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
