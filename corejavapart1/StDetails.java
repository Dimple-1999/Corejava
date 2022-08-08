package com.corejavapart1;

import java.util.Scanner;

public class StDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name");
		String name = scan.nextLine();
		System.out.println("Enter age");
		int age = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter city");
		String city = scan.nextLine();
		System.out.println("Enter percentage");
		double per = scan.nextDouble();
		System.out.println("name----->" + name);
		System.out.println("age----->" + age);
		System.out.println("city----->" + city);
		System.out.println("percentage------>" + per);
	}

}
