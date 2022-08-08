package com.package1;

class Addition {
	int a = 2;
	int b = 3;
	int add;

	Addition(int a, int b) {
		add = a + b;
	}

	void display() {
		System.out.println("Addition : " + add);
	}
}

class Subtraction extends Addition {
	int a;
	int b;

	Subtraction(int a, int b) {
		super(2, 3);

	}

	void display() {
		super.display();
		System.out.println("Subtraction : " + (super.a - super.b));
	}
}

public class Super {

	public static void main(String[] args) {
		Subtraction b = new Subtraction(1, 1);
		b.display();
	}

}
