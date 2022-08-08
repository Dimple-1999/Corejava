package com.package1;

import java.util.Scanner;

public class Calculatesalary {
	static void calculatesal(int salary, int shifts) {
		if (salary < 0) {
			System.out.println("Salary too small");
		} else if (salary > 8000) {
			System.out.println("Salary too large");
		} else if (shifts < 0) {
			System.out.println("Shifts too small");
		} else {
			int savings = (int) (salary * (0.2 + 0.3) + (salary * shifts * 0.02));
			System.out.println(savings);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the salary");
		int salary = s.nextInt();
		int shifts = s.nextInt();
		calculatesal(salary, shifts);
	}
}