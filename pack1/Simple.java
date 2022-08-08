package com.pack1;

class Simple {
	private int data = 50;

	private void display() {
		System.out.println("Hello Private");
	}

	public static void main(String[] args) {
		Simple s = new Simple();
		System.out.println(s.data);
		s.display();
	}
}
