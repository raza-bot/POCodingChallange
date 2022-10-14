package Week5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//one null value. performance constant. no insertion order
		//uses hashmap internally
		Set<Integer> evenNumbers = new HashSet<>(); 
		evenNumbers.add(0); 
		evenNumbers.add(2); 
		evenNumbers.add(2); 
		evenNumbers.add(4);
		
		Set<Integer> oddNumbers = new HashSet<>(); 
		oddNumbers.add(1); 
		oddNumbers.add(3); 
		oddNumbers.add(5); 
		
		System.out.println(evenNumbers  +", "+ oddNumbers);
		
		//union operation of sets. Sort it auto...
		//oddNumbers.addAll(evenNumbers); 
		System.out.println(oddNumbers);
		
		//intersection
		//oddNumbers.retainAll(evenNumbers); 
		System.out.println(oddNumbers);
		
		//set differences
		oddNumbers.removeAll(evenNumbers); 
		System.out.println(oddNumbers);
		
		//check for subset
		Set<Integer> even = new HashSet<>(); 
		even.add(0); 
		even.add(2); 
		System.out.println(evenNumbers.containsAll(even));
		
		
		//LinkedHashSet: maintains the order, slower, uses hash table to store. 
		// to maintain insertion order, it uses linkedlist. Uses linkedhashmap
		//allow one null value. Constant time 
		LinkedHashSet<Integer> numbers = new LinkedHashSet<>();; 
		
		numbers.add(10000); 
		numbers.add(1000); 
		numbers.add(-12); 
		numbers.add(100000);
	
		System.out.println(numbers);
		
		//TreeSet: Sorts, slower than hashset, more methods to navigate
		//No null value. Log(n). Uses treemap
		NavigableSet<Integer> sortedNums = new TreeSet<>(); 
		sortedNums.add(10000); 
		sortedNums.add(1000); 
		sortedNums.add(-12); 
		sortedNums.add(100000);
		
		System.out.println(sortedNums);
		System.out.println(sortedNums.first());
		System.out.println(sortedNums.higher(1000));
		System.out.println(sortedNums.headSet(10000, true));
		System.out.println(sortedNums.tailSet(1000));
		System.out.println(sortedNums.subSet(-12, 10000));
		
		String s = "codeleet"; int[] indices = {4,5,6,7,0,1,2,3}; 
		System.out.println(restoreString(s, indices)); 
		
		String ss = "A1:F1"; 
		cellsInRange(ss); 
		
		
	}
	
	
	public static String restoreString(String s, int[] indices) {
        
		String newString = ""; 
        for(int i = 0; i < s.length(); i++) {
             newString = newString + s.charAt(indices[i]); 
        }
        
        return newString; 
    }
	
	
	public static List<String> cellsInRange(String s) {
	      
		String[] result = s.split(":"); 
		
		char start = result[0].charAt(1);
		char end = result[1].charAt(1); 
		
		List<String> cells = new ArrayList<>(); 
		
		for(char c = result[0].charAt(0); c <= result[1].charAt(0); c++) {
			for (char d = start; d <= end; d++) {
				cells.add(""+c+d); 
			}
		}
		
		
		return new ArrayList<>(); 
	}
	
	

}
