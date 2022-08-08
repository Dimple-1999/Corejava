package com.corejavapart1;

import java.util.Scanner;

public class ChoicesProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the option to be performed");
		int a, b, c;
		int choice;
		while (true) {
			System.out.println("1 for Addition");
			System.out.println("2 for Subtraction");
			System.out.println("3 for Division");
			System.out.println("4 for Multiplication");
			System.out.println("5 for Modulus");
			System.out.println("6 for power");
			System.out.println("7 for square root");
			System.out.println("8 for Quit \n \n");

			System.out.println("Enter your choice:");
			choice = s.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter number a: ");
				a = s.nextInt();
				System.out.println("Enter number b: ");
				b = s.nextInt();
				c = a + b;
				System.out.println("Addition= " + c + "\n");
				break;

			case 2:
				System.out.println("Enter number a: ");
				a = s.nextInt();
				System.out.println("Enter number b: ");
				b = s.nextInt();
				c = a - b;
				System.out.println("Subtraction= " + c + "\n");
				break;

			case 3:
				System.out.println("Enter two integer values");
				a = s.nextInt();

				b = s.nextInt();
				if ((a == 0) || (b == 0)) {
					System.out.println("Zero is not applicable so enter any two integers ");
				} else {
					c = a / b;
					System.out.println("Division " + c + "\n");
				}

				break;

			case 4:
				System.out.println("Enter number a: ");
				a = s.nextInt();
				System.out.println("Enter number b: ");
				b = s.nextInt();
				c = a * b;

				System.out.println("Multipication= " + c + "\n");
				break;

			case 5:
				System.out.println("Enter number a: ");
				a = s.nextInt();
				System.out.println("Enter number b: ");
				b = s.nextInt();
				c = a % b;
				System.out.println("Modulus= " + c + "\n");
				break;

			case 6:
				System.out.println("Enter number a: ");
				a = s.nextInt();
				System.out.println("Enter number b: ");
				b = s.nextInt();
				c = a ^ b;
				System.out.println("Power of " + c + " : " + Math.pow(a, b));
				break;

			case 7:
				System.out.println("Enter number a: ");
				a = s.nextInt();
				System.out.println("Square root: " + Math.sqrt(a));
				break;

			default:
				System.out.println("out of the loop ");
			}

		}

	}
}
