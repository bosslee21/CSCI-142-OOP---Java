package week07_01;

import java.util.Scanner;

public class test_07_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int student = input.nextInt();
		int[] scores = new int[student];
		
		System.out.print("Enter " + student + " scores: ");
		
		for (int i = 0; i < scores.length; i++) {
			
			scores[i] = input.nextInt();
		}
		
		int maxScore = max(scores);
		
		
		for(int i = 0; i < scores.length; i++) {
			char grade;
			if(scores[i] >= maxScore -10) {
				grade = 'A';
			}
			else if(scores[i] >= maxScore -20) {
				grade = 'B';
			}
			else if(scores[i] >= maxScore -30) {
				grade = 'C';
			}
			else if(scores[i] >= maxScore -40) {
				grade = 'D';
			}
			else {
				grade = 'F';
			}
			System.out.println("Student " + i + " score is " + scores[i] + " and grade is "  + grade);
		}
		
	}

	public static int max(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}
	
	
}
