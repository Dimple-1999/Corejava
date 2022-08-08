package com.corejavapart1;

import java.util.Scanner;

public class PercentageIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.println("Enter the percentage of x:");
		float x = s.nextFloat();
		if (x < 50) {
			System.out.println("X=Fail");
		} else if (x > 50 && x < 70) {
			System.out.println("x= 'E' grade");
		} else if (x > 70 && x < 80) {
			System.out.println("x= 'D' grade");
		} else if (x > 80 && x < 90) {
			System.out.println("x= 'B' grade");
		} else {
			System.out.println("x= 'A' grade");
		}
	}

}
