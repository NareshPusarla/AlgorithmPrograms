package test;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first word to check");
		String s1 = sc.next();
		System.out.println("Enter the second word to check");
		String s2 = sc.next();

		boolean status;
		if (s1.length() != s2.length()) {
			status = false;
		} else {
			char[] charArray1 = s1.toLowerCase().toCharArray();
			char[] charArray2 = s2.toLowerCase().toCharArray();
			
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			status = Arrays.equals(charArray1, charArray2);
		}
		
		if(status) {
			System.out.println(s1+" and "+s2+" are anagram.");
		}else {
			System.out.println(s1+" and "+s2+" are not anagram.");
		}
	}

}
