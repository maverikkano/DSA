package arrays.gfg.level1;

public class Problem_4_sorting_array {

	public static void main(String[] args) {

		int a[] = { 1, 3, 55, 32, 69, 5 }, n = 6;

		sort(a, n);

		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");

	}

	private static void sort(int[] arr, int n) {
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
	}
}