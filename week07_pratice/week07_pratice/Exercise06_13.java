package week07_pratice;

public class Exercise06_13 {

	public static void main(String[] args) {
		int start = 1;
		int end = 20;
		
		System.out.println("i m(i)     ");
		
		
		
		for(int i = start; i <= end; i++) {
			System.out.print(i + " ");
			System.out.println(String.format("%.4f" ,sum(i)));
			
			
		}
		

	}
	public static double sum(int n) {
		double sum = 0;
		for(int i = 1; i <= n; i++) {
			sum+= (double)i / (i+1);
		}
		return sum;
		
		
	}
}
