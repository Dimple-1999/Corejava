package com.package1;

class Circle {
	int circumference = 20;

	void display(int circumference) {
		System.out.println("circumference of circle: " + circumference);
	}
}

class Semicircle extends Circle {
	int area = 25;

	void semicircle(int area) {
		System.out.println("area of semicircle: " + area);
	}

	class Arc extends Semicircle {
		int perimeter = 30;

		void arc(int perimeter) {
			System.out.println("Perimeter of arc: " + perimeter);
		}
	}

	public static void main(String[] args) {
		Semicircle g = new Semicircle();
		g.display(20);
		g.semicircle(25);

	}

}
