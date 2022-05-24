package week07;

public class binary_search {

	public static void main(String[] args) {
						// 0-7 index   8 length
		int[] list = {2,3,5,6,7,8,9,11};
		int key = 11;
		
		int low = 0;
		int high = list.length -1; // 8 length but to 7 index
		
		while(high >= low) {
			int mid = low + (low - high) /2 ;
			if(key > list[mid]) {
				low = mid + 1;
			}
			else if (key < list[mid]) {
				high = mid -1;
				
			}
			else {
				return mid;
				
			}
		}
		return -1;                                                 
		
	}

}
