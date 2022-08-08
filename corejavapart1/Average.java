package com.corejavapart1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Maths marks:");
		int Maths = s.nextInt();
		System.out.println("Enter English marks:");
		int English = s.nextInt();
		System.out.println("Enter Hindi marks:");
		int Hindi = s.nextInt();
		int sum = Maths + English + Hindi;
		float avg = (sum / 3);
		System.out.println("Average:" + avg);
	}

}
