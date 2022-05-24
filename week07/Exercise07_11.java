package week07;

import java.util.*;

public class Exercise07_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		
		double[] num = new double[10];
		System.out.print("Enter ten numbers: ");

		for (int i = 0; i < num.length; i++) {
			num[i] = input.nextDouble();
			System.out.print(num[i]+ " ");
		}
		
		System.out.println("The mean is " + mean(num));
		System.out.println("The standard deviation is " + deviation(num));
		
		
	}

	public static double deviation(double[] x) {
		double dev = x[0];
		double mean = mean(x);
		
		for(int i =0; i <x.length; i++) {
			dev = Math.pow(x[i]- mean, 2);
			
		}
		return Math.sqrt(dev/x.length);
		
		
	}
	
	public static double mean(double[] x) {
		double sum = x[0];
		
		double means = 0;
		int count= 0;
		for(int i =0; i < x.length; i++) {
			sum += x[i];
			count++;
			means = sum / count;
			
		}
		return means;
	}
}
