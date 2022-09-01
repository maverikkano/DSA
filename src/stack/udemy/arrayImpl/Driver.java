/**
 * 
 */
package stack.udemy.arrayImpl;

/**
 * @author abhishek
 *
 */
public class Driver {

	
	/**
	 * @param args
	 * @shortcomings -Random access not needed -Fixed size, need to be resized
	 */
	public static void main(String[] args) {
		
		Employee abhishek = new Employee("Abhishek", "1");
		Employee himanshu = new Employee("Himanshu", "2");
		Employee mom = new Employee("Mom", "3");
		Employee dad = new Employee("Dad", "4");
		
		ArrayStack stack = new ArrayStack(3);
		stack.push(abhishek);
		stack.push(himanshu);
		stack.push(mom);
		
		System.out.println("Capacity: "+stack.getCapacity());
		stack.printStack();
		
		stack.push(dad);
		System.out.println("Capacity: "+stack.getCapacity());
		stack.printStack();

	}

}
