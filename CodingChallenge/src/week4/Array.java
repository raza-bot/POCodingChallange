package week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Array {

	//permutation using element value as index
	public static int[] buildArray(int[] nums) {
        
        int[] result = new int[nums.length]; 
        
        for(int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]]; 
        }
        return result;   
    }
	
	//return an array of of doubling it
	public static int[] getConcatenation(int[] nums) {
        
        int n = nums.length; 
        int[] ans = Arrays.copyOf(nums,2*n); 
        for(int i = n; i < 2*n; i++) {
            ans[i] = nums[i - n];  
        }
        return ans; 
        
    }
	
	
	//suffle array and arrange element in a way that first e
	// is from array[0] and second element is array[length/2]
	public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n]; 
        
        for(int i = 0, j = 0; i < n; i++) {
            ans[j] = nums[i]; 
            ans[j + 1] = nums[i + n]; 
            j += 2; 
        }
        return ans;
    }
	
	//find max row
	public static int maximumWealth(int[][] accounts) {
	    int sum = Integer.MIN_VALUE; 
		for(int i = 0; i < accounts[0].length; i++) {
			int total = Arrays.stream(accounts[i]).sum(); 
			if(sum < total) {
				sum = total; 
			}
		}
		
		return sum; 
	        
	}
	
	//find identical pairs(i, j) such that i < j and value of i = value of j 
	public static int numIdenticalPairs(int[] nums) {
       
		//1. Sort the array
		Arrays.sort(nums);
		int identicalPairs = 0; 
		int count[] = new int[nums[nums.length - 1] + 1]; 
		for(int i = 0; i < nums.length; i++) {
			count[nums[i]]++; 
		}
		for(int i: count) {
			identicalPairs += (int)Math.floor(i * (i - 1) / 2); 
		}
		return identicalPairs;
		
    }
	
	
	public static  List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    
		List<Boolean> ans = new ArrayList<>(); 
		
		int max = Arrays.stream(candies).max().orElse(0);
		for(int i = 0; i < candies.length; i++) {
			if (candies[i] + extraCandies >= max) {
				ans.add(true); 
			}else {
				ans.add(false); 
			}
		}
		
		return ans; 
    
	}
	
	public static void main(String[] args) {
		
		//1
		int[] nums = {0,2,1,5,3,4}; 
		Integer[] numsInteger = Arrays.stream(buildArray(nums)).
				boxed().toArray(Integer[]::new);
		System.out.println(Arrays.deepToString(numsInteger));
		
		
		//2
		int[] num1 = {1,2,1}; 
		getConcatenation(num1); 
		
		//3
		int[]  num2 = {2,5,1,3,4,7}; 
		shuffle(num2, 3); 
		
		//4
		int[][] accounts = {{1,5},{7,3},{3,5}}; 
		System.out.println(maximumWealth(accounts)); 
		
		//5
		int[] num3 = {1,2,3,1,1,3}; 
		System.out.println(numIdenticalPairs(num3));
		
		//6
		int[] candies = {12,1,12};  int extraCandies = 10; 
		
		System.out.println(kidsWithCandies(candies, extraCandies));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
//		double[] scores = new double[10]; 
//		scores[0] = 2.34; 
//		int[] ages = {1,2,3,34,5}; 
//		int[] cloneAges = ages.clone(); 
//		ages[0] = 30; 
//		System.out.println(cloneAges[0]);
//		System.out.println(ages instanceof Object);
//		System.out.println(ages.hashCode());
//		System.out.println(scores.getClass().getName());
//		
//		
//		//Arrays.asList(Wrapper Class Array)
//		Integer[] nums = {1,2,3,4,5}; 
//		Integer[] nums1 = {1,2,3,4,6}; 
//		List<Integer> numsList = Arrays.asList(nums); 
//		
// 		for(Integer i: numsList) {
//			System.out.println(i);
//		}
//		
// 		//List of Integer from int[]
// 		List<Integer> agesList = Arrays.stream(ages).boxed().
// 				collect(Collectors.toList());
// 		
// 		//Array of Integers from int[]
// 		Integer[] agesWrapper = Arrays.stream(ages).boxed().toArray(Integer[]::new);
// 		
// 		
// 		
// 		Integer[] copy = Arrays.copyOf(nums,5); 
// 		for(Integer i: copy) {
// 			System.out.println(i);
// 		}
// 		
// 		//.equal is for non nested arrays and .deepEquals is for 
// 		// multi deminsion arrays. 
// 		String[] names = {"I am fine and how are you", "Khan, is khan"}; 
// 		System.out.println(Arrays.deepEquals(nums, copy)); 
// 		Object[] nestedString = {"I", " am", " Raza.", 
// 				"She ","is ", "Saba.'Khan is Here'", names };
// 		
// 		Object[] nestedNumber = {1,2,3,4,5,6}; 
// 		
// 		String s = Arrays.deepToString(nestedString); 
// 		System.out.println(s);
// 		System.out.println(Arrays.deepToString(nestedNumber));
// 		System.out.println(Arrays.mismatch(nums, nums1));
// 		
// 		Boolean[] isTrue = new Boolean[10]; 
// 		Arrays.fill(isTrue, false);
// 		System.out.println(Arrays.deepToString(isTrue));
 		
 		
 		
	}

}
