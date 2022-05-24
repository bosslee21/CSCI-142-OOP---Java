package week07_pratice;

import java.util.Scanner;
import java.io.*;

public class test_01 {
	public static void main(String[] args) throws IOException {
		Scanner console = new Scanner(
				new File("/Users/jaebutler/Desktop/CSCI 142/week07_pratice/week07_pratice/isaac.txt"));
		int lineCount = 0;

		while (console.hasNextLine()) {
			System.out.println(console.nextLine());
			lineCount++;
		}
		System.out.println("line count is " + lineCount);
	}

}

}