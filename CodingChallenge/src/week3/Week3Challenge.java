package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Week3Challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] actual = {515, 341, 98, 44, 211}; 
		 int[] expected =  reorderDigits(actual, "asc");
		 
		 System.out.print("Expected Result: ");
		 for(int i: expected) {
			 System.out.print(i + " ");
		 }
		 System.out.println();
		 
		 
		 int[] actualArr = {515, 341, 98, 44, 211}; 
		 int[] expectedArr =  reorderDigits(actualArr, "desc");
		 
		 System.out.print("Expected Result: ");
		 for(int i: expectedArr) {
			 System.out.print(i + " ");
		 }
		 System.out.println();
		 
		  
		 int[] B = {-1, -20, 5, -1, -2, 2}; 
		 int[] C = {-1, -10, 1, -2, 20}; 
		 System.out.println(canPartition(C));

	}
	
	
	//Method to order digits in a given array. 
	public static int[] reorderDigits(int[] arr, String orderType) {
			
	  orderType.toLowerCase(); 
	  
	  for (int i = 0; i < arr.length; i++) {
		  List<Integer> num = new ArrayList<>(); 
		  int j = arr[i]; 
		  while (j > 0) {
			  num.add(j % 10); 
			  j = j / 10; 
		  }
		  
		  if (orderType == "asc") {
			  String numString = num.stream().sorted().
					  map(n-> Integer.toString(n)).collect(Collectors.joining("")); 
			  arr[i] = Integer.parseInt(numString); 
		  }else {
			  String numString = num.stream().sorted(Collections.reverseOrder()).
					  map(n->Integer.toString(n)).collect(Collectors.joining("")); 
			  arr[i] = Integer.parseInt(numString); 
		  }
	  }
	  return arr;   
	}
	  
	 // Method to find if an element is equal to the product of all other 
	 // elements excluding the target element. 
	  public static boolean canPartition(int[] arr) {
		  
		  int product = 1; 
		  int isSame = 0; 
		  for (int i = 0; i < arr.length; i++) {
			  product = product * arr[i]; 
		  }
		  
		  for (int j = 0; j < arr.length; j++) {
			  isSame = product / arr[j];
			  if (isSame == arr[j]) {
				  return true; 
			  }
		  }
		  return false; 
	  }

}
