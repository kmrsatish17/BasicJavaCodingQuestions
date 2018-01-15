package com.java.interview.questions;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static boolean checkPrime(int number) {

		for (int i = 2; i < number; i++) {

			if (number % i == 0) {

				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");

		int num = sc.nextInt();
		
		System.out.println("The number " + num + " is Prime? " + checkPrime(num));

	}

}
