package com.maven.mavenproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;

public class MavenAnnotations {
	@Before
	public void BeforeTestMethod() {
		System.out.println("@Before - runBeforeTestMethod");
	}

	@After
	public void AfterTestMethod() {
		System.out.println("@After - runAfterTestMethod");
	}

	@BeforeClass
	public static void runOnceBeforeClass() {
		System.out.println("@BeforeClass - runOnceBeforeClass");
	}

	@AfterClass
	public static void runOnceAfterClass() {
		System.out.println("@AfterClass - runOnceAfterClass");
	}

	@Ignore
	public void Ignore() {
		System.out.println("@Ignore - Ignoring of statement");
	}

	@Test(timeout = 100)
	public void testTimeOut() {
		System.out.println("@Test(timeout=100) - setting the time");
	}

	@Test(timeout = 800)
	public void testTimeOut1() {
		System.out.println("@Test(timeout=800) - setting the time");
	}
}
