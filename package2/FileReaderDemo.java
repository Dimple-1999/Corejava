package com.package2;

import java.io.*;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		try {
			FileReader fr = new FileReader("E:\\DIMPLE\\NewFile1.txt");
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
			fr.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
