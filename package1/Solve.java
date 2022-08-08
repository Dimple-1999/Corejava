package com.package1;

//static as method
class Solve {
	static int cube(int x) {
		return x * x * x;
	}

	public static void main(String[] args) {
		int result = Solve.cube(5);
		System.out.println(result);
	}

}
