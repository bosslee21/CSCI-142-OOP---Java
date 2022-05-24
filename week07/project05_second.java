package week07;
import java.util.*;


public class project05_second {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean[] locker = new boolean[100];
		
		// close all the lockers from 1-100
		for(int i =0; i < locker.length; i++) {
			locker[i] = false;
		}
		//first student open all the locker
		for(int i=1; i< locker.length; i++) {
			locker[i] = true;
		}
	
		for(int i = 2; i < locker.length; i++) {
			for(int j = i; j < locker.length; j = j + i) {
				if(locker[j] == true) {
					locker[j]  = false;
				}
				else {
					locker[j] = true;
				}
			}
		}
		
		for(int i = 0; i < locker.length; i++) {
			if(locker[i] == true) {
				System.out.println("Locker " + i + " is open");
			}
			else {
				System.out.println("Locker " + i + " is closed");
			}
		}
		
	}
}
