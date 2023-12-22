package patterns.striver;

import java.util.Scanner;

/* 
 * @url https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
 
******
*****
****
***
**
*
 
*/
public class Pattern5 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = in.nextInt();

        createPattern5(n);
        
        in.close();
    }

    private static void createPattern5(int n) {
        
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}