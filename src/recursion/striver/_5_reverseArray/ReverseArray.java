package recursion.striver._5_reverseArray;

import java.util.Scanner;

/*
* 1. Every step same -> Recursive possible
* 2. Recurrence Relation : f(n) = swap(start,end) + f(start-1,end-1);
* 3. Tree & Stack drawn: PFA
* 4. Base condition: if(start >= end) return arr
* 
* Time complexity: O(n)
* Space complexity: O(1)
*/

public class ReverseArray {

    public static void main(String[] args) {
                
            Scanner in = new Scanner(System.in);
    
            System.out.println("Enter no. of elements to be input in array: ");
            int size = in.nextInt();

            System.out.println("Enter the array");
            int[] arr = new int[10];
            for (int i = 0; i < size; i++) {
                arr[i] = in.nextInt();
            }
            int[] reversedArr = reverseArray(arr, 0, size-1);
            
            System.out.println("Reversed Array is:");
            for (int i = 0; i < size; i++) {
                System.out.print(reversedArr[i]+" ");
            }
            
            in.close();
        }

    public static int[] reverseArray(int arr[], int start, int end) {

        if (start >= end) {
            return arr;
        }

        arr = swapIndices(arr, start, end-1);

        return reverseArray(arr, start+1, end-2);
        
    }

    private static int[] swapIndices(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

        return arr;
    }

}
