package com.bridgelabz.sortingalgorithm;

public class InsertionSort<T> {
	public static void main(String args[]) {
		Integer arr[] = { 12, 11, 13, 5, 6, 1, 17};
		String arr1[] = { "Meghana","Naresh","Ishu","Rahul"};
		
		Integer[] a = sort(arr);
		String[] s = sort(arr1);
		

		for (Object i : a)
			System.out.print(i + " ");

		System.out.println();
		
		for (Object i : s)
			System.out.print(i + " ");

		System.out.println();

	}

	public static <T extends Comparable<T>> T[] sort(T arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			T key = arr[i + 1];
			while (i >= 0 && (arr[i].compareTo(key)>0)) {
				arr[i + 1] = arr[i];
				i = i - 1;
			}
			arr[i + 1] = key;
		}
		return arr;
	}

}
