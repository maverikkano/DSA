package basics.striver._1_NoOfDigits;

import java.util.Scanner;

public class NoOfDigits {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = in.nextInt();

        int count = getNoOfDigits(n);
        
        System.out.println("Count:"+count);

        in.close();
    }

    public static int getNoOfDigits(int n) {

        int count = 1;

        n = Math.abs(n);

        while (n / 10 >= 1) {
            count++;
            n /= 10;
        }
        return count;
    }
    
}
