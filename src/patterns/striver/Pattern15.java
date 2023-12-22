package patterns.striver;

import java.util.Scanner;

/* 
 * @url https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/

A B C D E F
A B C D E 
A B C D
A B C
A B
A
 
*/
public class Pattern15 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = in.nextInt();

        createPattern15(n);
        
        in.close();
    }

    private static void createPattern15(int n) {
        for (int i = n; i >= 1; i--) {
            int count = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print((char)count++ + " ");
            }
            System.out.println();
        }
    }
}