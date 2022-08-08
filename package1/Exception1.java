package com.package1;

public class Exception1 {

	public static void main(String[] args) {
		try {
			// int a = 50 / 0;
			//Exception because num is not divided b zero
			int a = 50 / 2;
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println("Arthemetic Exception");
		} finally {
			System.out.println("resert of the code");
		}

	}

}
