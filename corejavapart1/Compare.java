package com.corejavapart1;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="Teach Java";
        String s2="Teach Java";
        String s3="Teach Python";
        int result;
           result=s1.compareTo(s2);
        System.out.println(result);
           result=s1.compareTo(s3);
        System.out.println(result);
           result=s3.compareTo(s1);
        System.out.println(result);
	}

}
