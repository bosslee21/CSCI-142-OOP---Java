package week07;
import java.util.*;

public class Exercise07_11test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[10];
		
		System.out.print("Enter the numbers: ");
		for(int i =0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
			
		}
		
		System.out.println("The Mean is " + String.format("%.2f",mean(numbers)));
		System.out.println("The standard deviation is " +  String.format("%.5f",deviation(numbers)));
	}

	public static double mean(double[] x) {
		double sum = 0.0;
		
		
		for(int i= 0 ; i < x.length; i++) {
			sum += x[i];
			
		}
		return sum / x.length;
	}

	public static double deviation(double[] x ) {
		double avg = mean(x);
		double sum = 0.0;
		for(int i =0; i < x.length; i++) {
			sum +=Math.pow(x[i] - avg, 2);
			
			
		}
		sum /= x.length-1;
		return Math.sqrt(sum);
		//Math.sqrt(sum / x.length -1);
		
	}
	
}
