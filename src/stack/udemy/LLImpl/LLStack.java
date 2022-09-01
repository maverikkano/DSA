package stack.udemy.LLImpl;

import java.util.LinkedList;

public class LLStack {
	LinkedList<Employee> stack;
	
	public LLStack() {
		stack = new LinkedList<Employee>();
	}
	
	public void push(Employee employee) {
		stack.push(employee);
	}
	
	public Employee pop() {
		return stack.pop();

	}
	
	public Employee peek() {
		return stack.peek();
	}
	
	public void isEmpty() {
		stack.isEmpty();
	}
	
	public void size() {
		stack.size();
	}
	
	public void printLLStack() {
		stack.forEach(employee -> System.out.print(employee+" "));

	}
}
