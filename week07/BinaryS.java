package week07;
import java.util.*;

public class BinaryS {
	public static void main(String[] args) {
		int[] list = {2,3,5,6,7,8,9,9,9,9,11};
		
		binarySearch(list,7);
		
		
		
	}
	
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length -1;
		
		while(high <= low) {
			int mid = low +(high -low) /2;
			if(key > list[mid]) {
				low = mid +1;
			}
			else if(key == list[mid]) {
				return mid;
			}
			else {
				high = mid -1;
			}
		return mid;
		
		}
		return -1;
		
	}
}
