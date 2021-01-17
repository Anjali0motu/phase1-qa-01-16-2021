package com.simplilearn.inheritance.multiple;

public class Main {

	public static void main(String[] args) {
		
		Beast kitti = new Beast();
//		kitti.meow();
		kitti.eat();
//		kitti.bark(); Error
		
		Tiger tom = new Tiger();
		tom.bark();
		tom.eat();

	}

}
