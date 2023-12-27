/**
 * 
 */
package sorting.techniques.practice1;

/**
 * @author abhishek
 *
 * Time complexity: O(n^2)
 * Space complexity: O(1)
 */
public class _1_BubbleSort {

	public static void main(String[] args) {
		int a[] = {15,-23,65,-85,34,15,2,5}, n=8;
		System.out.print("Unsorted array: ");
		for(int i : a)
			System.out.print(i+" ");
		System.out.println();
		bubbleSort(a, n);
		System.out.print("Sorted array:   ");
		for(int i : a)
			System.out.print(i+" ");
	}

	private static void bubbleSort(int[] a, int n) {
		
		for(int i=0; i<n-1; i++) {
			boolean swapFlag = false;
			for(int j=0; j<n-i-1; j++) {
				if(a[j] > a[j+1]) {
					swap(a,j,j+1);
					swapFlag = true;
				}
			}
			
			if(!swapFlag) {
				break;
			}
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