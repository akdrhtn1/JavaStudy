package com.mystudy.poly2_overriding;

public class TypeTest {

	public static void main(String[] args) {
		Animal an = new Animal();
		Dog dog = new Dog();
		pig pig = new pig();
		Cat cat = new Cat();
		
		
		
		pig.sound();
		dog.sound();
		cat.sound();
		
		System.out.println("---sound() 호출-----");
		sound(dog);
		sound(pig);
	}
	//메소드 오버라이딩 활용
	static void sound(Animal animal) {
		animal.sound();
		}
	}
	
//	static void sound(Dog dog) {
//		dog.sound();
//	}
//	
//	
//	static void sound(pig pig) {
//		pig.sound();
//	}
//	

