package basics.striver._6_PrintDivisors;

import java.util.Scanner;

public class PrintDivisors {
    public static void main(String[] args) {
            
        Scanner in = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = in.nextInt();

        printAllDivisors(n);
        
        in.close();
    }

    // Intuition: Only need to check numbers till square root of the given number for divisors
    public static void printAllDivisors(int n) {

        int root = (int) Math.sqrt(n);

        for (int i = 1; i <= root; i++) {
            if (n%i == 0) {
                System.out.print(i+" ");
                if(i != n/i)
                    System.out.print(n/i+" ");
            }
        }
    }
}
