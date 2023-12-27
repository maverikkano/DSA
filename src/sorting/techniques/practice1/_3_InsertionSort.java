/**
 * 
 */
package sorting.techniques.practice1;

/**
 * @author abhishek
 *
 */
public class _3_InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = { 15, -23, 65, -85, 34, 15, 2, 5 }, n = 8;
		System.out.print("Unsorted array: ");
		for (int i : a)
			System.out.print(i + " ");
		System.out.println();
		insertionSort(a, n);
		System.out.print("Sorted array:   ");
		for (int i : a)
			System.out.print(i + " ");
	}

	private static void insertionSort(int[] a, int n) {
		
		for (int i = 1; i < n; i++) {
			int c = i;
			
			for (int j = 0; j < i; j++) {
				if(a[c] < a[j]) {
					int popped = shift(a, j, c);
					a[j] = popped;
				}
			}
		}
	}

	private static int shift(int[] a, int start, int end) {
		/*
		 * a[end] is popped 
		 * a[start] is vacated (random value)
		 */
		int popped = a[end];
		for (int i = end; i >= start; i--) {
			if(i == 0)	continue;
			
			a[i] = a[i - 1];
		}
		return popped;
	}
}
