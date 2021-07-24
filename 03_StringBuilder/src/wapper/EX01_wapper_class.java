package wapper;

public class EX01_wapper_class {
	public static void main(String[] args) {
		//	Wrapper class: 기본 데이터 타입의 기능확장한 클래스 총칭
		//	기본데이터 타입 : 전체 소문자, char, int, ....
		//	boolean, char, byte, short, int, long, float, double
		//	Wrapper class : 기본데이터 타입의 첫글자를 대문자로
		
		//	예외 : char => Character  Int => Integer
		//	Boolean, Char, Byte, Short, Int, Long ,Float, Double
		//------------------------------------
		int num = 100;
		//num = "100";
		
		Integer intNum = 100; // 자동 형변환이 되서 100이 들어감 Integer <- int
		intNum = Integer.valueOf("100");
		
		num = Integer.parseInt("100");
		intNum = 900; // Integer <- int :자동 형변환
		num = intNum; // int <- Integer :자동 형변환
		
		System.out.println("정수형 int 최대값 : " + Integer.MAX_VALUE);
		
		System.out.println("정수형 int 최소값 : " + Integer.MIN_VALUE);
		
		System.out.println("------ Boolean ------");
		
		Boolean bool = true;
		bool = new Boolean(true);
		bool = new Boolean("trUe"); // true : true, TRUE, True, tRue
		System.out.println("bool :" + bool);
		
		bool = new Boolean("true1"); // 참(true)을 의미하는 영단어가 아니면 모두 false
		System.out.println("bool :" + bool);
		
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
		
		System.out.println("--- String -> Boolean ---");
		bool = Boolean.valueOf("true");
		System.out.println(bool);
		
		bool = Boolean.valueOf("tRUe");
		System.out.println(bool);
		
		bool = Boolean.valueOf("tRUe1");
		System.out.println(bool);
		// =============
		System.out.println("---- float ----");
		Float f = 10.5f;
		f = new Float(12.5f);
		f = new Float("12.5f");
		System.out.println("f : " + f);
		//String <- Float
		String str = String.valueOf(f);
		System.out.println("str : " + str);
		//--------
		Double d = 10.5D;
		
		d = new Double(12.5d);
		d = new Double("12.5d");
		
		//String - > Double 
		str = String.valueOf(d);
		
		System.out.println("str : " + str);
		
		//Double <- String
		d = Double.valueOf("12.5d");
		System.out.println("d : " + d);
	}
}
