package com.corejavapart1;

public class ArrayCloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = { 12, 15, 17 };
		int copyArray[] = new int[intArray.length];
		for (int i = 0; i < intArray.length; i++) {
			copyArray[i] = intArray[i];
			copyArray[0]++;
		}
		System.out.println("intArray[] elements: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i] + " ");
		}
		System.out.println("\n\ncopyArray[] elements: ");
		for (int i = 0; i < copyArray.length; i++) {
			System.out.println(copyArray[i] + " ");
		}
	}
}
