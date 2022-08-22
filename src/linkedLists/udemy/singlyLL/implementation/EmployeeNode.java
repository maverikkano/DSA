package linkedLists.udemy.singlyLL.implementation;

public class EmployeeNode {
	
	private Employee data;
	private EmployeeNode next;
	
	public EmployeeNode(Employee node) {
		super();
		this.data = node;
	}

	public Employee getData() {
		return data;
	}

	public void setData(Employee node) {
		this.data = node;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}


	@Override
	public String toString() {
		return data.toString();
	}
}
