package week04;

import java.util.Scanner;

public class Exercise05_47 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first 12 digits of an ISBN - 13 as a string:");

		String str = input.next();

		if (str.length() == 12) {

			int checksum = 0;

			for (int i = 0; i < str.length(); i++) {

				if (Character.isDigit(str.charAt(i))) {
					//0 2 4 6 8 20
					if (i % 2 == 0)

						checksum += str.charAt(i) - '0';

					else

						checksum += (3 * (str.charAt(i) - '0'));

				}

				else {

					System.out.println(str + " is an invalid input");

					break;

				}

			}

			checksum = 10 - checksum % 10;

			str = str + (checksum % 10);

			System.out.println("The ISBN-13 number is " + str);

		}

		else {

			System.out.println(str + " is an invalid input");

		}

	}
}
