package com.package4;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrimeLamda {

	public static void main(String[] args) {
		System.out.println("It is a prime number--->" + isPrime(123));
	}

	private static boolean isPrime(int number) {
		IntPredicate isDivisible = index -> number % index == 0;
		return number > 1 && IntStream.range(2, number - 1).noneMatch(isDivisible);
	}
}
