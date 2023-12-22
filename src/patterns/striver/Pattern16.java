package patterns.striver;

import java.util.Scanner;

/* 
 * @url https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/

A 
B B
C C C
D D D D
E E E E E
F F F F F F
 
*/
public class Pattern16 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = in.nextInt();

        createPattern16(n);
        
        in.close();
    }

    private static void createPattern16(int n) {
        int count = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)count + "  ");
            }
            count++;
            System.out.println();
        }
    }
}