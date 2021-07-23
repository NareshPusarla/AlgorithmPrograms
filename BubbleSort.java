package com.bridgelabz.sortingalgorithm;

public class BubbleSort {
	public static String[] sortingInt(String arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	} 
	
	public static void main(String[] args) {
		String [] arr = {"naresh","meghana","rahul","ishu"};
		String[] s = sortingInt(arr);
		for (String i : s) {
			System.out.println(i);
		}
	}

}
