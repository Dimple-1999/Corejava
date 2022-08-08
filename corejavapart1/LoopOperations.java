package com.corejavapart1;

import java.util.Scanner;

public class LoopOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		/*
		 * int i = s.nextInt(); System.out.println("Enter i value"); for (i = 0; i < 5;
		 * i++) { System.out.println("i"); }
		 */

		int x;
		x = s.nextInt();
		System.out.print("Enter an integer number:");
		if (x % 2 == 0) {
			System.out.print("x is Even number");
		} else {
			System.out.print("x is Odd number");
		}

	}
}
