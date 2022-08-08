package com.corejavapart1;

public class ImplicitExplicitConversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// smaller to larger---Implicit
		/*
		 * int a = 5; double b = a; System.out.println(b);
		 */

		// larger to smaller---Explicit
		/*
		 * double a = 5; int b = (int) a; System.out.println(b);
		 */

		// Conversion of all in implicit
		/*
		 * byte i = 50; short j = i; int k = j; long l = k; float m = l; double n = m;
		 * 
		 * System.out.println("byte value--> " + i);
		 * System.out.println("short value--> " + j); System.out.println("int value--> "
		 * + k); System.out.println("long value--> " + l);
		 * System.out.println("float value--> " + m);
		 * System.out.println("double value--> " + n);
		 */

		// Conversion of all in explicit
		double i = 50.0;
		float j = (float) i;
		long k = (long) j;
		int l = (int) k;
		short m = (short) l;
		byte n = (byte) m;

		System.out.println("double value--> " + i);
		System.out.println("float value--> " + j);
		System.out.println("long value--> " + k);
		System.out.println("int value--> " + l);
		System.out.println("short value--> " + m);
		System.out.println("byte value--> " + n);

	}

}
