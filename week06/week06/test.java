package week06;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.println("Enter second integer: ");
		int n2 = input.nextInt();
		
		System.out.println("The Greatest common divisor for " + n1 + " and " + n2 + "is " + gcd(n1,n2));
		
	}
	
	
	
	public static int gcd(int n1, int n2) {
		int gcd = 1;
		int t = 1;
		
		while(t <= n1 && t <= n2) {
			if(n1 % t == 0 && n2 % t == 0) {
				gcd = t;
			}
			t++;
		} 
		
		return gcd;
		
	}

}
