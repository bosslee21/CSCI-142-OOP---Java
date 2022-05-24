package week07_pratice;

import java.util.*;

public class Exercise07_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		
		double[] num = new double[10];
		System.out.print("Enter ten numbers: ");

		for (int i = 0; i < num.length; i++) {
			num[i] = input.nextDouble();
			
		}
		
		System.out.println("The mean is " + String.format("%.2f", mean(num)));
		System.out.println("The standard deviation is " + String.format("%.5f",deviation(num)));
	}

	public static double mean(double[] list) {
		double sum = 0.0;

		for (int i = 0; i < list.length; i++) {
			sum += list[i];

		}
		return sum / list.length;
	}

	public static double deviation(double [] x) {
		double avg = mean(x);
		double sum = 0.0;
		
		for(int i = 0; i < x.length; i++) {
			sum +=  Math.pow(x[i] - avg, 2);
		}
		sum /= x.length -1;

		return Math.sqrt(sum);
	}
}
