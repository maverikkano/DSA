package arrays.gfg.level1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author abhishek @ url https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
 * @approach Make 4 partitions in the array, 0-sorted, 1-sorted, 2-sorted & unsorted. 
 * 			 Shrink unsorted part with each iteration. Take mid as cursor.
 * 			 If 0 encountered: replace low with cursor(mid), and increment both low & mid.
 * 			 If 1 encountered: increment both mid.
 * 			 If 2 encountered: replace high with cursor(mid), and decrement high.
 */
public class Problem_7_Sort_1_2_3_Array {

	public static void main(String[] args) {
		int arr[] = { 0, 2, 1, 2, 0, 0, 2, 0, 1, 0, 2 }, n=11;

		sort012(arr, n);

		System.out.printf("Sorted array is: ");
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");

	}

	private static void sort012(int[] arr, int n) {

		int low=0, high=n-1, mid=0;
		while(mid <= high) {
			switch(arr[mid]) {
				case 0:
					swap(arr,mid,low);
					mid++;
					low++;
					break;
					
				case 1:
					mid++;
					break;
					
				case 2:
					swap(arr,mid,high);
					high--;
					break;
			}
		}
	}

	private static void swap(int[] arr, int i, int a0) {
		if(arr[i] == arr[a0])	return;
		
		int temp = arr[i];
		arr[i] = arr[a0];
		arr[a0] = temp;
	}
}
