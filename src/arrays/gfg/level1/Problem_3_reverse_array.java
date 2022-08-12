package arrays.gfg.level1;

import java.util.Scanner;

public class Problem_3_reverse_array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int test = 0; test < t; test++) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			reverse(arr, n);
			printArray(arr);
		}
		sc.close();
	}

	private static void printArray(int[] arr) {

		for (int i : arr) {
			System.out.print(i);
			System.out.print(" ");
		}
	}

	private static void reverse(int[] arr, int n) {

		for (int i = 0; i < (n + 1) / 2; i++) {
			swap(arr, i, n - i);
		}
	}

	private static void swap(int[] a, int i, int j) {
		a[i] = a[i] + a[j];
		a[j] = a[i] - a[j];
		a[i] = a[i] - a[j];
	}

}
