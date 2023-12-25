package recursion.striver._4_factorial;

import java.util.Scanner;

/*
* 1. Every step same -> Recursive possible
* 2. Recurrence Relation : f(n) = n * f(n-1);
* 3. Tree & Stack drawn (Same as sumOfnNumbers)
* 4. Base condition: if(n==1)
*/

public class Factorial {
    public static void main(String[] args) {
            
        Scanner in = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = in.nextInt();

        int fact = factorial(n);
        
        System.out.println("Factorial:"+fact);

        in.close();
    }

    public static int factorial(int n) {

        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        }
        return n * factorial(n-1);
    }
}
