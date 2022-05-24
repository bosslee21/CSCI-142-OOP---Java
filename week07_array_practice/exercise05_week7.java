package week07_array_practice;
import java.util.*;

public class exercise05_week7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter list: ");
		int[] list = new int[input.nextInt()];
		
		for(int i =0; i< list.length; i++) {
			list[i] = input.nextInt();
			
		}
		
		if(sorted(list)) {
			System.out.println("This list is already sorted");
			
		}
		else {
			System.out.println("This list is not sorted");
		}

	}
	public static boolean sorted(int[] list) {
		for(int i =0; i< list.length -1; i++) {
			if(list[i] > list[i+1]) {
				return false;
			}
		}
		return true;
	}

}
