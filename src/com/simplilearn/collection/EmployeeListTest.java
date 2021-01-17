package com.simplilearn.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeListTest {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1001, "John Smith", 987654, "Engineering");
		Employee emp2 = new Employee(1002, "Marry Smith", 987654, "Engineering");
		Employee emp3 = new Employee(1003, "Ram Singh", 987654, "Engineering");
		Employee emp4 = new Employee(1004, "David Killer", 987654, "Engineering");
		Employee emp5 = new Employee(1005, "Anjali Singh", 987654, "Engineering");
		
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		employees.add(emp1);
		
		for(Employee emp : employees) {
			System.out.println("The Employee :: "+emp.id +" is ::"+emp.name);
		}
		
	}

}
