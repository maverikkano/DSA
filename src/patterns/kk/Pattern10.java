package patterns.kk;

import java.util.Scanner;

/* 
 * @url https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/

     *
     **
     *** 
     ****
     *****
     ******  
     *****
     ****
     ***    
     **
     *
 
*/
public class Pattern10 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = in.nextInt();

        createPattern10(n);
        
        in.close();
    }

    private static void createPattern10(int n) {
        
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}