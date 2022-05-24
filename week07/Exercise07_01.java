package week07;

import java.util.*;

public class Exercise07_01 {
    public static void main(String[] args) throws  {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int[] student = new int[input.nextInt()];
        char[] grade = new char[student.length];
        
        System.out.print("Enter " + student.length + " scores: ");
        for(int i = 0; i<= student.length; i++) {
            student[i] = input.nextInt();
        }
        
        getGrades(student,grade);
        
        for(int i = 0; i<= student.length; i++) {
        	System.out.println(" Student" + i + "score is " + student[i] + "and grade is " + grade[i] );
        }
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for(int i = 0; i< arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
    
        return max;
    }
    
    public static void getGrades(int[] score, char[] grade) {
    	int best = max(score);
    	for(int i = 0; i <= score.length; i ++ ) {
    		if(score[i] >= best -10) {
    			grade[i] = 'A';
    			
    		}
    		else if(score[i] >= best - 20) {
    			grade[i] = 'B';
    		}
    		else if(score[i] >= best - 30) {
    			grade[i] = 'C';
    		}
    		else if(score[i] >= best - 40) {
    			grade[i] = 'D';
    		}
    		else {
    			grade[i] = 'F';
    		}
    	}
    }
    
}



