package com.maven.mavenproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringTest1 {
	public static boolean checkstring(String s) {
		String s1 = "Chandrika";
		if (s1.contains(s)) {
			return true;
		}
		return false;
	}

	@Test
	public void testchekstr() {
		assertEquals(true, checkstring("Chandrika"));
	}
}
