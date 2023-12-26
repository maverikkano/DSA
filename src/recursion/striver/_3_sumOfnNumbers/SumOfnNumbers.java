package recursion.striver._3_sumOfnNumbers;

import java.util.Scanner;

/*
* 1. Every step same -> Recursive possible
* 2. Recurrence Relation : f(n) = n + f(n-1);
* 3. Tree & Stack drawn (PFA)
* 4. Base condition: if(n==1)
*
* Time Complexity: O(n)
* Space Complexity: O(n)
*/
public class SumOfnNumbers {
    public static void main(String[] args) {
                
        Scanner in = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = in.nextInt();

        int addition = sum(n);
        
        System.out.println("Addition: "+addition);

        in.close();
    }

    public static int sum(int n) {
        
        if (n == 0) {
            return 0;
        }

        return (n + sum(n-1));        
    }
}
