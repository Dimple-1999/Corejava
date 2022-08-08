package com.package4;

//Lamda without parameters
public class LamdaExpression {

	public static void main(String[] args) {
		FnInterface ref;
		ref = () -> 5.123;
		System.out.println("Value of Pi = " + ref.getPiValue());

	}

}
