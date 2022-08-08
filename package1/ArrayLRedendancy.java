package com.package1;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayLRedendancy {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(2);
		a.add(8);
		List<Integer> b = a.stream().distinct().collect(Collectors.toList());
		System.out.println("ArrayList : " + a);
		System.out.println("New ArrayList : " + b);
		Collections.sort(b);
		System.out.println("Ascending order : " + b);
		Collections.reverse(b);
		System.out.println("Descending order : " + b);
	}

}
