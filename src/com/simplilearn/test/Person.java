package com.simplilearn.test;

public class Person {

	public int id;
	public String name;
	public int age;
	
	Person() {};
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(int id , String name) {
		this.name = name;
		this.id = id;
	}
	
	public Person(int id , String name,int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public Person(int id) {
		this.id = id;
	}
	
	
}
