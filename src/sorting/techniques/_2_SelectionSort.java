/**
 * 
 */
package sorting.techniques;

/**
 * @author abhishek
 *
 */
public class _2_SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = {15,-23,65,-85,34,15,2,5}, n=8;
		System.out.print("Unsorted array: ");
		for(int i : a)
			System.out.print(i+" ");
		System.out.println();
		selectionSort(a, n);
		System.out.print("Sorted array:   ");
		for(int i : a)
			System.out.print(i+" ");
	}

	private static void selectionSort(int[] a, int n) {
		
		for(int i=0; i<n; i++) {
			int largestIndex=0, j=0;
			
			for(j=0; j<n-i; j++) {
				if(a[largestIndex] < a[j]) {
					largestIndex = j;
				}
			}
			swap(a, j-1, largestIndex);
		}
		
	}
	
	private static void swap(int[] a, int source, int dest) {
		if(a[source] == a[dest]) {
			return;
		}
		
		a[source] = a[source] + a[dest];
		a[dest] = a[source] - a[dest];
		a[source] = a[source] - a[dest];
	}

}
