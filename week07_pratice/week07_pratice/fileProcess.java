package week07_pratice;

import java.util.Scanner;
import java.io.*;

public class fileProcess {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(
				new File("/Users/jaebutler/Desktop/CSCI 142/week07_pratice/week07_pratice/isaac.txt"));

		int lineCount = 0;
		int wordCount = 0;
		int characterCount = 0;

		while (input.hasNextLine()) {
			String line = input.nextLine();
			lineCount++;
			Scanner lineScan = new Scanner(line);

			while (lineScan.hasNext()) {
				String word = lineScan.next();
				wordCount++;

			}
			characterCount += line.length();

		}

		System.out.println("Line Count is: " + lineCount);
		System.out.println("word Count is: " + wordCount);
		System.out.println("Character Count is: " + characterCount);
	}
}
