package com.package1;

import java.util.*;

public class HashtableDemo {

	public static void main(String[] args) {
		Hashtable<Integer, String> t1 = new Hashtable();
		t1.put(1, "Sai");
		t1.put(2, "Dimple");
		System.out.println("Hashtable---> " + t1);
		System.out.println("string element : " + t1.get(2));
		System.out.println("size :  " + t1.size());
		System.out.println("Check the key value is present or not :  " + t1.containsKey(3));
		System.out.println("Check the string is present or not :  ---> " + t1.containsValue("Sai"));
		System.out.println("Displays the string : " + t1.get(2));
	}

}
