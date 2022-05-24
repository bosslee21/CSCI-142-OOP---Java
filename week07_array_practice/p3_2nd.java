package week07_array_practice;

import java.util.*;

public class p3_2nd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] list= new int[10];
		System.out.print("Enter ten numbers: ");
		int count =0;
		for(int i =0; i < list.length; i++) {
			
			int num = input.nextInt();
			
			if(notHasN(list,num,count)) {
				list[i] = num;
				count++;
				
					
				
			}
			
			
		}
		
	}
	
	
	public static boolean notHasN(int[] list, int num, int count) {
		for(int i=0; i< count; i++) {
			if(list[i] == num) {
				return false;
			}
		}
		return true;
	}
}
