package patterns.striver;

import java.util.Scanner;

/* 
 * @url https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/

1
01
101
0101
10101
010101
 
*/
public class Pattern11 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = in.nextInt();

        createPattern11(n);
        
        in.close();
    }

    private static void createPattern11(int n) {
        
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                int rem = (i+j+1)%2;
                System.out.print(rem);
            }
            System.out.println();
        }
    }
}