package com.package4;

interface MyFunctionalInterface {
	public String sayHello();
}

public class HelloLamda {

	public static void main(String[] args) {
		MyFunctionalInterface msg = () -> {
			return "Hello Dimple";
		};
		System.out.println(msg.sayHello());
	}

}
