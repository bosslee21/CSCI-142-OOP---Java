package week09;

import java.util.*;

public class final_test {

	public static void main(String[] args) {
		int balance = 10;

		while (balance >= 1) {
		if (balance < 9) break;
		balance = balance - 9;
		}
		System.out.print(balance);
	}
}
