package com.corejavapart1;

import java.util.Scanner;

public class PalindromeOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String mystring = "wow";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String mystring = sc.next();
		StringBuilder s = new StringBuilder(mystring);
		s.reverse();
		String data = s.toString();
		System.out.println("Reverse the string--->" + data);
		if (mystring.equals(data))

		{
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
	}
}
