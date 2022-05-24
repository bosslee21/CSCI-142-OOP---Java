package readFile;

import java.util.Scanner;
import java.io.*;

public class fileRead {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new File("test.txt"));

		while (input.hasNextLine()) {
			String line = input.nextLine();
			Scanner lineRead = new Scanner(line);
			int id = lineRead.nextInt();
			String name = lineRead.next();
			double hours = 0.0;
			int count = 1;

			while (lineRead.hasNextDouble()) {
				hours += lineRead.nextDouble();
				count++;

			}
		
		System.out.println(name + "ID# " + id + " worked " + Math.round(hours) + " (" + (hours / count)+ "hours/ days )");
		}

	}
}