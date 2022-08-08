package com.corejavapart1;

import java.util.Scanner;

public class MaxofNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a,b,c:");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		if (a > b && a > c) {
			System.out.println("a is maximum");
		} else if (b > a && b > c) {
			System.out.println("b is maximum");
		} else {
			System.out.println("c is maximum");
		}
	}
}
