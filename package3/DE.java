package com.package3;

interface AB {
	int i = 25;

	void display(int i);

}

interface BC extends AB {
	int j = 35;

	void display(int j);
}

interface CD extends AB {
	int k = 45;

	void display(int k);
}

abstract class DE implements CD {
	public void display() {
		System.out.println("Integers-->");
		System.out.println(AB.i);
		System.out.println(BC.j);
		System.out.println(CD.k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
