package week6;

public class CodingChallenge {

	
	public boolean loopDetection(Node first) {
		Node slow = first,
	             fast = first;
	 
	        while (slow != null
	               && fast != null
	               && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	            if (slow == fast)
	                return true;
	        }
	 
	    return false;	
	}
	
	public Node findInterset(Node first, Node second) {
		
		Node a = first, b = second;
        while (a != b) {
            a = a == null ? first : a.next;
            b = b == null ? first : b.next;
        }
        return a;
		
	}
	
	
	class Node {
		
		Node next; 
		int data; 
		Node head; 
		
		Node(int data)
	    {
	        this.data = data;
	        next = null;
	    }

	}

}
