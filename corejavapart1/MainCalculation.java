package com.corejavapart1;

/*class calculation {
	int a, b, add, sub, mul, div;

	void add(int a, int b)

	{
		add = a + b;
		System.out.println("Addition : " + add);
	}

	void sub(int a, int b) {
		sub = a - b;
		System.out.println("Subtraction : " + sub);
	}

	void mul(int a, int b) {
		mul = a * b;
		System.out.println("Multiplication : " + mul);
	}

	void div(int a, int b) {
		div = a / b;
		System.out.println("Division : " + div);
	}
}

public class MainCalculation {

	public static void main(String[] args) {
		calculation c = new calculation();
		c.add(10, 20);
		c.sub(25, 20);
		c.mul(10, 5);
		c.div(50, 5);

	}

}*/

//Perimeter and area of rectangle
class calculation {
	int l, w, area, perimeter;

	void area(int l, int w) {
		area = l * w;
		System.out.println("Area : " + area);
	}

	void perimeter(int l, int w) {
		perimeter = 2 * (l + w);
		System.out.println("Perimeter : " + perimeter);
	}
}

public class MainCalculation {
	public static void main(String[] args) {
		calculation c = new calculation();
		c.area(22, 15);
		c.perimeter(15, 24);
	}
}
