package com.mystudy.poly3_abstract_class;

import com.mystudy.poly2_overriding.Animal;

public class TypeTest {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		sound(cat);
		sound(dog);
		
		
		
		
		

	}
	
	static void sound(AbstractAnimal animal) {
		animal.sound();
		}

}
