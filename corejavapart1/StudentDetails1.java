package com.corejavapart1;
//Default Constructor

/*class StudentDetails1 {
String name;
String department;

int roll_no;

StudentDetails1() {
name = "Chandrika";
	department = "Maths";
	roll_no = 23;
	System.out.println("NAME: " + name);
	System.out.println("DEPARTMENT: " + department);
System.out.println("ROLL_NO: " + roll_no);

}

public static void main(String[] args) {
StudentDetails1 s = new StudentDetails1();
	}

}*/

//Parameterized Constructor
/*class StudentDetails1 {
	String name;
	String department;
	int roll_no;

	StudentDetails1(String name, String department, int roll_no) {
		System.out.println(name + " " + department + " " + roll_no);
	}

	public static void main(String[] args) {
		StudentDetails1 s1 = new StudentDetails1("Chandrika, ", "Maths, ", 23);
		StudentDetails1 s2 = new StudentDetails1("Dimple, ", "CS, ", 22);
		StudentDetails1 s3 = new StudentDetails1("Veerasi, ", "English, ", 20);
	}
}*/

//Copy Constructor
public class StudentDetails1 {
	private String name;
	private String department;
	private int roll_no;

	StudentDetails1(String Name, String Department, int Roll_No) {
		name = Name;
		department = Department;
		roll_no = Roll_No;
	}

	StudentDetails1(StudentDetails1 studentDetails1) {
		System.out.println("\n After accessing the copy constructor \n");
		name = studentDetails1.name;
		department = studentDetails1.department;
		roll_no = studentDetails1.roll_no;
	}

	String displayName() {
		return name;
	}

	String displayDepartment() {
		return department;
	}

	int displayRoll_No() {
		return roll_no;
	}

	public static void main(String[] args) {
		StudentDetails1 s1 = new StudentDetails1("Dimple", "CS", 555);
		System.out.println("Student Name : " + s1.displayName());
		System.out.println("Student Department : " + s1.displayDepartment());
		System.out.println("Student Roll_No : " + s1.displayRoll_No());

		StudentDetails1 s2 = new StudentDetails1(s1);
		System.out.println("Student Name : " + s2.displayName());
		System.out.println("Student Department : " + s2.displayDepartment());
		System.out.println("Student Roll_No : " + s2.displayRoll_No());
	}
}
