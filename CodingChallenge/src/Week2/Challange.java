package Week2;

//import java.util.Arrays;
///**
// * 
// * @author Raza Ghulam
// *
// */
//public class Challenge {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] arr = {3, 10, 6, 7}; 
//		Arrays.sort(arr); 
//		int gap = arr[arr.length - 1] - arr[0]; 
//		System.out.println(gap);
//		
//		//Second method can also be applied. Find the max and min 
//		// in the array and subtract them. 
//		
//		//max sum of sub-array
////		int arr1[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; 
//		int arr1[] = {2,2,-2}; 
//		
//		int sum = 0; 
//		int max = 0; 
//		
//		for (int i = 0; i < arr1.length; i++) {
//			if (arr1[i] > max + arr1[i] ) {
//				max = arr1[i];  
//			}else {
//				max = max + arr1[i];  
//			}
//			
//			if (max > sum) {
//				sum = max; 
//			}
//		}
//		
//		System.out.println(sum);
//	}
//
//}


import java.util.*;
import java.io.*;
import java.lang.Math;
import java.util.HashSet; 
import java.util.Set;
import java.util.stream.Collectors; 

public class Challange
{
  public static int equalSplitArray(int N,int[] A)
  {

    //this is default OUTPUT. You can change it.
    int result = -404;

    //write your Logic here:
    int split = (int) Math.ceil(N/2);
    int[] firstHalf = Arrays.copyOfRange(A, 0, split + 1); 
    int[] secondHalf = Arrays.copyOfRange(A, split + 1, N); 

    Set<Integer> firstHalfSet = 
                  new HashSet<Integer>(); 
    Set<Integer> secondHalfSet = 
                  new HashSet<Integer>(); 
    
    Collections.addAll(firstHalfSet, Arrays.stream(firstHalf).boxed().toArray(Integer[]::new));
    Collections.addAll(secondHalfSet, Arrays.stream(secondHalf).boxed().toArray(Integer[]::new));

    if (firstHalfSet.size() == secondHalfSet.size()) {
      return split + 1;  
    }else {
      return -1; 
    }
  }


 
  
  
  public static void main (String[]args)
  {
	  
//	  int[] digits = Integer.toString(2341).chars().map(c -> c -'0').toArray(); 
//	  System.out.println(digits.toString());
//	  Arrays.sort(digits);
//	  System.out.println(digits); 
//	  List<Integer> list = Arrays.stream(digits).boxed().collect(Collectors.toList()); 
//	  Collections.reverse(list);
//	  System.out.println(digits); 

//    //OUTPUT [uncomment & modify if required]
//    System.out.print(equalSplitArray(A.length, A));
//  }
  }
}
