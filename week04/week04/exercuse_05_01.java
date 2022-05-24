package week04;

import java.util.Scanner;

public class exercuse_05_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int positive = 0;
		int negative = 0;
		double total = 0;
		int count = 0;
		double average = 0.0;

		System.out.println("Enter an integer, the input ends if its 0");
		int answer = input.nextInt();

		if (answer == 0) {
			System.out.println("No numbers are entered except 0");
			

		}else {
			
			while (answer != 0) {
				if (answer > 0) {
					positive++;

				} else if (answer < 0) {
					negative++;

				}
				total += answer;
				count++;
				answer = input.nextInt();
			}
			average = total / count;

			System.out.println("The number of positive is " + positive);
			System.out.println("The number of negative is " + negative);
			System.out.println("The total is " + total);
			System.out.println("The average is " + average);
		}

		

	}

}
