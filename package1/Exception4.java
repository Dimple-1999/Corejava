package com.package1;

public class Exception4 {

	public static void main(String[] args) {
		try {
			String s = "Chandrika";
			int i = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println("Number Format exception " + e);
		} finally {
			System.out.println("reset of the code");
		}
	}

}
