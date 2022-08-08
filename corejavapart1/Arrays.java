package com.corejavapart1;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int age[] = { 12, 5, 9, 10, 4 }; for (int i = 0; i < age.length; i++) {
		 * System.out.println(age[i]);
		 * 
		 * }
		 */

		// printing size and elements of array
		/*
		 * Scanner s = new Scanner(System.in);
		 * System.out.println("Enter the size of array: "); int n = s.nextInt(); int
		 * num[] = new int[n]; System.out.println("Enter array elements: "); for (int i
		 * = 0; i < n; i++) { num[i] = s.nextInt(); }
		 * System.out.println("Array elements: "); for (int i = 0; i < n; i++) {
		 * System.out.println(num[i]); }
		 */

		// matrix of array
		/*
		 * Scanner s = new Scanner(System.in); System.out.println("Enter 5 names: ");
		 * String name[] = new String[5]; for (int i = 0; i < name.length; i++) {
		 * name[i] = s.nextLine(); } System.out.println("Names are......."); for (int i
		 * = 0; i < name.length; i++) { System.out.println(name[i]); }
		 */

		// matrices
		/*
		 * int arr[][] = { { 1, 2 }, { 3, 4 } }; for (int i = 0; i < arr.length; i++) {
		 * for (int j = 0; j < arr.length; j++) { System.out.print(arr[i][j] + " "); }
		 * System.out.println(); }
		 */

		// matrix elements
		/*
		 * int arr[][] = new int[10][10]; Scanner s = new Scanner(System.in);
		 * System.out.println("Enter array elements of 2*2 matrix"); for (int i = 0; i <
		 * 2; i++) { for (int j = 0; j < 2; j++) { arr[i][j] = s.nextInt(); } }
		 * System.out.println("Elements are"); for (int i = 0; i < 2; i++) { for (int j
		 * = 0; j < 2; j++) { System.out.print(arr[i][j] + " "); } System.out.println();
		 * }
		 */

		// adding matrices
		/*
		 * int arr[][] = new int[10][10]; int arr1[][] = new int[10][10]; int arr2[][] =
		 * new int[10][10]; Scanner s = new Scanner(System.in);
		 * System.out.println("Enter the size of the array "); int n = s.nextInt();
		 * System.out.println("Enter array elements for  matrix1"); for (int i = 0; i <
		 * n; i++) { for (int j = 0; j < n; j++) { arr[i][j] = s.nextInt(); } }
		 * System.out.println("Enter array elements for 
		 * matrix2"); for (int i = 0; i <
		 * n; i++) { for (int j = 0; j < n; j++) { arr1[i][j] = s.nextInt(); } }
		 * System.out.println("****After addition matrix is****"); for (int i = 0; i <
		 * n; i++) { for (int j = 0; j < n; j++) { arr2[i][j] = arr[i][j] + arr1[i][j];
		 * System.out.print(arr2[i][j] + " "); } System.out.println();
		 * 
		 * }
		 */

		// Multiplication of matrix
		int arr[][] = new int[10][10];
		int arr1[][] = new int[10][10];
		int arr2[][] = new int[10][10];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int n = s.nextInt();
		int m = s.nextInt();
		System.out.println("Enter array elements for  matrix1");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		System.out.println("Enter array elements for  matrix2");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr1[i][j] = s.nextInt();
			}
		}
		System.out.println("---Multliplicaion Matrix---");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr2[i][j] = 0;
				for (int k = 0; k < m; k++) {
					arr2[i][j] += arr[i][j] * arr1[i][j];
				}
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

	}
}
