package com.package2;

import java.io.*;

//Write the text
public class FileOutDemo {

	public static void main(String[] args) throws IOException {
		String data = "This is a line of text inside the file";
		FileOutputStream output = new FileOutputStream("E:\\DIMPLE\\NewFile1.txt");
		byte[] array = data.getBytes();
		output.write(array);
		output.close();
	}

}
