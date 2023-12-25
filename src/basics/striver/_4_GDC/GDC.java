package basics.striver._4_GDC;

import java.util.Scanner;

public class GDC {
    public static void main(String[] args) {
            
            Scanner in = new Scanner(System.in);
    
            System.out.println("Enter a, then b: ");
            int a = in.nextInt();
            int b = in.nextInt();

            int gdcNo = gdc(a,b);
            
            System.out.println("GDC: "+gdcNo);
    
            in.close();
    }

    // This is Brute force; optimised solution exists in recursion
    // GDC has to range from 1 to a-b (or the smaller number itself)
    public static int gdc(int a, int b) {
        
        int gdcNo = 1;
        int max = ((a-b) < 0) ? b-a : a-b;

        if (max == 0)
            return a;

        for (int i = 2; i <= max; i++) {
            if(a%i==0 && b%i==0)
                gdcNo = i;
        }
        return gdcNo;
    }
}
