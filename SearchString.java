package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SearchString {
	static String arr[];

	public static void main(String[] args) {
		String data = "";
		try {
			File file = new File("C:/Users/Naresh/Documents/file.txt");
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				data += reader.nextLine();
				arr = data.split(" ");
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		for (String a : arr) {
			System.out.println(a);
		}

		System.out.println("Enter a word to search in file: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next(); 
		search(arr, input);
	}
	public static void search(String arr[], String input) {
		for(int i=0; i<arr.length;i++) {
			if(arr[i].equals(input)) {
				System.out.println("element is found");
//				break;
			}
//			if(arr[i] != input) {
//				System.out.println("element is not found.");
//			}
		}
	}
}
