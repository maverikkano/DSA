/**
 * 
 */
package queue.udemy.arrayImpl;

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
		
		ArrayQueue queue = new ArrayQueue(3);
		queue.add(abhishek);
		queue.add(himanshu);
		queue.add(mom);
		queue.add(dad);
		queue.printQueue();

		System.out.println(queue.remove());
		queue.printQueue();

	}

}
