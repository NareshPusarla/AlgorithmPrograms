package com.bridgelabz.searchalgo;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		String[] arr = { "naresh", "meghana", "uma", "rahul", "ishu" };
		String[] s = sortingInt(arr);
		for (String i : s) {
			System.out.print(i + ", ");
		}

		System.out.println();
		String word;
		int start, end;
		int mid;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to search: ");
		word = sc.next();

		start = 0;
		end = arr.length - 1;
		mid = (start + end) / 2;
//		System.out.println(mid);

		while (start <= end) {
			if (arr[mid].equals(word)) {
				System.out.println("Element found at " + mid + " index");
				break;
			} else if (arr[mid].compareTo(word) < 0) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			mid = (start + end) / 2;
		}
	}

	public static String[] sortingInt(String arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
