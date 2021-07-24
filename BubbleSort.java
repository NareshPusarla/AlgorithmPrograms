package com.bridgelabz.sortingalgorithm;

public class BubbleSort <T extends Comparable<T>>{
	
	public static <T extends Comparable> T[] sortingInt(T arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if( arr[i].compareTo(arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return (T[]) arr;
	} 
	
	public static void main(String[] args) {
		String [] arr = {"naresh","meghana","rahul","ishu"};
		Integer[] arr1 = {5,10,8,6,1,2};
		
		String[] s = sortingInt(arr);
		Integer[] in = sortingInt(arr1);
		
		for (Object i : s) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for (Object i : in) {
			System.out.println(i);
		}
	}

}
