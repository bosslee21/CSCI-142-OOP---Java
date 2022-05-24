package readFile;

import java.util.Scanner;
import java.io.*;

public class file_processing {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new File("test.txt"));
		
		int lineCount = 0;
		int wordCount= 0;
		int i = 0;
		while(input.hasNextLine()) {
			String line = input.nextLine();
			lineCount++;
			Scanner lineScan = new Scanner(line);
			
			while(lineScan.hasNext()) {
				String word = lineScan.next();
				wordCount++;
				
				
				
				
				
			}
		}
		System.out.println("Line Count is: "+ lineCount);
		System.out.println("word Count is: " + wordCount);
		System.out.println("Character Count is:"  );
	}
}
