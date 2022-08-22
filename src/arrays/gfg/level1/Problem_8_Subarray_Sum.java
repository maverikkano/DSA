package arrays.gfg.level1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author abhishek 
 * @url https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
 */
public class Problem_8_Subarray_Sum {

	public static void main(String[] args) {
//		int arr[] = {1,2,3,4,5,6,7,8,9,10}, s=15, n=10;
		int arr[] = {1, 2, 3, 7, 5}, s=12, n=5;

		subarraySum(arr, n, s);

		System.out.printf("");
	}

	private static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
		
		int sum=arr[0], start=0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<n; i++) {
			sum += arr[i];
			
			if(sum > s) {
				sum -= arr[start];
				start++;
			}
				
			if(sum == 0) {
				list.add(start-1);
				list.add(i-1);
			}
		}
		
		return list;
	}
}
