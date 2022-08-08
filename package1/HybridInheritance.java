package com.package1;

class I {
	void display() {
		System.out.println("I");
	}
}

class J extends I {
	void display() {
		System.out.println("J");
	}
}

class K extends I {
	void display() {
		System.out.println("K");
	}
}

class L extends I {
	void display() {
		System.out.println("Hybrid Inheritance");
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		L obj = new L();
		obj.display();
	}

}
