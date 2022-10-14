package week4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> random = new LinkedList<>(); 
		random.add(1); 
		random.add(0, 0);
		random.addFirst(-1);;
		random.offerFirst(-2); 
		random.add(-10);
		System.out.println(random);
		Iterator<Integer> it = random.iterator(); 
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		ListIterator<Integer> lIt = random.listIterator(random.size()); 
		
		while(lIt.hasPrevious()) {
			System.out.println(lIt.previous());
		}
		
		
	}
	

}
