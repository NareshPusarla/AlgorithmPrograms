package test;

public class Permutation {

	public static void main(String[] args) {
		findPermutation("", "NARESH");
	}

	public static void findPermutation(String initialString, String inputString) {
		int length = inputString.length();
		
		if(inputString.isEmpty()) {
			System.out.println(initialString+inputString);
		}
		else {
			for(int i=0; i<inputString.length(); i++) {
				findPermutation(initialString+inputString.charAt(i), inputString.substring(0,i)+inputString.substring(i+1, length));
			}
		}
	}
}
