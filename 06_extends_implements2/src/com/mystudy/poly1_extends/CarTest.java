package com.mystudy.poly1_extends;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("==== Car 클래스 ====");
		Car car = new Car();
		car.type = "일반자동차";
		System.out.println("타입: " + car.type);
		car.drive();
		car.stop();
		
		System.out.println("==== Ambulance 클래스 ====");
		Ambulance am = new Ambulance();
		am.type ="구급차";
		System.out.println("타입 : " + am.type);
		am.drive();
		am.stop();
		am.siren();
		
		System.out.println("==== FireEngine 클래스 ====");
		FireEngine fe = new FireEngine();
		fe.type = "소방차";
		System.out.println("타입 : " + fe.type);
		fe.drive();
		fe.stop();
		fe.siren();
		fe.water();
		
		System.out.println("~~~~ 형변환 후 ~~~~");
		//	Car <- Ambulance 
		Car carTemp = new Car();
		carTemp.drive();
		carTemp.stop();
		
		// Car <- Ambulance
		// 자동형변환(Super <- sub) : Car <==== Ambulance
		System.out.println("Car <- Ambulance 설정 후 " );
		carTemp = am;
		System.out.println("Car 타입 : " + carTemp.type);
		carTemp.drive();
		carTemp.stop();
		
		//Car 타입이기 떄문에 구급차의 사이렌 기능을 사용 못함
		//구급차의 사이렌 기능을 사용하려면 구급차가 되어야함
		((Ambulance)carTemp).siren(); // 자녀타입->부모타입 : 명시적 형변환 처리
		
		//[예외발생] java.lang.ClassCastException
		//((fireEngine)carTemp).water(); // 앰뷸런스 -> 소방차 변경 못함
		
		//=================
		System.out.println("------- 타입확인(instanceof) -------");
		carTemp = new Car();
		carTemp = am;
		carTemp = fe;
		
		System.out.println("--- Object 타입인 경우 ---");
		
		if(carTemp instanceof Object) {
			System.out.println("Object 타입입니다.");
		}
		
		System.out.println("--- Car 타입인 경우 ---");
		
		if(carTemp instanceof Car) {
			System.out.println("Car 타입입니다.");
		}
		
		System.out.println("--- Ambulance 타입인 경우 ---");
		
		if(carTemp instanceof Ambulance) {
			System.out.println(" Ambulance 타입입니다.");
			
		}
		System.out.println("--- FireEngin 타입인 경우 ---");
		if(carTemp instanceof FireEngine) {
			System.out.println("  FireEngine 타입입니다.");
			
		}
		System.out.println("=================");
		System.out.println("---- Car 타입 전달 ----");
		typeCheck(car);
		System.out.println("---- am 타입 전달 ----");
		typeCheck(am);
		
		System.out.println("---- am 타입 전달 ----");
		typeCheck(fe);
		
		typeCheck(carTemp);

	}
	/*
	static void typeCheck(Object obj) {
		System.out.println("===> Object 타입입니다.");
		((Car)obj).drive();
		((Car)obj).stop();
		
		if(obj instanceof Ambulance) {
			System.out.println(" Ambulance 타입입니다");
			((Ambulance)obj).siren();
		}
		
		if(Car instanceof FireEngine) {
			System.out.println("FireEngine 타입입니다.");
			((FireEngine)obj).siren();
			((FireEngine)obj).water();
			
		}
	}
	*/
	
	
	
	
	
	
	
	static void typeCheck(Car car) {
		System.out.println("car 타입입니다1234.");
		car.drive();
		car.stop();
		
		if(car instanceof Ambulance) {
			System.out.println(" Ambulance 타입입니다");
			((Ambulance)car).siren();
		}
		
		if(car instanceof FireEngine) {
			System.out.println("FireEngine 타입입니다.");
			((FireEngine)car).siren();
			((FireEngine)car).water();
			
		}
	}
	
	static void methodCheck(Car car) {
		System.out.println("::: Car 타입입니다.");
		System.out.println("타입 : "+ car.type);
		car.drive();
		car.stop();
	}
	
	static void methodCheck(Ambulance am) {
		System.out.println("::: Car 타입입니다.");
		System.out.println("타입 : "+ am.type);
		am.drive();
		am.stop();
		am.siren();
	}
	
	static void methodCheck(FireEngine fe) {
		System.out.println("::: Car 타입입니다.");
		System.out.println("타입 : "+ fe.type);
		fe.drive();
		fe.stop();
		fe.siren();
		fe.water();
	}

}
