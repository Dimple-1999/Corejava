package com.package3;

import java.util.*;

public class FrndsList {

	//Converting list to set
	public static void main(String[] args) {
		LinkedList<String> friends = new LinkedList<String>();
		friends.add("CSS");
		friends.add("HTML");
		friends.add("Oracle");
		System.out.println("Friends list: " + friends);
		System.out.println("sort reverse: ");
		Comparator<String> comp = (aName, bName) -> aName.compareTo(bName);
		friends.stream().sorted(comp.reversed()).forEach(System.out::println);

		Set<String> set = new HashSet<String>();
		for (String x : friends)
			set.add(x);
		System.out.println("Created HashSet : ");
		for (String x : set)
			System.out.println(x);
	}

}
