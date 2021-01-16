package com.simplilearn.loop;

public class TemperatureRiseCounter {

	public static void main(String[] args) {
		
		// Use case :-> WAP for increase temperature by 20 till reaches 100.
		float temperature = 0.0f;
		 while(temperature<=100.0f) {
			 System.out.println("Temperature value ::"+temperature);
			 temperature = temperature + 20;
		 }
		 
		 while (temperature>= 0.0f) {
			 System.out.println("Temperature value ::"+temperature);
			 temperature -= 20;			
		}

	}

}
