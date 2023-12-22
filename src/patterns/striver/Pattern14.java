package patterns.striver;

import java.util.Scanner;

/* 
 * @url https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/

A
A B
A B C
A B C D
A B C D E
A B C D E F
 
*/
public class Pattern14 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = in.nextInt();

        createPattern14(n);
        
        in.close();
    }

    private static void createPattern14(int n) {
        int count = 'A';
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)count + "  ");
                count++;
            }
            System.out.println();
        }
    }
}