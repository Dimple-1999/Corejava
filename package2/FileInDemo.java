package com.package2;

import java.io.*;

public class FileInDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream input = new FileInputStream("E:\\DIMPLE\\NewFile1.txt");
		System.out.println("Data in the file");
		int i = input.read();
		while (i != -1) {
			System.out.print((char) i);
			i = input.read();
		}
		input.close();
		
	}

}
