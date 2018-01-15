package com.java.interview.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ManagerEmployeeDisplay {
	
	/*
	 * 
	 * Print Manager and employee relationship 
	 * 
	 * 
*/
	public static void main(String[] args) {
		
		
		Map<String, String > empRecord = new HashMap<>();
		
		empRecord.put("CEO", null);
		empRecord.put("DU Head", "CEO");
		empRecord.put("Project Manager", "DU Head");
		empRecord.put("Team Lead", "Project Manager");
		empRecord.put("SSE", "Team Lead");
		empRecord.put("SE", "SSE");
		empRecord.put("ASE" , "SE");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of employee");
		String emp = sc.nextLine();
		System.out.println(emp);
		
		displayManagerEmployee(empRecord, emp);
		
		
	}

	private static void displayManagerEmployee(Map<String, String> empRecord, String emp) {
		String value = empRecord.get(emp);
		
		System.out.println("Manager of " + emp + " is : " + value);
		
		while (value != null){
			
			System.out.print("Manager of " + value + " is : ");
			value = empRecord.get(value);
			System.out.print(value);
			System.out.println("");
			
		}
	}

}
