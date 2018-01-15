package com.java.interview.questions;

import java.util.Scanner;

public class FindFactorialNumber {
	
	public static int getFactorial(int number){
		
		if (number == 0){
			
			return 1;
		}
		
		
		return number*getFactorial(number - 1);
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
		int number = sc.nextInt();
		int factorial = 1;
		
		getFactorialWithFor(number, factorial);
		
		System.out.println("Factorial using recursion : " + getFactorial(number)); 
		
		
		
	}


	private static void getFactorialWithFor(int number, int factorial) {
		
		
		/*for (int i = number ; i > 1 ; i --){
			
			factorial = factorial*i;
		}*/
		
		while (number != 0){
			
			factorial = factorial* number;
			number = number - 1;
		}
		
		System.out.println("Factorial using while loop is :" + factorial);
	}

}
