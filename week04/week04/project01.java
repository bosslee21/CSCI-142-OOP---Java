package week04;

import java.util.Scanner;

public class project01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a numerator ");
		int num = input.nextInt();
		System.out.print("Enter a denominator ");
		int den = input.nextInt();
		// improper fraction 
		int temp = num / den;
		// proper fraction
		int temp2 = num % den;

		if (temp < 1) {
			System.out.println(num + " / " + den + " is a proper fraction");

		} else if (temp >= 1 && temp2 == 0) {
			System.out.println(num + " / " + den + " is an improper fraction and" + " it can be reduced to " + temp);
		} else {
			System.out.println(num + " / " + den + " is an improper fraction and its mixed fraction is " + temp + " + "
					+ temp2 + " / " + den);

		}

	}
}
