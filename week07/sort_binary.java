package week07;
import java.util.*;

public class sort_binary {

	public static void main(String[] args) {
		double[] list = {6.0 ,4.4 ,27.3, 30.1, 18.3};
		//sort the whole array
		java.util.Arrays.sort(list);
		java.util.Arrays.parallelSort(list);
		
		char[] chars = {'a','b','c','d','e','f'};
		java.util.Arrays.sort(chars);
		java.util.Arrays.parallelSort(chars);
		
//		public class BinarySearchDemo {
//			  public static void main(String[] args) {
//			    int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
//			    System.out.println("1. Index is " +
//			      java.util.Arrays.binarySearch(list, 11));
//			    System.out.println("2. Index is " +
//			      java.util.Arrays.binarySearch(list, 12));
//					  
//			    char[] chars = {'a', 'c', 'g', 'x', 'y', 'z'};
//			    System.out.println("3. Index is " +
//			      java.util.Arrays.binarySearch(chars, 'a'));
//			    System.out.println("4. Index is " +
//			      java.util.Arrays.binarySearch(chars, 't'));
//			  }
//			}
		
//		java.util.Arrays.fill(list,5); // fill 5 to the whole array
//		java.util.Arrays.fill(list,  1,5,6);// fill 6 to the partial array; 
		
//		int[] nlist = {1,2,3,4,5};
//		System.out.println(java.util.Arrays.toString(nlist));
		// display string 1,2,3,4,5
		
	}

}
