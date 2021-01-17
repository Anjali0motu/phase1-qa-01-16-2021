package com.simplilearn.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		
		List<String> namelist =  new LinkedList<String>();
		
		namelist.add("Bob");
		namelist.add("John");		
		namelist.add("Mike");
		namelist.add("Bill");
		namelist.add("David");
		namelist.add("John");
		
		System.out.println(namelist.get(2));
		
		System.out.println(namelist);
		
		// old way to iterate collection 
		Iterator<String> itr = namelist.iterator();		
		while(itr.hasNext()) {
			System.out.println("Name :: "+itr.next());
		}
		System.out.println("--------------------");
		// Enhance for loop or foreach
		for(String name : namelist) {
			System.out.println("Name :: "+name);
		}
		

	}

}
