package basics.striver._5_ArmstrongNo;

import java.util.Scanner;

public class ArmstrongNo {

    public static void main(String[] args) {
            
            Scanner in = new Scanner(System.in);
    
            System.out.println("Enter n: ");
            int n = in.nextInt();
    
            boolean resultBool = isArmstrongNo(n);
            
            System.out.println("isArmstrongNo:"+resultBool);
    
            in.close();
    }

    public static boolean isArmstrongNo(int n) {

        int ams = 0;
        int temp = n;

        while (n != 0) {
            int n1 = n%10;
            int n2 = n1*n1*n1;
            ams += n2;
            n /= 10;
        }
        return ams == temp;
    }

}
