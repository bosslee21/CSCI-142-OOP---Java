package week07_array_practice;
import java.util.*;
public class exercise04_week07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] number = new double[10];
		
		System.out.print("Enter ten numbers: ");
		for(int i =0; i <number.length; i++) {
			number[i] = input.nextDouble();
			
		}
		
		System.out.println("The mean is " + String.format("%.2f", mean(number)));
		System.out.println("The Standard deviation is " + String.format("%.5f",deviation(number)));
		
	}
	
	
	public static double mean(double[] list) {
		double sum = 0;
		for(int i =0; i < list.length; i++) {
			sum += list[i];
		}
		return sum / list.length;
	}
	
	public static double deviation(double[] arr) {
		double avg = mean(arr);
		double sum = 0.0;
		
		for(int i =0; i< arr.length; i++) {
			sum += Math.pow(arr[i] - avg, 2);
			
		}
		
		return Math.sqrt(sum / (arr.length -1));
	}

}
