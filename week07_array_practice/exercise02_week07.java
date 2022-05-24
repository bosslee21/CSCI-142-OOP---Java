package week07_array_practice;

import java.util.Scanner;

public class exercise02_week07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] list = new int[100];
		System.out.print("Enter the integers between 1 and 100: " );
		int number = input.nextInt();
		int count;
		
		while(number != 0) {
			if(number >= 1 && number <=100) {
				list[number -1] ++;
			}
		}

	}

}
