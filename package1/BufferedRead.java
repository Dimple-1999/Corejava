package com.package1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedRead {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String name = br.readLine();
		System.out.println("Enter your age");
		int age = Integer.parseInt(br.readLine());
		System.out.println("Enter your average");
		Double avg = Double.parseDouble(br.readLine());
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Average : " + avg);
	}

}
