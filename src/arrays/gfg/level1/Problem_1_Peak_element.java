/**
 * 
 */
package arrays.gfg.level1;


/**
 * @author abhishek
 * @url https://practice.geeksforgeeks.org/problems/peak-element/1
 * @date 23 July 2022
 */

class Problem_1_Peak_element {
	public static void main(String[] args) {

		int tmp[] = {3,4}, n = 2;
		int result = (new Solution()).peakElement(tmp,n);
		System.out.println("result: "+result);
		
		
	}
}

class Solution {
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr, int n) {

		if(n == 1) return 0;
		if(arr[0] > arr[1])		return 0; 
		
		for(int i=1; i<n-1; i++) {
			
			if(arr[i] > arr[i-1] && arr[i] > arr[i+1])
				return i;
		}
		
		return n-1;
	}
}