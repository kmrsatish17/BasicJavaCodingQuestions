package com.java.interview.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CountOfWordInSentence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sentence : ");
		String inputSentence = sc.nextLine();
		
		Map<String, Integer> wordRecoder = getWordCount(inputSentence);

		for (String key : wordRecoder.keySet()){
			
			System.out.println( key + " Has count : " + wordRecoder.get(key));
		}
		
		
	}

	private static Map<String, Integer> getWordCount(String inputSentence) {
		Map <String, Integer> wordRecoder = new HashMap<>();
		
		StringTokenizer st = new StringTokenizer(inputSentence);
		
		while (st.hasMoreTokens()){
			
			String token = st.nextToken();
			
			if (wordRecoder.containsKey(token)){
				
				wordRecoder.put(token, wordRecoder.get(token) + 1);
				
			}else{
				
				wordRecoder.put(token, 1);
				
			}
		}
		return wordRecoder;
	}

}
