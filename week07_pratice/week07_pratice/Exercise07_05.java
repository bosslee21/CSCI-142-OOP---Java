package week07_pratice;

import java.util.Scanner;

public class Exercise07_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] num = new int[10];
		int count = 0;

		System.out.print("Enter ten numbers: ");

		for (int i = 0; i < num.length; i++) {
			int number = input.nextInt();
			
			
			if(notHasN(num, number, count)) {
				num[count] = number;
				count++;
			}
			
			

		}
		for(int i =0; i < count; i++) {
			System.out.print(num[i] + " ");
			
		}
		System.out.println();
		System.out.print(count);
		
	}

	public static boolean notHasN(int[] arr, int n, int count) {
		for (int i = 0; i < count; i++) {
			if (arr[i] == n) {
				return false;

			}

		}
		return true;
	}

}
