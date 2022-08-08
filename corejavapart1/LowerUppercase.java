package com.corejavapart1;

import java.util.Scanner;

public class LowerUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String_1");
		String s1 = scan.nextLine();
		System.out.println("Enter String_2");
		String s2 = scan.nextLine();
		System.out.println(s1 + "" + s2);
		String s = s1 + s2;
		System.out.println("length of a string:" + s.length());
		System.out.println("Upper case:" + s.toUpperCase());
		System.out.println("Lower case:" + s.toLowerCase());
	}

}
