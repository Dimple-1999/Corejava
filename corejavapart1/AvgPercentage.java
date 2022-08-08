package com.corejavapart1;

import java.util.Scanner;

public class AvgPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter total marks:");
		int total = s.nextInt();
		System.out.println("Enter Maths marks:");
		int Maths = s.nextInt();
		System.out.println("Enter Physics marks:");
		int Physics = s.nextInt();
		System.out.println("Enter Science marks: ");
		int Science = s.nextInt();
		int sum = Maths + Physics + Science;
		System.out.println(" Total marks:" + sum);
		float percentage = (sum * 100 / total);
		System.out.println("Percentage:" + percentage + "%");
	}

}
