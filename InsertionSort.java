package com.bridgelabz.sortingalgorithm;

public class InsertionSort {
	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 1, 17};
		int[] a = sort(arr);

		for (int i : a)
			System.out.print(i + " ");

		System.out.println();
	}

	public static int[] sort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int key = arr[i + 1];
			while (i >= 0 && arr[i] > key) {
				arr[i + 1] = arr[i];
				i = i - 1;
			}
			arr[i + 1] = key;
		}
		return arr;
	}

}
