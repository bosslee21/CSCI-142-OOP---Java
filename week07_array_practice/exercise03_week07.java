package week07_array_practice;
import java.util.*;

public class exercise03_week07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] list = new int [10];
		int count = 0;
		System.out.print("Enter ten numbers: ");
		
		for(int i =0; i< list.length; i++) {
			int number = input.nextInt();
			
			if(hasNum(list,number,count)) {
				list[count] = number;
				count++;
			}
		
		}
		System.out.println("The number of distinct number is " + count);
		System.out.print("The distinct number are " );
		for(int i =0; i< count; i++) {
			System.out.print(list[i] + " ");
		}
		
		
		
	}
	
	
	public static boolean hasNum(int[] arr, int n, int count) {
		for(int i =0; i < count; i++) {
			if(arr[i] == n) {
				return false;
			}
		}
		return true;
	}

}
