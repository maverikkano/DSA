package linkedLists.udemy.singlyLL.implementation;

public class EmployeeLinkedList {

	EmployeeNode head;
	int size;
	
	public void addToFront(Employee employee) {
		
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
		size++;
	}
	
	public Employee removeFromFront() {
		
		if(head == null)
			return null;
		
		Employee data = head.getData();
		head = head.getNext();
		size--;
		
		return data;
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
		
		System.out.print("HEAD-> ");
		while(cursor != null) {
			
			System.out.print(cursor);
			System.out.print("-> ");
			cursor = cursor.getNext();
		}
		System.out.print("null\n");
	}
}
