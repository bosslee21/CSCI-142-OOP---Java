package week07_01;

import java.util.Scanner;

public class Exercise07_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

//		int[] values = new int[100];
//		int input;
		int count = 0;
		System.out.print("Enter the integers between 1 and 100: ");
		
		int num = input.nextInt();
		
		while(num > 0 && num <= 100) {
			
			num = input.nextInt();
			
		}
		
		
//		do {
//			input = in.nextInt();
//			values[count] = input;
//			count += 1;
//		} while (input != 0);

		countOccurence(values);
	}

	public static void countOccurence(int[] list) {
		for (int i = 1; i <= 100; i++) {
			int count = 0;
			for (int j = 0; j < list.length - 1; j++) {
				if (list[j] == i)
					count += 1;
			}
			if (count != 0)
				System.out.printf("%d occurs %d %s%n", i, count, count > 1 ? "times" : "time");
		}
	}
}
