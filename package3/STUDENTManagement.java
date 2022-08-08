package com.package3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class STUDENTManagement {

	public static void main(String[] args) {
		ArrayList<STUDENT> studentArray = new ArrayList<STUDENT>();

		String name;
		int age;
		int salary;
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("(1) Add Student Detail ");
			System.out.println("(2) Student Record ");
			System.out.println("(3) Sorting the student Record ");
			System.out.println("(4) Search student by name ");
			System.out.println("(5) Count the Student details ");
			System.out.println("(6) Exit\n ");

			System.out.println("Make your choice");
			int choice = s.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the student Name ");
				name = s.next();
				System.out.println("Enter the student Age ");
				age = s.nextInt();
				System.out.println("Enter the student Salary ");
				salary = s.nextInt();

				STUDENT sc = new STUDENT();
				sc.setName(name);
				sc.setAge(age);
				sc.setSalary(salary);
				studentArray.add(sc);
				System.out.println("Student record has been added ");
				break;
			case 2:
				for (int i = 0; i < studentArray.size(); i++) {
					System.out.println("Student Record : " + (i + 1));
					System.out.println("Student Name : " + studentArray.get(i).getName());
					System.out.println("Student Age : " + studentArray.get(i).getAge());
					System.out.println("Student Salary : " + studentArray.get(i).getSalary());
				}
				break;
			case 3:
				Collections.sort(studentArray,STUDENT.StuNameComparator);
				for(STUDENT str: studentArray) {
					System.out.println(str.getName()+" "+str.getAge() +" "+str.getSalary());
				}
				break;
			case 4:
				System.out.println("Enter the student name for delete : ");
				name = s.next();
				int count = 0;
				for (int i = 0; i < studentArray.size(); i++) {
					if (studentArray.get(i).getName().contains(name)) {
						System.out.println("Student Record : " + (+count));
						studentArray.remove(i);
					}
				}
				if (count == 0) {
					System.out.println("NO record found ");
				} else {
					System.out.println("Student record has been deleted successfully ");
				}
				break;
			case 5:
				System.out.println("Number of StudentDetails : " + studentArray.size());
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("Invalid data");
				break;
			}
		}

	}

}
