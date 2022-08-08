package com.package2;

import java.io.*;

public class FileWordCount {

	public static void main(String[] args) throws IOException {

		int charcount = 0;
		int wordcount = 0;
		int linecount = 0;
		int spacecount=0;
		FileReader fr = new FileReader("E:\\DIMPLE\\NewFile1.txt");
		BufferedReader reader = new BufferedReader(fr);
		String CurrentLine = reader.readLine();
		while (CurrentLine != null) {
			linecount++;
			String[] words = CurrentLine.split(" ");
			wordcount = wordcount + words.length;

			for (String word : words) {
				charcount = charcount + word.length();
				spacecount= wordcount-1;
			}
			CurrentLine = reader.readLine();
		}
		System.out.println("No of characters in file : " + charcount);
		System.out.println("No of words in a file : " + wordcount);
		System.out.println("No of lines in a file : " + linecount);
        System.out.println("No of spaces in a file : " +spacecount);
	}

}
