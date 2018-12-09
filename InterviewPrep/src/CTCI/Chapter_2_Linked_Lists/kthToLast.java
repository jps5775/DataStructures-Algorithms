package CTCI.Chapter_2_Linked_Lists;

public class kthToLast {
	/**
	 * Recursive Solution:
	 * 
	 * Space: O(n) where n is the number of elements in the list
	 * Time: O(n) where n is the length of the list
	 */
	int kthToLast1(Node head, int k){
		// base case
		if(head == null){
			return 0;
		}
		
		int index = kthToLast1(head.next, k) + 1;
		if(k == index){
			//print out data
			System.out.println(head.data);
		}
		
		return index;
	}
	
	/**
	 * Iterative Solution:
	 * 
	 * Space: O(1) Constant Space
	 * Time: O(n) where n is the length of the list
	 */
	Node kthToLast2(Node head, int k){
		Node p1 = head;
		Node p2 = head;
		
		// advance p1 k spaces
		for(int i = 0; i < k; i++){
			if(p1 == null) return null;
			p1 = p1.next;
		}
		
		// advance both till p1 reaches the end
		while(p1 != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		// return p2 because it is length - k spaces from end of list
		return p2;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

