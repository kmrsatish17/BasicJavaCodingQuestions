package com.java.interview.questions;

public class BubbleSorting {

	/*
	 * Do Bubble sorting on a integer array
	 */
	public static void main(String[] args) {

		int[] numbers = { 3, 5, 7, 7, 4, 6 };

		System.out.println("Before Sorting : ");

		for (int num : numbers) {

			System.out.print(num);

		}

		doBubbleSorting(numbers);
		System.out.println("");
		System.out.println("After Sorting : ");

		for (int num : numbers) {

			System.out.print(num);

		}

	}

	private static void doBubbleSorting(int[] numbers) {
		int n = numbers.length;

		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - i - 1; j++) {

				if (numbers[j] > numbers[j + 1]) {

					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;

				}
			}
		}
	}

}
