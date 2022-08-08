package com.package1;

import java.util.*;

public class UnionIntersection {

	public static void main(String[] args) {
		HashSet<Integer> s1 = new HashSet<Integer>();
		HashSet<Integer> s2 = new HashSet<Integer>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		System.out.println("set s1---> " + s1);
		s2.add(2);
		s2.add(3);
		System.out.println("set s2---> " + s2);
		s1.containsAll(s2);// returns all elements in s1,s2
		System.out.println("Contains all elements : " + s1);
		s1.addAll(s2);// s1 union s2
		System.out.println("Union : " + s1);
		s1.retainAll(s2);// s1 intersection s2
		System.out.println("Intersection : " + s1);
		

	}

}
