package com.corejavapart1;

// Parameterized constructor
class MyClass {
	int x;

	MyClass(int i) {
		x = i;
	}

	public static void main(String[] args) {
		MyClass t1 = new MyClass(10);
		MyClass t2 = new MyClass(20);
		System.out.println(t1.x + " and " + t2.x);
	}

}
