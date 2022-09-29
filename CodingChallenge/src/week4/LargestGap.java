package week4;

import java.util.Arrays;


public class LargestGap {
	
	
	//find largest gap between array elements
	//Assumption: All positive numbers. 
	public static int largestGap(int[] arr) {
		
		//Step 1. Sort the array
		Arrays.sort(arr);
		
		//Step 2. Find the largest gap between two consecutive elements
		int largestGap = Integer.MIN_VALUE, gap = 0;
		for(int i = 1; i < arr.length; i++) {
			gap = arr[i] - arr[i - 1]; 
			if ( largestGap < gap) {
				largestGap = gap; 
			}
		}
		
		return largestGap; 
	}
	
	
	public static void main(String[] args) {
		int nums[] = {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5}; 
		System.out.println(largestGap(nums));
	
	}

}
