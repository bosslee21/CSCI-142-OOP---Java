package week04;

import java.util.Scanner; 
public class pratice
{
    public static void main(String args[]) {   
    	Scanner input = new Scanner(System.in);
    	double maxHeight = 2.5;
        double maxWidth = 5;
       
        System.out.println("Enter a point with two coordinates: ");
        
        String f = input.next();
        //3
        double width = input.nextDouble();        
        //5 
        double height = input.nextDouble();
        
        //string character
        if (width <= maxWidth && width >= (maxWidth * -1)) {
            if (height <= maxHeight && height >= (maxHeight * -1)) {
                System.out.println("Point (" + width + ", " + height + ") is in the rectangle");
            }
            else {
                System.out.println("Point (" + width + ", " + height + ") is not in the rectangle");
            }
        }
        
        else { System.out.println( f  +  (" + width + ", " + height + ") is not in the rectangle");
        }
    }   
}