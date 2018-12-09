package CTCI.Chapter_2_Linked_Lists;

// prepend
// append
// removeFirst
// removeLast
// printAll

public class MyLinkedList {
	
	Node head;
	
	public void append(int data){
		// check if the list is empty
		if(head == null){
			head = new Node(data);
		}else{
			// creates the new Node to add at the end of the list
			Node newNode = new Node(data);
			// goes through the whole list using current
			Node current = head;
			
			while(current.next != null){
				current = current.next;
			}
			// puts new node into the last spot in the list
			current.next = newNode;
		}
		
		
	}
	
	public void prepend(int data){
		Node newHead = new Node(data);
		// this gets the head node data and next node ref and stores it into the newHead
		newHead.next = head;
		// says that the head is now the newHead 
		head = newHead;
	}
	
	public void print(){
		
		Node current = head;
		while(current.next != null){
			System.out.println(current.data);
			current = current.next;
		}
		
	}
	
	public void removeLast(){
		
	}
	
	public Node removeFirst(){
		// node removed to return
		Node nodeRemoved = head;
		
		// if the list is empty return null;
		if(head.next == null){
			return null;
		}else{ // if the list has node remove first from list
			head = head.next;
		}
		
		return nodeRemoved;
	}
	
	public Node removeNode(int data){
		Node currentNode = head;
		Node prevNode = head;
		
		// goes through list and checks for the link to remove and
		// iterates through the list if it isn't found. Also
		// returns null if the Node is not found
		while(currentNode.data != data){
			if(currentNode.next == null){
				return null; // went through the entire LinkedList
			}else{ // still going through list
				prevNode = currentNode;
				currentNode = currentNode.next;
			}
			
		}
		
		// if it reaches this point it has found something
		// first if checks if the node to remove is the head
		if(currentNode == head){
			// remove the head
			head = head.next;
		}else{
			// remove the Node using prevNode and currentNode
			prevNode.next = currentNode.next;
		}
		
		return currentNode;
	}
	
	public Node serachFor(int data){
		
		Node current = head;
		
		if(head.next == null){
			System.out.println("The LinkedList is empty");
			return null;
		}else{
			while(current.data != data){
				if(current.next == null){
					return null;
				}else{
					current = current.next;
				}
			}
		}
		return current;
	}
	
	
	public static void main(String[] args){
		MyLinkedList LL = new MyLinkedList();
		
		LL.append(0);
		LL.append(1);
		LL.append(2);
		LL.append(3);
		LL.prepend(1);
		LL.print();
		Node foundNode = LL.serachFor(2);
		System.out.println("Found this node: " + foundNode.data);
	}
	
}

