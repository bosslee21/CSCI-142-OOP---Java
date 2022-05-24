package week04;
import java.util.Scanner;

public class Exercise04_21 {
	public static void main(String[] args) {
		//531-65-1798
		//012345678910 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Social Security in format DDD-DD-DDDD");
		String ssn = input.nextLine();
		
		boolean isValid = ssn.length() == 11 && ssn.charAt(0) >= '1' && ssn.charAt(0) <= '9'
				&& Character.isDigit(1)&& Character.isDigit(2)
				&& ssn.charAt(3)== '-' && Character.isDigit(4)
				&& Character.isDigit(5)&& ssn.charAt(6) == '-'
				&& Character.isDigit(7)&& Character.isDigit(8)
				&& Character.isDigit(9)&& Character.isDigit(10);
		
		if(isValid) {
			
			System.out.println(ssn + "is valid");
			
		}
		else {
			System.out.println(ssn + "is invalid");
		}
		
				
		
 		
	}
}
