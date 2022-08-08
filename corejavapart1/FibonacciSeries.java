package com.corejavapart1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		// System.out.println("Enter Number ");
		/*
		 * int i = 1, f = 1; int n = s.nextInt();
		 * 
		 * 
		 * for loop for (i = 1; i <= n; i++) { f = f * i; }
		 * System.out.println("Factorial " +f);
		 * 
		 * 
		 * 
		 * while loop while (i <= n) { f = f * i; i++; } System.out.println("Factorial "
		 * + f);
		 */

		// Fibonacci using while loop

		/*
		 * int i = 1, f0 = 0, f1 = 1; int n = s.nextInt();
		 * System.out.print("Fibonacci Series: "); while (i <= n) { System.out.print(f0
		 * + " "); int fib = f0 + f1; f0 = f1; f1 = fib; i++; }
		 */

		// Fibonacci another method
		/*
		 * int f1 = 0, f2 = 1, f3, i, f = 4; System.out.print(f1 + " " + f2); for (i =
		 * 2; i <= f; ++i) { f3 = f1 + f2; System.out.print(" " + f3); f1 = f2; f2 = f3;
		 * 
		 */

		// Armstrong number
		/*
		 * int n = s.nextInt(); int num = n; int r, sum = 0; while (n != 0) { r = n %
		 * 10; System.out.println("r---->" + r); sum = sum + r * r * r; n = n / 10; } if
		 * (num == sum) { System.out.println("Given number is armstrong"); } else {
		 * System.out.println("Given number is not armstrong"); }
		 */

		// BREAK
		/*
		 * int n = s.nextInt(); for (int i = 0; i <= n; i++) { if (i == 3) { break; }
		 * System.out.println(i); }
		 */

		// Continue
		/*
		 * int n = s.nextInt(); for (int i = 0; i <= n; i++) { if (i == 3) { continue; }
		 * System.out.println(i); }
		 */

		// break using while loop
		/*
		 * int n = s.nextInt(); int i = 0; while (i <= n) { if (i == 3) { break; }
		 * System.out.println(i); i++; }
		 */

		// Check whether the number is prime or not
		/*
		 * int n = s.nextInt(); int count = 0; for (int i = 1; i <= n; i++) { if (n % i
		 * == 0) { count++; } } if (count == 2) {
		 * System.out.println("n is a prime number"); } else {
		 * System.out.println("n is not a prime number"); }
		 */

		// Prime numbers upto 50
		System.out.println("prime number upto n");
		System.out.println("Enter n value");
		int n = s.nextInt();
		for (int i = 2; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print("  " +i);
			}
		}
	}

}
