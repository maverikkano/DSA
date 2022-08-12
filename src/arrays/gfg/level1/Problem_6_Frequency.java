package arrays.gfg.level1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author abhishek @ url
 *         https://practice.geeksforgeeks.org/problems/find-the-frequency/1
 */
public class Problem_6_Frequency {

	public static void main(String[] args) {
		int arr[] = { 7, 10, 6, 6, 20, 15 }, x = 6;

		int freq = findFrequency(arr, x);

		System.out.printf("%d is present %d times", x, freq);

	}

	private static int findFrequency(int[] arr, int x) {

		Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (freqMap.containsKey(arr[i])) {
				freqMap.put(arr[i], freqMap.get(arr[i]) + 1);
			} else {
				freqMap.put(arr[i], 1);
			}
		}

		return freqMap.get(x);
	}
}
