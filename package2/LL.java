package com.package2;

import java.util.*;

public class LL {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("Carrot");
		l.add("Potato");
		l.add("Apple");
		l.add("Spinach");
		l.add("Tomato");
		System.out.println("Vegetable List : " + l);
		l.forEach(sub -> System.out.println(sub));
	}

}
