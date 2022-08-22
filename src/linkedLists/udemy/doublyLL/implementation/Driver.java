/**
 * 
 */
package linkedLists.udemy.doublyLL.implementation;

/**
 * @author abhishek
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employee abhishek = new Employee("Abhishek", "1");
		Employee himanshu = new Employee("Himanshu", "2");
		Employee mom = new Employee("Mom", "3");
		Employee dad = new Employee("Dad", "4");
		
		
		EmployeeLinkedList empLL = new EmployeeLinkedList();
		System.out.println("Is Empty: "+empLL.isEmpty());
		empLL.printList();
		
		empLL.addToFront(abhishek);
		empLL.printList();
		empLL.addToFront(himanshu);
		
		empLL.printList();
		
		System.out.println("Get Size: "+empLL.getSize());
		System.out.println("Is Empty: "+empLL.isEmpty());
		
		System.out.println(empLL.removeFromFront());
		empLL.printList();
	}

}
