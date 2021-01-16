package com.simplilearn.inheritance.multilevel;

public class Main {
	
	public static void main(String[] args) {
		Bike bike = new Bike();
		
		bike.service();
		System.out.println("Wheels ::"+bike.getWheels());
		System.out.println("Speed :: "+bike.run());
	}
}
