package com.corejavapart1;

import java.util.Scanner;

public class LeftShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Number");
        int number=in.nextInt();
        int result=(number>>1);
        System.out.println(result);
	}

}
