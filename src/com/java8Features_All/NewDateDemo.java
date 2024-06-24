package com.java8Features_All;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class NewDateDemo {
	public static void main(String[] args) {
		LocalDate of=LocalDate.of(2002, 5, 18);
		System.out.println(of);
		LocalDate date = LocalDate.now();
		System.out.println(date);
		date = date.plusDays(8);
		System.out.println(date);
		date = date.plusMonths(2);
		System.out.println(date);
		date = date.plusYears(-2);
		System.out.println(date);
		boolean leapyear = LocalDate.parse("2002-05-10").isLeapYear();
		System.out.println("Leap Year :" + leapyear);
		boolean beforeyear = LocalDate.parse("2022-05-10").isBefore(LocalDate.parse("2023-05-10"));
		System.out.println("before year :" + beforeyear);
		boolean afteryear = LocalDate.parse("2024-05-10").isAfter(LocalDate.parse("2023-05-10"));
		System.out.println("before year :" + afteryear);
		System.out.println("-----------------------");
		LocalTime time = LocalTime.now();
		System.out.println(time);
		time = time.plusHours(8);
		System.out.println(time);
		System.out.println("-----------------------");
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		LocalDateTime localdatetime1 = LocalDateTime.of(2002, 05, 10, 8, 18, 10, 6400);
		System.out.println(localdatetime1);
		LocalDate date1 = LocalDate.of(2020, 8, 18);
		LocalTime time1 = LocalTime.of(8, 44);
		System.out.println(date1);
		System.out.println(time1);
		LocalDateTime lodati = LocalDateTime.of(date1, time1);
		System.out.println(lodati);
		System.out.println("------------------------");
		Period p=Period.ofDays(8);
		System.out.println(p);
		Period between=Period.between(LocalDate.parse("2002-05-10"), LocalDate.now());
		System.out.println(between);
		System.out.println(between.getYears());
		Duration duration=Duration.between(LocalTime.parse("18:18"), LocalTime.now());
		System.out.println(duration);
		System.out.println();
		ZonedDateTime indianTime=ZonedDateTime.now();
		System.out.println(indianTime);
		ZonedDateTime TimeUtc=indianTime.withZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println(TimeUtc);
	}
//	2002-05-18
//	2024-06-18
//	2024-06-26
//	2024-08-26
//	2022-08-26
//	Leap Year :false
//	before year :true
//	before year :true
//	-----------------------
//	21:58:12.127154800
//	05:58:12.127154800
//	-----------------------
//	2024-06-18T21:58:12.128153300
//	2002-05-10T08:18:10.000006400
//	2020-08-18
//	08:44
//	2020-08-18T08:44
//	------------------------
//	P8D
//	P22Y1M8D
//	22
//	PT3H40M12.1321997S
//
//	2024-06-18T21:58:12.135166500+05:30[Asia/Calcutta]
//	2024-06-18T12:28:12.135166500-04:00[America/New_York]

}
