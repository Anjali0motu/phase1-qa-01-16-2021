package com.simplilearn.loop;

public class TestForLoop {

	public static void main(String[] args) {
		
//		for(initialization; termination; inc/dec)
		int count=0 ;
		for(; count < 10 ; ) {
			System.out.println("The coun value :: forward :: "+count);
			count++;
		}
		
		for(int count1=10 ; count1> 0;count1--) {
			System.out.println("The coun value :: reverse :: "+count1);
		}

	}

}
