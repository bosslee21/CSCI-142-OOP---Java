package week07_pratice;
import java.util.*;

public class Exercise07_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list: ");
		int[] list = new int[input.nextInt()];
		
		for(int i =0; i < list.length; i++) {
			 list[i] = input.nextInt();
			 
		}
		
		if (isSorted(list)) {
			System.out.println("This list is already sorted");
		} else {
			System.out.println("This list is not sorted");
		}

	}

	public static boolean isSorted(int[] list) {
		
		for (int i = 0; i < list.length -1; i++) {
			if (list[i]  > list[i + 1] ) {
				return false;
				
			}
			
		}
		return true;
	}
}

