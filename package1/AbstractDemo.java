package com.package1;

abstract class MyClass {
	// abstract method
	abstract void solve(double a, double b);
}

class Multiplication extends MyClass {
	void solve(double a, double b) {
		System.out.println("Multiplication : " + (a * b));
	}
}

class Division extends MyClass {
	void solve(double a, double b) {
		System.out.println("Division : " + (a / b));
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		Multiplication f1 = new Multiplication();
		f1.solve(25, 2);
		Division f2 = new Division();
		f2.solve(15, 4);
		MyClass reference;
		reference = f2;
		f2.solve(25, 3);
		reference = f1;
		f1.solve(12, 2);
	}

}
