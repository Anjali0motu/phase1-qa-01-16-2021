package com.simplilearn.loop;

public class TestWhileLoop {
	
	public static void main(String[] args) {
		// simple counter example
		int count = 100;
		while(count<10) {
			// while with true -> always running loop -> infinity loop
			System.out.println("The Count value :: "+count);
			
			//terminator
			count ++;
		}
	}
}
