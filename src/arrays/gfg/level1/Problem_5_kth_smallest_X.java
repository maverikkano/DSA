package arrays.gfg.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author abhishek @ url
 * https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1 @
 * issue Time limit exceeded by both approaches (sorting with collection/array &
 * adding elements in Treeset)
 */
public class Problem_5_kth_smallest_X {

	public static void main(String[] args) {
		int arr[] = { 7, 10, 4, 3, 20, 15 }, l = 6, k = 3;

		// Approach 1
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i : arr) {
			a.add(i);
		}
		Collections.sort(a);
		int x = a.get(l - k);
		System.err.println(x);

		// -------------------------------------------------------------------
		// Approach 2
		
		k--;

		Set<Integer> s = new TreeSet<Integer>();

		for (int i = 0; i < l; i++)
			s.add(arr[i]);

		System.out.println(s);

		Iterator<Integer> itr = s.iterator();

		while (k > 0) {
			itr.next();
			k--;
		}
		System.out.println(s);
	}
}
