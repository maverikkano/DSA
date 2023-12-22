package patterns.kk;

import java.util.Scanner;

/* 
 * @url https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
 
***********
 *********
  *******
   ***** 
    ***    
     *
 
*/
public class Pattern8 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = in.nextInt();

        createPattern8(n);
        
        in.close();
    }

    private static void createPattern8(int n) {
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 2*(n-i)+1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}