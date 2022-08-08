package com.package1;

public class AD {
	int add1(int a, int b) {
		return (a + b);
	}

	void add2(int a, int b) {
		System.out.println("add2 = " + (a + b));
	}

	static int add3(int a, int b) {
		return (a + b);
	}

	static void add4(int a, int b) {
		System.out.println("add4 = " + (a + b));
	}

	public static void main(String[] args) {
		AD r = new AD();
		int result = r.add1(5, 5);
		System.out.println("add1 = " + result);
		r.add2(5, 5);
		System.out.println("add3 = " + r.add3(5, 5));
		add4(5, 5);

	}

}
