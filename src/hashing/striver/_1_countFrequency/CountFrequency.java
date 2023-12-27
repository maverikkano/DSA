package hashing.striver._1_countFrequency;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequency {
    public static void main(String[] args) {
                
        Scanner in = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = in.nextInt();
        
        System.out.println("Enter array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        printFrequencyOfEach(arr,n);

        in.close();
    }

    private static void printFrequencyOfEach(int[] arr, int n) {

        Map<Integer,Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            Integer value = map.get(arr[i]);
            if(value != null)
                map.put(arr[i], value+1);
            else
                map.put(arr[i], 1);
        }
        
        System.out.println("Frequencies: ");
        map.forEach((key,value) -> {
            System.out.println("Element: "+key+" Frequency: "+value);
        });
    }
}
