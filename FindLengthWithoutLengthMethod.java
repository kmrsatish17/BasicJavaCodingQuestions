package com.java.interview.questions;

import java.util.Scanner;

public class FindLengthWithoutLengthMethod {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		
		String input = sc.nextLine();
		int count = getLengthString(input);
		
		System.out.println("String Length " + count);
		
	}

	private static int getLengthString(String input) {
		int count = 0;
		
		char[] inputStringArray = input.toCharArray();
		
		for (char chr : inputStringArray){
			
			count++;
		}
		return count;
	}

}
