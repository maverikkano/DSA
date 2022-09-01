/**
 * 
 */
package queue.udemy.circular;

/**
 * @author abhishek
 *
 */
public class Driver {

	public static void main(String[] args) {
		
		Employee abhishek = new Employee("Abhishek", "1");
		Employee himanshu = new Employee("Himanshu", "2");
		Employee mom = new Employee("Mom", "3");
		Employee dad = new Employee("Dad", "4");
		Employee sandy = new Employee("Sandy", "5");
		Employee mandy = new Employee("Mandy", "6");

		ArrayQueue queue = new ArrayQueue(3);
		queue.add(abhishek);
		queue.add(himanshu);
		queue.add(himanshu);
		queue.remove();
		queue.add(mom);
		queue.remove();
		queue.add(dad);
		queue.add(himanshu);
		queue.remove();
		queue.add(sandy);
		queue.remove();
		queue.add(mandy);

		queue.printQueue();


	}

}
