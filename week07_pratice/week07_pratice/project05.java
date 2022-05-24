package week07_pratice;

import java.util.*;

public class project05 {

	public static void main(String[] args) {

		boolean[] opened = new boolean[100];
		// n = 0
//		for (int i = 0; i < opened.length; i++) {
//			opened[i] = !opened[i];
//
//		}
//
//		// n = 1
//		for(int i = 1; i< opened.length; i+=2) {
//			opened[i] =!opened[i];
//		}
//		
//		// n = 2
//		for(int i= 2; i<opened.length; i+=3) {
//			opened[i] = !opened[i];
//		}
//		
//		// n = 3
//		for(int i =3; i<opened.length; i+=4) {
//			opened[i] = !opened[i];
//		}
//		
//		// n = 4
//		for(int i =4; i< opened.length; i+=5) {
//			
//		}
		
		
		
		
				
				
				
				
				
				//////////////
		
		
		for(int n = 0; n <opened.length; n++) {			
			for (int i = n; i < opened.length; i+=n +1) {
				opened[i] = !opened[i];

			}
		}
		
		
		//display print
		
		for(int i = 0; i < opened.length; i++) {
			System.out.println("Locker " + (i +1) + " " + opened[i]);
		}

	}

}
