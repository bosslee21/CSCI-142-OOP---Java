package week07;
import java.util.*;

public class Exercise07_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] number = new int[10];
		int count = 0;
		
		System.out.print("Enter ten numbers: ");
		for(int i = 0; i < number.length; i++) {
			int num = input.nextInt();
			
			if(notHasN(number,num,count)) {
				number[count] = num;
				count++;
				
			}
		}
		
		System.out.println("The number of distinct number is " +count);
		System.out.print("The distinct numbers are: ");
		for(int i =0; i< count; i++) {
			System.out.print(number[i]+ " ");
		}
		
		
		
	}	
	
	
	public static boolean notHasN(int[] list, int a,int count) {
		for(int i =0; i< count; i++) {
			if(list[i] == a) {
				return false;
			}
			
		}
		return true;
	}
}









































//public class Exercise07_05 {
//
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter ten numbers: ");
//		
//		int[] num = new int[10];
//		int count = 0;
//		int distinct = 0; 
//		
//		for(int i = 0; i < num.length ; i++) {
//			num[i] = input.nextInt();
//			if(num[i] == num[i+1]) {
//				count ++;
//				
//				
//			}
//			distinct = count - num.length;
//			System.out.print(distinct);
//		}
//		
//		
//	}
//
//}
