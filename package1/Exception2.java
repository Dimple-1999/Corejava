package com.package1;

public class Exception2 {

	public static void main(String[] args) {
		try {
			// String s = null;
			//String does not takes null value
			String s = "Chandrika";
			System.out.println(s.length());
		} catch (Exception e) {
			System.out.println("Exception " + e);
		} finally {
			System.out.println("resert of the code");
		}

	}

}
