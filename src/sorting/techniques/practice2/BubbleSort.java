package sorting.techniques.practice2;

import java.util.Scanner;

/*
 * 
 * @Abhishek
 * 
 * Time complexity: O(n^2), Theta(n^2), Omega(n)
 * Space complexity: O(1)
 * 
 */
public class BubbleSort {
    public static void main(String[] args) {
            
        Scanner in = new Scanner(System.in);

        System.out.println("Enter no of elements: ");
        int size = in.nextInt();

        System.out.println("Enter an integer array of size "+size);
        int arr[] = new int[10];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        bubbleSort(arr, size);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }

        in.close();
    }

    private static void bubbleSort(int[] arr, int size) {
        
        for (int i = 0; i < size; i++) {
            boolean swapFlag = false;
            for (int j = 0; j < size-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    swapFlag = true;
                    swapArrayIndices(arr, j, j+1);
                }
            }
            if (!swapFlag) {
                break;
            }
        }
    
    }

    private static void swapArrayIndices(int[] arr, int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
