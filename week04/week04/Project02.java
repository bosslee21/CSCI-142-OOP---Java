package week04;
import java.util.Scanner;
//Geometry points in the Rectangle
public class Project02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//prompt user to enter point
		System.out.println("Enter a point X");
		//store user input to variable x and y
		double x = input.nextDouble();
		System.out.println("Enter a point Y");
		double y = input.nextDouble();
		
		//within rectangle less than equal to 10/2 and vertical distance to 5/2
// boolean withinRectangle = (Math.pow(Math.pow(x, 2), 0.5) <= 10.0 / 2 ) &&
//				  (Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2);
		
		
		boolean withinRec = (Math.abs(x) <= 10.0/2) && (Math.abs(y) <= 5.0/2);
		
		
//		System.out.println("Point (" + x + ", " + y + ") is " +
//				((withinRectangle) ? "in " : "not in ") + "the rectangle");
//		
		if(withinRec) {		
			System.out.println("Point"+"(" + x +" "+ y +")"+ " is in the rectangle");
		}
		else {
			
			System.out.println("Point"+"(" + x +" "+ y +")"+ " is not in the rectangle");
		}
		
		}

}




