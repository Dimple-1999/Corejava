package Project;

import java.util.Scanner;

public class Employee {
	private String id = null;
	private String name = null;
	private String address = null;
	private int salary = 0;

	void getData() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Employee ID:  ");
		id = sc.next();
		System.out.println("Name:         ");
		name = sc.next();
		System.out.println("Address:      ");
		address = sc.next();
		System.out.println("Salary:       ");
		salary = sc.nextInt();
	}

	boolean searchBot(String search) {
		if (name.matches(search) || id.matches(search))
			return true;
		else
			return false;
	}

	void displayData() {
		System.out.println("Employee ID:  " + id);
		System.out.println("Name:         " + name);
		System.out.println("Address:      " + address);
		System.out.println("Salary:       " + salary);
	}

}
