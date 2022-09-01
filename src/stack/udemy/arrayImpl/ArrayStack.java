package stack.udemy.arrayImpl;

import java.util.EmptyStackException;

public class ArrayStack {

	
	private Employee[] stack;
	private int top;	// next available position
	
	public ArrayStack(int capacity) {
		stack = new Employee[capacity];
	}
	
	public void push(Employee employee) {
		
		// if full
		if(top == this.stack.length) {
			// resize
			Employee newArray[] = new Employee[2*this.stack.length];
			System.arraycopy(stack, 0, newArray, 0, stack.length);
			stack = newArray;
		}
		
		// else
		// push
		stack[top++] = employee;
	}
	
	public Employee pop() throws EmptyStackException {
		if(isEmpty())
			throw new EmptyStackException();
		
		Employee popped = stack[--top];
		stack[top] = null;
		
		return popped;
	}
	
	public Employee peek() throws EmptyStackException {
		if(top == 0)
			throw new EmptyStackException();
		
		return stack[top-1];
	}
	
	public boolean isEmpty() {
		return top==0;	
	}
	
	public int size() {
		return top-1;
	}
	
	public int getCapacity() {
		return stack.length;
	}
	
	public void printStack() {
		System.out.print("Start -> ");
		for(int i=top-1; i >= 0; i--)
			System.out.print(stack[i]+" ->");
		System.out.print(" -> End");
		System.out.println();
	}
	
}
