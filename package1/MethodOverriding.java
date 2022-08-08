package com.package1;

class Quadrilateral {

	void display() {
		System.out.println("It access Parent class");
	}
}

class Square extends Quadrilateral {

	void display() {
		System.out.println("It access Child class");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Square b = new Square();

		b.display();

	}

}
