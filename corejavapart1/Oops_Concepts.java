package com.corejavapart1;

import java.util.Scanner;

class Student {
	String name;
	int roll_no;

	public void display(String name, String department, int roll_no) {
		System.out.println("Name : " + name + "\n" + "Department : " + department + "\n" + "Roll_no : " + roll_no);
	}
}

public class Oops_Concepts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name = sc.nextLine();
		System.out.println("Enter the department : ");
		String department = sc.nextLine();
		System.out.println("Enter the roll_no : ");
		int roll_no = sc.nextInt();
		Student s = new Student();
		s.display("Chandrika", "Maths", 23);

	}

}
