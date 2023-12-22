package patterns.striver;

import java.util.Scanner;

/* 
 * @url https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/

1
2  3
4  5  6
7  8  9  10
11  12  13  14  15
16  17  18  19  20  21
 
*/
public class Pattern13 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = in.nextInt();

        createPattern13(n);
        
        in.close();
    }

    private static void createPattern13(int n) {
        int count = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + "  ");
            }
            System.out.println();
        }
    }
}