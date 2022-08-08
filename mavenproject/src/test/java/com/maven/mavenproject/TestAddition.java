package com.maven.mavenproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestAddition {

	public static int add(int a, int b) {
		int add = a + b;
		return add;
	}

	@Test
	public void addtest() {
		assertEquals(4, TestAddition.add(2, 2), 0);
	}
}
