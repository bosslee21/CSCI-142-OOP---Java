package week09;

import java.util.Scanner;

public class week09_start {
	public static void main(String[] args) {
		int[][] list = {
				{1,2,3,4,5},
				{6,7,8,9,10}
				
		};
		
		for(int i =0; i<list.length; i++) {
			for(int j =0; j<list[i].length; j++) {
				System.out.println(list[i][j] + " ");
			}
		}
		
		
	}
}
