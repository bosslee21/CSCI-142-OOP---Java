// Jae Butler 
// Computing Future Investment Value. 
package week07_pratice;

import java.util.Scanner;

public class Exercise06_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("The Amount invested: ");
		double invest = input.nextDouble();

		System.out.print("Annual interest rate: ");
		double rate = input.nextDouble();

		System.out.println("Years Future Value");

		final int YEARS = 30;

		double monthRate = rate / 1200;

		for (int i = 1; i <= YEARS; i++) {
			System.out.print(i + " ");

			System.out.print(String.format("%.2f", futureInvestValue(invest, monthRate, i)));
			System.out.println();

		}

	}

	public static double futureInvestValue(double investmentAmount, double monthlyInterestRate, int years) {
		// Math.pow(1 + 9/1
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

	}

}
