package linkedLists.udemy.doublyLL.implementation;

public class EmployeeLinkedList {

	EmployeeNode head;
	EmployeeNode tail;
	int size;
	
	public void addToFront(Employee employee) {
		
		EmployeeNode node = new EmployeeNode(employee);
		
		// If LL is empty
		if(head == null && tail == null) {
			head = node;
			tail = node;
			node.setNext(null);
			node.setPrev(null);
			size++;
			return;
		}
		
		// If LL isn't empty
		node.setNext(head);
		node.setPrev(null);
		head.setPrev(node);
		head = node;
		size++;
	}
	
	public Employee removeFromFront() {
		
		// If empty list
		if(head == null && tail == null)
			return null;
		
		EmployeeNode node = head;
		
		// Only 1 element in LL
		if(head == tail) {
			node.setNext(null);
			node.setPrev(null);
			head = null;
			tail = null;
			size--;
			return node.getData();
		}
		
		// If 1+ element
		
		head.getNext().setPrev(null);	
		head = head.getNext();
		node.setNext(null);
		node.setPrev(null);
		size--;
		
		return node.getData();
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void printList() {
		
		EmployeeNode cursor = head;
		
		if(cursor == null)
			System.out.println("The Linked List is empty.");
		
		System.out.print("HEAD <=> ");
		while(cursor != null) {
			
			System.out.print(cursor);
			System.out.print(" <=> ");
			cursor = cursor.getNext();
		}
		System.out.print("null\n");
	}
}
