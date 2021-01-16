package com.simplilearn.test;

public class Test {

	public static void main(String[] args) {
		
		Person  p1 = new Person();
		p1.id = 100;
		p1.name= "John Smith";
		p1.age = 30;
		
		Person p2 = new Person("Mike Smith");
		
		Person p3 = new Person(200,"David Smith");
		
		Person p4 = new Person(04,"Marry Smith",60);
		
		System.out.println("Data :: id -> "+ p4.id 
				+" name -> "+p4.name +"  age-> "+p4.age);
	}

}
