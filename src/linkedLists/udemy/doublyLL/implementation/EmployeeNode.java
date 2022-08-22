package linkedLists.udemy.doublyLL.implementation;

public class EmployeeNode {

	private Employee data;
	private EmployeeNode next;
	private EmployeeNode prev;

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

	public EmployeeNode getPrev() {
		return prev;
	}

	public void setPrev(EmployeeNode prev) {
		this.prev = prev;
	}

	@Override
	public String toString() {
		return data.toString();
	}
}
