package week04;

import java.util.Scanner;

public class project03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number");
		int max = 0, count = 1, temp;
	
		max = input.nextInt(); //5
		temp = max; //3 
		
		
		// 3 5 3 5 5 5 0
		while (temp != 0) {
			temp = input.nextInt(); //5
				//3>5
			if (temp > max) {
				max = temp;
				count = 1;
				
			} else if (max == temp) {
				count++; 
				//2 
			
			
			}
		}
		System.out.println("The largest number is " + max);
		System.out.println("The occurence count of the largest number is " + count);

	
}
}

