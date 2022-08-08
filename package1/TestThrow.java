package com.package1;

class TestThrow1 {
	static void validate(int age) {
		if (age < 18) {
			throw new ArithmeticException("not valid");
		} else {
			System.out.println("Welcome to vote");
		}

	}

	class TestThrow {

		public static void main(String[] args) {
			// TestThrow1 t = new TestThrow1();
			// t.validate(13);
			TestThrow1.validate(20);
			System.out.println("rest of the code...");

		}

	}
}
