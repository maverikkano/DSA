package patterns.striver;

import java.util.Scanner;

/* 
 * @url https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/

     A     
    ABA    
   ABCBA   
  ABCDCBA  
 ABCDEDCBA 
ABCDEFEDCBA

*/
public class Pattern17 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = in.nextInt();

        createPattern17(n);
        
        in.close();
    }

    private static void createPattern17(int n) {
        
        for (int i = 1; i <= n; i++) {
            int count = 'A';
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char)count++);
            }

            count = 'A' + i - 2;
            for (int j = i-1; j >= 1; j--) {
                System.out.print((char)count--);
            }
            System.out.println();
        }
    }
}