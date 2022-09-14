package Week2;

import java.util.Arrays;
/**
 * 
 * @author Raza Ghulam
 *
 */
public class Challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 10, 6, 7}; 
		Arrays.sort(arr); 
		int gap = arr[arr.length - 1] - arr[0]; 
		System.out.println(gap);
		
		//Second method can also be applied. Find the max and min 
		// in the array and subtract them. 
		
		//max sum of sub-array
//		int arr1[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; 
		int arr1[] = {2,2,-2}; 
		
		int sum = 0; 
		int max = 0; 
		
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > max + arr1[i] ) {
				max = arr1[i];  
			}else {
				max = max + arr1[i];  
			}
			
			if (max > sum) {
				sum = max; 
			}
		}
		
		System.out.println(sum);
	}

}
