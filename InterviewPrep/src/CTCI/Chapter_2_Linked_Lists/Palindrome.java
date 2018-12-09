package CTCI.Chapter_2_Linked_Lists;

public class Palindrome {
	boolean isPalindrome(Node head, Node revHead){
		while(head != null && revHead != null){
			if(head.data != revHead.data){
				return false;
			}
			head = head.next;
			revHead = revHead.next;
		}
		
		return true;
	}
	
	Node reverse(Node head){
		
		Node revHead = null;
		
		while(head != null){
			// prepend to revHead
			Node newNode = new Node(head.data);
			newNode.next = revHead;
			revHead = newNode;
			
			head = head.next;
		}
		
		return revHead;
	}
	
	
}
