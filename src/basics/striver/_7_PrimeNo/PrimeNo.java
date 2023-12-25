package basics.striver._7_PrimeNo;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
            
        Scanner in = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = in.nextInt();

        boolean primeFlag = isPrime(n);
        
        System.out.println("primeFlag: "+primeFlag);

        in.close();
    }

    public static boolean isPrime(int n) {
        
        if(n < 2)   return false;

        int root = (int) Math.sqrt(n);

        for (int i = 2; i <= root; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        
        return true;
    }


}