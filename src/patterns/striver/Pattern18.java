package patterns.striver;

import java.util.Scanner;

/* 
 * @url https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/

F
E F
D E F
C D E F
B C D E F
A B C D E F

*/
public class Pattern18 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = in.nextInt();

        createPattern18(n);
        
        in.close();
    }

    private static void createPattern18(int n) {
        
        int count = 'A'+n-1;

        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)(count+j)+" ");
            }
            count--;
            System.out.println();
        }
    }
}