package com.package4;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("Current date: " + date);
		//
		LocalTime time = LocalTime.now();
		System.out.println("Current time: " + time);
		//
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Current date-time: " + dateTime);
	}

}
