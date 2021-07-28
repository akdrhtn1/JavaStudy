package com.mystudy.generic1;

class Box{
	Object obj; //필드(멤버) 변수의 타입
	void setObj(Object obj) {
		this.obj = obj;
	}
	Object getObj() {
		return obj;
	}
}

//제네릭 적용된 박스
class BoxG<T>{ //List<String>
	T obj;
	void setObj(T obj) {
		this.obj = obj;
	}
	T getObj() {
		return obj;
	}
}
public class GenericExam {

	public static void main(String[] args) {
		Box box = new Box();
		
		box.setObj("문자열 String");
		box.setObj(100);
		box.setObj(new Box());
		box.setObj(new Integer(1000));
		System.out.println(box.getObj());
		
		System.out.println("======= 제너릭(제네릭) 사용 =======");
		
		String str = "Hello Java"; //String
		String str2 = "10000"; //String
		int str3 = 3333; // int
		
		//BoxG<String> boxg = new BoxG<String>();
		BoxG<String> boxg = new BoxG<>();
		boxg.setObj("문자열 String");
		boxg.setObj(str);
		boxg.setObj(str2);
		//boxg.setObj(str3); // 타입이 맞지 않으면 컴파일 오류 발생
		
		System.out.println(boxg.getObj());
	}
}
