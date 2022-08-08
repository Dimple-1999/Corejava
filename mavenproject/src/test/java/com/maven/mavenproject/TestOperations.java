package com.maven.mavenproject;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestOperations {
	public static int sub(int a, int b) {
		int sub = a - b;
		return sub;
	}

	@Test
	public void subtest() {
		assertEquals(3, TestOperations.sub(7, 4), 0);
	}

	public static int div(int a, int b) {
		int div = a / b;
		return div;
	}

	@Test
	public void divtest() {
		assertEquals(5, TestOperations.div(25, 5), 0);
	}

	public static int mul(int a, int b) {
		int mul = a * b;
		return mul;
	}

	@Test
	public void multest() {
		assertEquals(20, TestOperations.mul(5, 4), 0);
	}
}
