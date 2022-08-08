package com.corejavapart1;

import java.util.Scanner;

public class DaySwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		/*
		 * int week = 0; System.out.println("Enter week value:"); week = s.nextInt();
		 * String day; switch (week) { case 1: System.out.println("Sunday"); break; case
		 * 2: System.out.println("Monday"); break; case 3:
		 * System.out.println("Tuesday"); break;
		 * 
		 * case 4: System.out.println("Wednesday"); break; case 5:
		 * System.out.println("Thursday"); break; case 6: System.out.println("Friday");
		 * break; case 7: System.out.println("Saturday"); break; default:
		 * System.out.println("Invalid day");
		 * 
		 * }
		 */
		System.out.println("Enter subject marks");
		System.out.println("Enter sub_1_marks");
		int sub_1_marks = s.nextInt();
		System.out.println("Enter sub_2_marks");
		int sub_2_marks = s.nextInt();
		System.out.println("Enter sub_3_marks");
		int sub_3_marks = s.nextInt();
		// calulatng the average
		int avg = (sub_1_marks + sub_2_marks + sub_3_marks) / 3;
		System.out.println("percentage:" + avg);
		float grade = avg / 10;
		switch (avg / 10) {
		case 9:
			System.out.println("99");
			break;
		case 8:
			System.out.println("88");
			break;
		case 7:
			System.out.println("77");
			break;
		}

	}

}
