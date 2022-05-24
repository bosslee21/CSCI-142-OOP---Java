package week06;

public class exercise_pratice {
	
	public static void main(String[] args) {
	System.out.print("The Grade is ");
	printGrade(59.5);
	printGrade(65);	
		
		
	}



	public static void printGrade(double score) {
		
		if(score >= 90) {
			System.out.println("A");
		}
		else if( score >= 80) {
			System.out.println("B");
			
		}
		else if(score >= 70) {
			System.out.println("C");
		}
		else if (score >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("Fail");
		}
	}


}
