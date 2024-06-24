package com.java8Features_All;

import java.util.Optional;
import java.util.Scanner;

class User {
	public String getUserNameById(Integer id) {
		if (id == 100) {
			return "Teja";
		} else if (id == 101) {
			return "virat";
		} else if (id == 102) {
			return "kohli";
		} else {
			return null;
		}
	}

	public Optional<String> getUserName(Integer id) {
		String name = null;
		if (id == 100) {
			name = "Teja";
		} else if (id == 101) {
			name = "virat";
		} else if (id == 102) {
			name = "kohli";
		}
		return Optional.ofNullable(name);
	}
}

public class OptionalClassDemo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter User ID");
		int id = s.nextInt();
		User u = new User();

//		String username = u.getUserNameById(id);
//		if (username != null) {
//			String msg = username.toUpperCase() + " Hello!";
//			System.out.println(msg);
//		} else {
//			System.out.println("Invalid ID");
//		}

		Optional<String> username = u.getUserName(id);
		if (username.isPresent()) {
			String name = username.get();
			System.out.println(name.toUpperCase() + " Hello!");
		} else {
			System.out.println("No Data is found");
		}

	}
}
