package com.package1;

import java.util.HashMap;

public class HashmapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> c1 = new HashMap<String, Integer>();
		c1.put("Dimple", 1);
		c1.put("Sai", 2);
		c1.put("Mahesh", 3);
		c1.put("Indira", 4);
		System.out.println("HashMap : " + c1);
		System.out.println("Checks key value : " + c1.containsKey(3));
		System.out.println("Checks string value : " + c1.containsValue("Sai"));
		System.out.println("Displays the mapping value : " + c1.get("Sai"));
		System.out.println("Replace : " + c1.replace("Sai", 2));
		System.out.println("Size : " + c1.size());
		System.out.println("HashMap set : " + c1.keySet());
		System.out.println("Displays the key values : " + c1.values());
		System.out.println("Check whether the string,key value is present : " + c1.remove("Sai", 2));
	}

}
