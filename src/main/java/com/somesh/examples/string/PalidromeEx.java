package com.somesh.examples.string;

public class PalidromeEx {

	public static void main(String args[]) {
		String input = "bobm";
		boolean result = checkPalindrom(input);
		System.out.println(result);
		System.out.println(checkPalindromBuilder(input));
	}

	public static boolean checkPalindrom(String input) {
		int length = input.length();
		for (int i = 0, j = length - 1; i < length; i++, j--) {
			if (input.charAt(i) != input.charAt(j)) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkPalindromBuilder(String input) {
		return (input.equals(new StringBuilder(input).reverse().toString()));
	}
}