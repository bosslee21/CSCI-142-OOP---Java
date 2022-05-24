package week07;

import java.util.Scanner;

public class Project05 {

	public static void main(String[] args) {
		boolean[] locker = new boolean[101];

		for (int i = 0; i < locker.length; i++) {
			locker[i] = false;
		}
		for (int i = 1; i < locker.length; i++) {
			locker[i] = true;
		}

		for (int i = 2; i < locker.length; i++) {
			for (int j = i; j < locker.length; j = j + i) {
				if (locker[j] == false) {
					locker[j] = true;
				}
				else {
					locker[j] = false;
				}
			}
		}
		for(int i = 1; i <locker.length; i++) {
			if(locker[i] == true) {
				System.out.println("Locker " + i + " is open");
			}
			else {
				System.out.println("Locker " + i  + " is closed");
			}
		}
	}

}
