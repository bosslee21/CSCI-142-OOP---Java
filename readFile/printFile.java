package readFile;
import java.util.Scanner;
import java.io.*;

public class printFile {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new File("test.txt"));
		PrintStream output = new PrintStream(new File("hours_out.txt"));
		
		while(input.hasNextLine()) {
			String line = input.nextLine();
			Scanner lineScan = new Scanner(line);
			int id = lineScan.nextInt();
			String name = lineScan.next();
			double hours = 0.0;
			int count = 0;
			while(lineScan.hasNextDouble()) {
				hours = hours + lineScan.nextDouble();
				count++;
			}
			double average = hours / count;
			output.println(id + name + hours + count + average);
			
			
			
		}
		
		
		
		
		
		
		
	}
	
	
}
