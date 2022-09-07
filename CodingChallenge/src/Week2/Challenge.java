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
	}

}
