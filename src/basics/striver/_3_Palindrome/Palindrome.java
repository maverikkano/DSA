// https://leetcode.com/problems/palindrome-number/submissions/1127524751/

package basics.striver._3_Palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
            
            Scanner in = new Scanner(System.in);
    
            System.out.println("Enter n: ");
            int n = in.nextInt();
    
            boolean resultBool = isPalindrome(n);
            
            System.out.println("resultBool:"+resultBool);
    
            in.close();
    }

    private static boolean isPalindrome(int n) {
        
        return n == reverse(n);
    }

    public static int reverse(int n) {
        
        int reversedInt = 0;
        boolean isNegative = false;

        if(n < 0) {
            isNegative = true;
            n = -n;
        }

        while (n > 0) {
            reversedInt = reversedInt*10 + n%10;
            n /= 10;
        }

        reversedInt = (isNegative) ? -reversedInt : reversedInt;

        return reversedInt;
    }
    
}
