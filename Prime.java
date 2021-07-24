package test;

import java.util.Arrays;
import java.util.Scanner;

public class Prime {
	static int a, b;
	public static void main(String[] args) {
		prime();
		anagram(3624,5643);
	}

	public static void prime() {
		Scanner sc = new Scanner(System.in);
		int flag;

		System.out.printf("Enter lower bound of the interval: ");
		a = sc.nextInt();

		System.out.printf("\nEnter upper bound of the interval: ");
		b = sc.nextInt();

		System.out.printf("\nPrime numbers between %d and %d are: ", a, b);

		for (int i = a; i <= b; i++) {
			if (i == 1 || i == 0)
				continue;
			flag = 1;
			for (int j = 2; j <= i / 2; ++j) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}
			if (flag == 1) {
				System.out.println(i+" is a prime number.");
				palindrome(i);
				System.out.println("");
				
				
			}
		}
	}

	public static void palindrome(int a) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the number to check palindrome");
//		a = s.nextInt();
		int r, temp=a, rev = 0;
		while(a>0) {
			r = a%10;
			rev = (rev*10)+r;
			a = a/10;
		}
		if(temp == rev) {
			System.out.println(temp+" is a Palindrome");
		}
		else {
			System.out.println(temp+" is not a palindrome");
		}
	}
	
	public static void anagram(int a, int b) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the first word to check");
//		a = sc.nextInt();
		String s1 = String.valueOf(a);
//		System.out.println("Enter the second word to check");
//		b = sc.nextInt();
		String s2 = String.valueOf(b);

		boolean status;
		if (s1.length() != s2.length()) {
			status = false;
		} else {
			char[] charArray1 = s1.toCharArray();
			char[] charArray2 = s2.toCharArray();
			
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
