package com.corejavapart1;

public class MethodOverloading {

	void sum(int a, int b) {
		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	void sum(double a, double b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		MethodOverloading f = new MethodOverloading();
		f.sum(10, 10);
		f.sum(10, 20, 15);
		f.sum(5.2, 2.5);

	}

}

/*
 * public class MethodOverloading { int id; String name; int age;
 * 
 * MethodOverloading(int id, String name) {
 * 
 * }
 * 
 * MethodOverloading(int id, String name, int age) {
 * 
 * }
 * 
 * void display() { System.out.println(id + " " + name + " " + age); }
 * 
 * public static void main(String[] args) { MethodOverloading s1 = new
 * MethodOverloading(111, " Dimple"); MethodOverloading s2 = new
 * MethodOverloading(222, " Indira", 23); s1.display(); s2.display(); } }
 */
