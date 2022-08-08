package com.package4;

interface Operations {
	int solve(int a, int b);
}

public class ArithmeticLamda {

	public static void main(String[] args) {

		// Multiple parameters without data type in lamda expression
		Operations add = (a, b) -> (a + b);
		System.out.println("Addition= " + add.solve(25, 50));

		// Multiple parameters with data type in lamda expression
		Operations sub = (int a, int b) -> (a - b);
		System.out.println("Subtraction= " + sub.solve(30, 20));

		Operations mul = (a, b) -> (a * b);
		System.out.println("Multiplication= " + mul.solve(25, 4));

		Operations div = (a, b) -> (a / b);
		System.out.println("Division= " + div.solve(25, 5));

		Operations mod = (a, b) -> (a % b);
		System.out.println("Modulo= " + mod.solve(24, 3));

	}

}
