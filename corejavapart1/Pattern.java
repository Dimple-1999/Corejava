package com.corejavapart1;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = s.nextInt();
		/*
		 * lower right traingle for (int i = 0; i <= n; i++) { for (int j = n; j >= i;
		 * j--) { System.out.print("*"); } System.out.println(); }
		 * 
		 * upper right traingle for (int i = 0; i <= n; i++) { for (int j = 0; j <= i;
		 * j++) { System.out.print("*"); } System.out.println(); }
		 * 
		 * 
		 * Multiplication table for (int i = 1; i <= 10; ++i) { System.out.println(n +
		 * "*" + i + "=" + n * i); }
		 
		
		Traingle
		int t=1;
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n - i; k++) {
				System.out.println(" ");
			}
			for (int j = 1; j <= i; j++) 
			{
				
				System.out.print(+t+ "");
				t++;
				
			}
			System.out.println();
		}*/
		
		
	}
}
