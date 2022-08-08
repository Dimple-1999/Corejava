package com.package2;

interface test1 {
	int val = 10;

	void display();
}

interface test2 {
	int val = 20;

	void display();
}

public class test3 implements test1, test2 {
	public void display() {
		System.out.println("In test3");
		System.out.println(test1.val);
		System.out.println(test2.val);
	}

	public static void main(String[] args) {
		test3 b = new test3();
		b.display();
	}
}