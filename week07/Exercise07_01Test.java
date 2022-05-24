package week07;
import java.util.*;

public class Exercise07_01Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of student: ");
		int[] scores = new int[input.nextInt()];
		
		
		System.out.print("Enter " + scores.length + " scores: ");
		for(int i =0; i < scores.length; i++) {
			scores[i] = input.nextInt();
			
		}
		
		int maxScore = best(scores);
		
		for(int i =0; i < scores.length; i++) {
			char grade;
			if(scores[i] >= maxScore -10 ) {
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
			System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
		}
		

	}
	public static int best(int[] list) {
		int max = list[0];
		for(int i =1; i < list.length; i++) {
			if(list[i] > max) {
				max = list[i];
			}
		}
		return max;
			
	}
	

}
