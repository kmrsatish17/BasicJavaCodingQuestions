package com.java.interview.questions;

import java.util.Scanner;

public class ReverseStringToCheckPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String originalString = sc.nextLine();
		System.out.println("Original String : " + originalString);
		
		checkPalindrome(originalString);
		
	}

	private static void checkPalindrome(String originalString) {
		String reverseString = "";
		
		for (int i = originalString.length() - 1 ; i >=0 ; i--){
			
			reverseString = reverseString + originalString.charAt(i);
			
		}
		
		System.out.println("Reverse String : " + reverseString);
		
		if (reverseString.equals(originalString)){
			
			System.out.println("The original string is Palindrome");
		}else {
			
			System.out.println("Not a palindrome");
		}
	}

}
