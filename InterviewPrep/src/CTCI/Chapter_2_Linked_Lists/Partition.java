package CTCI.Chapter_2_Linked_Lists;

public class Partition {
	
	static Node part(Node head, int x){
		Node list1 = null; // head
		Node list2 = null; // head
		
		while(head != null){
			Node newNode = new Node(head.data);
			if(x <= head.data){
				newNode.next = list2;
				list2 = newNode;
			}else{
				newNode.next = list1;
				list1 = newNode;
			}
			head = head.next;
		}
		
		Node curr = list1;
		while(curr.next != null){
			curr = curr.next;
		}
		
		curr.next = list2;
		
		return list1;
	}
	
	
	public static void main(String[] args){
		MyLinkedList list = new MyLinkedList();
		list.append(3);
		list.append(5);
		list.append(8);
		list.append(5);
		list.append(10);
		list.append(2);
		list.append(1);
		Node thisHead = list.head;
		Node partList = part(thisHead, 5);
		
		while(partList != null){
			System.out.println(partList.data);
			partList = partList.next;
		}
	}
}
