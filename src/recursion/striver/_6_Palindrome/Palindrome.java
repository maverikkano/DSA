package recursion.striver._6_Palindrome;

import java.util.Scanner;

/*
* 1. Every step same -> Recursive possible
* 2. Recurrence Relation : f(min+n) == f(max-n)
* 3. Tree & Stack drawn: PFA
* 4. Base condition: if(start >= end)   return true;
* 
* Time complexity: O(n)
* Space complexity: O(1)
*/
public class Palindrome {
    public static void main(String[] args) {
            
        Scanner in = new Scanner(System.in);

        System.out.println("Enter string to check if it is palindrome: ");
        String str = in.nextLine();

        boolean resultBool = isPalindrome(str, 0, str.length()-1);
        
        System.out.println("isPalindrome: "+resultBool);

        in.close();
    }

    public static boolean isPalindrome(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if(str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindrome(str, start+1, end-1);
    }
}
