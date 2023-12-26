package recursion.striver._2_ascendingDescendingPrint;

import java.util.Scanner;

/*
* 1. Every step same -> Recursive possible
* 2. Recurrence Relation : f(n) = sysout(n) + f(n-1); for descending; f(n) = f(n-1) + sysout(n); for ascending
* 3. Tree & Stack drawn (Same as PrintNTimes)
* 4. Base condition: if(n<1)
* 
* Time complexity: O(n)
* Space complexity: O(n)
*/

public class AscendingDescendingPrint {
    public static void main(String[] args) {
                
        Scanner in = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = in.nextInt();

        System.out.println("\nAscending: ");
        printAscending(n);
        System.out.println("\nDescending: ");
        printDescending(n);
        
        in.close();
    }

    private static void printAscending(int n) {
        if (n < 1) {
            return;
        }

        System.out.print(n+" ");
        
        printAscending(n-1);
    }

    private static void printDescending(int n) {
        if (n < 1) {
            return;
        }

        printDescending(n-1);

        System.out.print(n+" ");

    }
    
}
