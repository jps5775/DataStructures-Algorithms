package CTCI.Chapter_2_Linked_Lists;

import java.util.HashSet;

public class RemoveDuplicates {
	/**
	 * Write code to remove duplicates from an unsorted linked list
	 * 
	 * Follow up question:
	 * 
	 * How would solve this problem if a temporary buffer is not
	 * allowed.
	 */
	
	public void removeDupsLinkedList(Node n){
		
		HashSet set = new HashSet();
		
		Node prevNode = null;
		
		while(n != null){
			// delete in set contains data
			if(set.contains(n.data)){
				prevNode.next = n.next;		
			}
			// else add to set and update prev node
			else{
				set.add(n.data);
				prevNode = n;
			}
				
			n = n.next;
		}
		
	}
}
