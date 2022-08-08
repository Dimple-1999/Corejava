package com.package2;

//Creating and writing text in the file
import java.io.*;

public class FileWriterDemo {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("E:\\DIMPLE\\NewFile1.txt");
			fw.write("My name is Chandrika ");
			fw.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Success");
	}
}