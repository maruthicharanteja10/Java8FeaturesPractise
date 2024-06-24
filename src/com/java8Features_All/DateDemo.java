package com.java8Features_All;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) throws Exception {
		Date d = new Date();
		System.out.println(d);
		// Converting date to string
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String format = sdf.format(d);
		System.out.println(format);
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-yyyy");
		String format1 = sdf1.format(d);
		System.out.println(format1);
		// Convert string to date
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		Date parsedDate = sdf2.parse("2002-05-10");
		System.out.println(parsedDate);

		System.out.println("----------------------");
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		LocalDateTime localdatetime1 = LocalDateTime.of(2002, 05, 10, 8, 18, 10, 6400);
		System.out.println(localdatetime1);
		LocalDate date = LocalDate.of(2024, 8, 18);
		LocalTime time = LocalTime.of(8, 44);
		System.out.println(date);
		System.out.println(time);
		LocalDateTime lodati = LocalDateTime.of(date, time);
		System.out.println(lodati);
	}
//	Tue Jun 18 21:57:12 IST 2024
//	18/06/2024
//	06-18-2024
//	Fri May 10 00:00:00 IST 2002
//	----------------------
//	2024-06-18T21:57:12.724745600
//	2002-05-10T08:18:10.000006400
//	2024-08-18
//	08:44
//	2024-08-18T08:44

}
