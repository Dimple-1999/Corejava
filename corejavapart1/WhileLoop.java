package com.corejavapart1;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1, sum = 0;
		/*
		 * while (i >= 4)
		 * 
		 * { System.out.println(i); i++;
		 * 
		 * }
		 * 
		 * 
		 * do { sum = sum + i; i++;
		 * 
		 * } while (i < 10); System.out.println(sum);
		 */

		while (i < 10) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}

}
