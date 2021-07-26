package com.mystudy.poly5_Interface2;

public class TypeTest {

	public static void main(String[] args) {
		//Cat, AbstractAnimal 메소드 사용 가능
		System.out.println("<Cat>-----------------");
		Cat cat1 = new Cat();
		cat1.eat();
		System.out.println("<Dog>-----------------");
		Dog dog1 = new Dog();
		dog1.eat();
		cat1.test();
		System.out.println("<Pig>-----------------");
		Pig pig1 = new Pig();
		pig1.eat();
		
		System.out.println("---- AbstractAnimal 타입으로 사용 -----");
		
		AbstractAnimal dog2 = new Dog();
		dog2.eat();
		AbstractAnimal pig2 = new Cat();
		pig2.eat();
		
		
		
		System.out.println("--- Animal 인터페이스 타입으로 사용 ---");
		//Animal 인터페이스 타입이 되면
		//Animal 인터페이스에 정의된 메소드만 사용 가능 
		//자녀타입이 오버라이딩 되있으면 호출이 됨
		Animal cat = new Cat();
		Animal dog = new Dog();
		Animal pig = new Pig();
		
		Animal[] group = {new Cat(),new Dog(),new Pig()};;
		
		group[0] = new Dog();
		
		Pig pi2 = new Pig();
		pig.eat();
		cat.eat();
		cat.sleep();
		cat.sound();
		System.out.println("---------23-----");
		group[0].sound();
		System.out.println("--------------");
		// 인터페이스 타입이 되는 순간 해당 인터페이스 해당하는 메서드만 쓸 수 있다.
		sound(cat);
		sound(dog);
		sound(cat1);
		System.out.println("---------123----");
		
		
		System.out.println("--------------");
	}
	
	static void sound(Animal animal) {
		animal.sound();
	}


}
