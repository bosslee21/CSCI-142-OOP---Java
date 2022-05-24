package week07_array_practice;

import java.util.*;

public class exercise01_week07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int[] student = new int[input.nextInt()];
		
		System.out.print("Enter " + student.length + " scores: ");
		for (int i = 0; i < student.length; i++) {
			student[i] = input.nextInt();

		}

		for (int i = 0; i < student.length; i++) {
			char grade;
			if (student[i] >= highest(student) - 10) {
				grade = 'A';
			} else if (student[i] >= highest(student) - 20) {
				grade = 'B';
			} else if (student[i] >= highest(student) - 30) {
				grade = 'C';
			} else if (student[i] >= highest(student) - 40) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			System.out.println("Student " + i + " Score is " + student[i] + " and grade is " + grade);
		}
		

	}

	public static int highest(int[] list) {
		int max = list[0];
		for (int i = 1; i < list.length; i++) {
			if (list[i] > max) {
				max = list[i];
			}
		}
		return max;
	}

}
