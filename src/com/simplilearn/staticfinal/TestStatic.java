package com.simplilearn.staticfinal;

public class TestStatic {

	public static void main(String[] args) {
		
		// static variable or static methods are directly accessible with class name.
		Student.getMark();
		
		// non static variable or methods need object / instance to operate
		Student st = new Student();
		
		st.getAvgMarks();
		
		Junior.getMark();

	}

}
