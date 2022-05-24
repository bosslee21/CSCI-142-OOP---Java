package week07;
import java.util.Scanner;



public class Exercise07_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] counts = new int[100];
		
		System.out.print("Enter the integer between 1 and 100: ");
		
		//read all numbers
		
		// read first number
		int number = input.nextInt();
		// read while number is not 0 and greater then 1 and less than 100
		
		while(number !=0) {
			if(number <= 100 && number >= 1) {
				//counts[number -1]++;
				number = input.nextInt();
			}
		}
		
		//display 
		
		for(int i =0; i< 100; i++) {
			if(counts[i] > 0) {
//				System.out.println((i+1) + "occurs " + count[i] + "");
//				System.out.println((i + 1) + " occurs " + counts[i]
//				          + ((counts[i] == 1) ? " time" : " times"));
			}
		}
	}

}
