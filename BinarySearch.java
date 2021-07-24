package com.bridgelabz.searchalgo;

import java.util.Scanner;

public class BinarySearch <T extends Comparable<T>>{

	public static void main(String[] args) {
		String[] arr = { "naresh", "meghana", "uma", "rahul", "ishu" };
		String[] s = sortingInt(arr);
		
		Integer[] arr1 = {5,2,8,3,1};
		Integer[] in = sortingInt(arr1); 
		
		for (Object i : s) {
			System.out.print(i + ", ");
		}
		System.out.println();

		for (Object i : in) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		search(arr);
		search(arr1);
	}

	public static <T extends Comparable<T>> T[] sortingInt(T[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}

	public static <T extends Comparable<T>> void search(T[] arr) {
		T word;
		int start, end;
		int mid;

		start = 0;
		end = arr.length - 1;
		mid = (start + end) / 2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word to search: ");
		word = (T)sc.next();

		while (start <= end) {
			if (arr[mid].equals(word)) {
				System.out.println("Element found at " + mid + " index");
				break;
			} else if (arr[mid].compareTo((T) word) < 0) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			mid = (start + end) / 2;
		}

	}
}
