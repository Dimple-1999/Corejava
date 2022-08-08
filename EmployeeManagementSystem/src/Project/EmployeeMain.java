package Project;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Number of Emplyees: ");
		int n = scan.nextInt();
		Employee emp[] = new Employee[n];
		for (int i = 0; i < n; i++) {
			emp[i] = new Employee();
			emp[i].getData();
		}
		System.out.print("Search (eg. Tejeswar or 396606): ");
		String search = scan.next();
		scan.close();
		int c = 0;
		for (int i = 0; i < n; i++) {
			if (emp[i].searchBot(search)) {
				emp[i].displayData();
				c++;
			}
		}
		if (c == 0)
			System.out.println("No such element found");

	}

}
