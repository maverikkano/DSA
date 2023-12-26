package recursion.striver._7_fibonacci;

import java.util.Scanner;

/*
* 1. Every step same -> Recursive possible
* 2. Recurrence Relation : f(n) = f(n-1) + f(n-2);
* 3. Tree & Stack drawn: PFA
* 4. Base condition: if(n<=1)   return n;
* 
* Time complexity: O(2^n)
* Space complexity: O(n)    // max N calls waiting in line, others calls will be of smaller depth
*/
public class Fibonacci {
    public static void main(String[] args) {
            
        Scanner in = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = in.nextInt();

        int fibo = fibonacci(n);
        
        System.out.println("Fibonacci no: "+fibo);

        in.close();
    }

    public static int fibonacci(int n) {

        if (n <= 1) {
            return 1;
        }
        
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
