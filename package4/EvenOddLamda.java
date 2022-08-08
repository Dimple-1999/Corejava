package com.package4;

interface EvenOdd {
	void check(int a);
}
//interface Add{
	//int add(int b, int c);
//}

public class EvenOddLamda {

	public static void main(String[] args) {
		//Add add=(b,c)->(b+c);
       // System.out.println("Addition=" +add.add(3, 2));
        
		EvenOdd a1 = (int a) -> {
			if (a % 2 == 0) {
				System.out.println("It is an even number-->" + a);
			} else {
				System.out.println("It is an odd number-->" + a);
			}
		};
		// checking whether it is prime or not
		a1.check(5);
		a1.check(9);
	}

}
