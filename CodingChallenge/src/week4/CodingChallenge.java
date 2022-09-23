package week4;
import java.util.Arrays;
import java.util.Collections;

public class CodingChallenge {
	
	
	/**
	 * 
	 * @param N: number of rows in arr
	 * @param arr: Array containing 3 digits sub arrays. 
	 * @return: Array of second max elements 
	 */
	public static int[] secondMax(int N, int[][] arr) {
		
		int[] result = new int[N]; 
		for (int i = 0; i < N; i++) {
			int[] temp = arr[i]; 
			Arrays.sort(temp);
			result[i] = temp[1]; 
		}
		
		return result; 
	}
	
	public static int sumDigits(String s) {
		
		int sum = 0; 
		
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				sum = sum + Character.getNumericValue(s.charAt(i));  	
			}
		}
		
		return sum; 
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3}, {10, 15, 5},{100,999,500}}; 
		System.out.println(secondMax(3, arr));
		
		String s = "abc1234"; 
		System.out.println(sumDigits(s));
		
	}
	
	
	

}
