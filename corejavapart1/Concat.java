package com.corejavapart1;

import java.util.Scanner;

public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String s1 = "Hello";
		String s2 = "World";
		String s3 = s1 + s2;
		String s4 = "hello";
		String s5= "Hello everyone";
		String s6="Java";
		String s7="Java";
		String s8="C++";
		// string- concat
		System.out.println("Cocatentation of two strings:" + s1.concat(s2));
		// string- equals
		System.out.println("Equals of two strings:" + s1.equals(s2));
		System.out.println("== of two strings:" + (s1 == s2));
		System.out.println("String starts with:" + s1.startsWith("he"));
		System.out.println("String ends with:" + s1.endsWith("ld"));
		System.out.println("Index of string:" + s1.indexOf("l"));
		System.out.println("Last index of string: " + s1.lastIndexOf("o"));
		System.out.println("Equal ignore case of two strings:" + s1.equalsIgnoreCase(s4));
		System.out.println("" + s1.trim());
		System.out.println("Replace:" + s4.replace("hello", "veerasi"));
		System.out.println(""+s5.contains("one"));
		System.out.println("Comparing of strings:"+s1.compareTo(s2));
        System.out.println(""+s6.compareTo(s7));
        System.out.println(""+s8.compareTo(s6));
        System.out.println(""+s7.compareTo(s6));
        System.out.println("Character:"+s1.charAt(1));
	}

}
