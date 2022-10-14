package Week5;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

public class PriorityQueueCalss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> nums = new PriorityQueue<>(); 
		nums.add(10); 
		nums.add(5); 
		nums.add(25); 
		nums.add(1); 
		System.out.println(nums);
		nums.offer(-1); 
		System.out.println(nums);
		nums.offer(-1); 
		System.out.println(nums);
		System.out.println(nums.peek());
		System.out.println(nums.contains(-1));
		System.out.println(nums);
		
		//Natural order of min heap
		Iterator<Integer> it = nums.iterator(); 
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		//max heap
		PriorityQueue<Double> numsDecimal = 
				new PriorityQueue<>(new CustomComparator());
		numsDecimal.add(2.3); 
		numsDecimal.add(10.0); 
		numsDecimal.add(30.0); 
		numsDecimal.add(-10.0); 
		System.out.println(numsDecimal);
		
		PriorityQueue<String > names = new PriorityQueue<>(); 
		names.add("Raza"); 
		names.add("Raza"); 

		
		names.add(""
				+ ""); 
		System.out.println(names);
		
		
		//concurrentlinkedqueue: No null, unbounded thread-safed, duplicate allowed
		//Used when common collection is used by * threads. No lock
		
		ConcurrentLinkedQueue<String> brothers = new ConcurrentLinkedQueue<>(); 
		brothers.add(" "); 
		brothers.add("Raza"); 
		brothers.add("Raza"); 
		System.out.println(brothers);
		//retrieve element from the head of queue and throws exception if empty
		System.out.println(brothers.element());
		
		//Bounded, thread-safe, array data structure, one lock
		ArrayBlockingQueue<Integer> luckyNums = new ArrayBlockingQueue<>(3); 
		
		//Bounded, Uses two lock. Producer and consumer do not block each other. linkedlist 
		LinkedBlockingQueue<Integer> luckynumbers = new LinkedBlockingQueue<>(6);
		
		//unbounded. remove item when it expires
		DelayQueue<DelayedElement<Integer>> notFifo = new DelayQueue<>(); 
		
		//unbounded, single lock
		PriorityBlockingQueue<Integer> testingNums = new PriorityBlockingQueue<>(); 
		
		
		//deque interface
		//No null elements. Not thread safe, unbounded. Faster than linkedlist and 
		//stack classes
		ArrayDeque<Integer> queue = new ArrayDeque<>(); 
		LinkedList<Double> doubleQueue = new LinkedList<>(); 
		List<Integer> ls = new ArrayList<>(); 
		
		
		
		
		
			
	}

}

class DelayedElement<T> implements Delayed {

	@Override
	public int compareTo(Delayed o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getDelay(TimeUnit unit) {
		// TODO Auto-generated method stub
		return 0;
	}

}


//custom comparator that changes the min heap to max heap
class CustomComparator implements Comparator<Double> {

	@Override
	public int compare(Double o1, Double o2) {
		// TODO Auto-generated method stub
		int value = o1.compareTo(o2); 
		if (value > 0) {
			return -1; 
		}else if (value < 0) {
			return 1; 
		}
		else {
			return 0;
		}
	}
	
}
