/**
 * 
 */
package arrays.gfg.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * @author abhishek
 *
 */
public class Problem_2_max_min {

	/**
	 * @param args
	 * @url	https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1
	 */
	public static void main(String[] args) {
		
		int arr[] = {1,2,3}, n = 3;
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		for(int i : arr) {
			array.add(i);
		}
		
		int max = Collections.min(array);
		int min = Collections.max(array);
		
		System.out.println(max);
		System.out.println(min);
		
	}
		
}