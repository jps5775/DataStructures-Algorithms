package CTCI.Chapter_2_Linked_Lists;

public class LinkedList {
	
	Node head;
	
	public void append(int data){
		if(head == null){
			head = new Node(data);
		}else{
		
			Node newNode = new Node(data);
			
			Node current = head;
			// go through list till the end
			while(current.next != null){
				current = current.next;
			}
			
			current.next = newNode;
		}
		
	}
	
	public void remove(int data){
		if(head.data == data){
			head = head.next;
			return;
		}else{
			
			Node current = head;
			
			// go through the list
			while(current.next != null){
				// if found data then delete it
				if(current.next.data == data){
					
					Node deletedNode = current.next;
					current.next = current.next.next;
					
					
					System.out.println("Deleted: " + deletedNode.data);
					return;
				}
				current = current.next;
			}
		}
		
		// if got to the end of the list then
		// the data was not found
		System.out.println("Not found");
		
	}
	
	public void printAll(){
		Node current = head;
		
		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}
		
		
		System.out.println("Done!");
	}
	
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		
		ll.append(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.remove(1);
		ll.printAll();
	}
	
	
	
}
