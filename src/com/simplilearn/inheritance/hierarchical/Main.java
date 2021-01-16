package com.simplilearn.inheritance.hierarchical;

public class Main {

	public static void main(String[] args) {
		
		Cat kitti = new Cat();
		kitti.meow();
		kitti.eat();
//		kitti.bark(); Error
		
		Dog tom = new Dog();
		tom.bark();
		tom.eat();

	}

}
