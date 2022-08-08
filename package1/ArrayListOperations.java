package com.package1;

import java.util.ArrayList;

public class ArrayListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> s = new ArrayList<>();
		s.add(1);
		s.add(1, 5);
		s.add(6);
		s.add(7);
		System.out.println(" ArrayList : " + s);
		s.remove(1);
		System.out.println(" ArrayList : " + s);
		s.set(0, 2);
		System.out.println(" ArrayList : " + s);
		int b = s.get(0);
		System.out.println(" ArrayList : " + b);
		System.out.println(" ArrayList : " + s);
		s.removeAll(s);
		System.out.println(" ArrayList : " + s);
		s.clear();
		System.out.println(" ArrayList : " + s);
	}
}
