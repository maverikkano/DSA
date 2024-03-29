// https://leetcode.com/problems/reverse-integer/

package basics.striver._2_ReverseInteger;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
            
            Scanner in = new Scanner(System.in);
    
            System.out.println("Enter n: ");
            int n = in.nextInt();
    
            int count = reverse(n);
            // int count = reverse(Integer.MAX_VALUE + 1000);
            
            System.out.println("Count:"+count);
    
            in.close();
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
