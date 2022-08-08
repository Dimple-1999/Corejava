package com.package1;

//static as keyword
class Sttuu {
	String name;
	static String college = ", ITS";
	int rollno;

	Sttuu(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(name + " " + rollno + " " + college);
	}

	public static void main(String[] args) {
		Sttuu s1 = new Sttuu(111, "KARAN , ");
		Sttuu s2 = new Sttuu(222, "ARYAN , ");
		s1.display();
		s2.display();

	}

}
