package recursion.striver._1_printNTimes;

import java.util.Scanner;

public class printNTimes {

    public static void main(String[] args) {
                
            Scanner in = new Scanner(System.in);

            System.out.println("Enter string: ");
            String str = in.nextLine();
    
            System.out.println("Enter n: ");
            int n = in.nextInt();
    
            printRecursively(str,n);
            
            in.close();
        }

    private static void printRecursively(String str, int n) {

        /*
         * 1. Every step same -> Recursive possible
         * 2. Recurrence Relation : f(n) = sysout + f(n-1);
         * 3. Tree & Stack drawn (PFA)
         * 4. Base condition: if(n<1)
         */
        
        if (n < 1) {
            return;
        }
        System.out.println(str);
        printRecursively(str, n-1);
    }
}
