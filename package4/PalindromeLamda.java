package com.package4;

interface PLamda {
	String solve(String s1);
}

public class PalindromeLamda {

	public static void main(String[] args) {
		System.out.println("It is a Palindrome---> "  + isPalindrome("radar"));
		System.out.println("It is a palindrome---> " +isPalindrome("dimple"));

	}

	public static boolean isPalindrome(String s1) {
		String reversedString = new StringBuilder(s1).reverse().toString();
		return s1.equals(reversedString);
	}
}
