package com.package4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date date = new Date();
		String timeFormatString = "hh:mm:ss a";
		DateFormat timeFormat = new SimpleDateFormat(timeFormatString);
		String currentTime = timeFormat.format(date);
		System.out.println("Current time: " + currentTime);
		String dateFormatString = "EEE,MMM d,YY";
		DateFormat dateFormat = new SimpleDateFormat(dateFormatString);
		String currentDate = dateFormat.format(date);
		System.out.println("Current date: " + currentDate);
	}

}
