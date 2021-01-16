package com.simplilearn.loop;

import java.util.Scanner;

public class EmployeeIteratorTest {

	public static void main(String[] args) {
		// TODO : Find employee exist within the list.
		
		String[] employees = {"John","David","Iron Man","Utkarsh","Kaviya","Archana"};

		String company = "Simplilearn Tech";
		
		Scanner input = new Scanner(System.in);
		System.out.println("-----------------------------");
		System.out.println("Welcome to Employee Verification Tool");
		System.out.println("Enter a employee name : ");
		System.out.println("-----------------------------");
		String empName = input.next();
		
		findEmployee(employees,empName);
	}
	
	public static void findEmployee(String[] employees,String empName) {
		boolean found = false;
		for (int i = 0; i < employees.length; i++) {
			if(empName.equalsIgnoreCase(employees[i])) {
				System.out.println("Employee is Found and at position :: "+i);
				found = true;
			}
		}
		if(!found) {
			System.out.println("Employee is not available ");
		}
		
	}

}
