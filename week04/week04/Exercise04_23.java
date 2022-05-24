package week04;
import java.util.Scanner;

public class Exercise04_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter a point with x and y coordinate: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		
		//(0, 0) is less than or equal to 10 / 2 and its vertical distance to (0, 0) is less than or equal to 5.0 / 2. Test your program to cover all cases.)

		boolean withRectangle = (Math.pow(Math.pow (x,2), 0.5) <= 10/2 &&
		(Math.pow(Math.pow(y,2), 0.5) <= 5.0/2));
		
		System.out.println("Point(" + x +"," + y +") is " +((withRectangle)? "in the " : "not in") + " the rectangle");
	}
}