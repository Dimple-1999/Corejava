package com.package1;

public class Exception3 {

	public static void main(String[] args) {
		try {
			int a[] = new int[10];
			// a[10] = 50;
			// System.out.println(a);
			a[8] = 50;
			System.out.println(8);
			System.out.println(a[8]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out bound " + e);
		} finally {
			System.out.println("reset of the code");
		}

	}

}
