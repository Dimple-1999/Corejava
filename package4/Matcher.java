package com.package4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Matcher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter regex pattern: ");
			Pattern pattern = Pattern.compile(sc.nextLine());
			System.out.println("Enter text: ");
			java.util.regex.Matcher matcher = pattern.matcher(sc.nextLine());
			boolean found = false;
			while (matcher.find()) {
				System.out.println("I found the text " + matcher.group() + "starting at index " + matcher.start()
						+ "and ending at index " + matcher.end());
				found = true;
			}
			if (!found) {
				System.out.println("No match found.");
			}
		}
	}

}
