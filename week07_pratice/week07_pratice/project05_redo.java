package week07_pratice;
import java.util.*;

public class project05_redo {
	public static void main(String[] args) {
		
		boolean[] locker = new boolean[100];
		
		
		for(int i =0; i< locker.length; i++) { // j = j+i +1
			for(int j = i; j< locker.length; j+= i+1) {
				locker[j] = !locker[j];
				
			}
		}
		
		for(int i=0; i <locker.length; i++) {
			if(locker[i]) {
				System.out.println("Locker " + (i + 1) + " is open");
			}
			else {
				System.out.println("Locker " + (i + 1) + " is closed");
			}
		}
		
	}
}
