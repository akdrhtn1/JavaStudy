package stringbuilder_exam;

import java.util.StringTokenizer;

public class StringControls2 {
	/*
	 * 문자열 다루기 0.문자열 데이터 String str1 = "홍길동 이순신   이순신 Tom 홍길동"; String str2 =
	 * "    TOM    을지문덕 김유신 연개소문"; 
	 * 1. 위의 문자열을 StringBuilder 변수 sb를 이용해서 하나의 문자열로
	 * 만들고, 
	 * 2-1. sb의 문자열을 빈칸(" ")을 구분자로 잘라서(이름만 추출) 화면 출력(데이터확인) (String.split() 또는
	 * StringTokenizer 클래스 사용) 예) 홍길동 이순신 이순신 Tom 홍길동 TOM... ->화면에 출력 
	 * 2-2. 문자열을 저장할
	 * 수 있는 배열변수(names)에 저장 
	 * 3. 배열에 있는 값을 구분자 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
	 * 예) 홍길동,이순신,이순신,Tom,홍길동,TOM... 
	 * 4. 데이터의 첫글자만 추출해서 콤마(,)로 구분하여 한라인에
	 * 출력(StringBuilder 사용) 예) 홍,이,이,T,홍,T,을... 
	 * 5. 배열의 문자열중 이름의 글자수가 4 이상인 값을
	 * "인덱스번호:이름" 출력 예) 인덱스번호:을지문덕
	 ********************************/
	public static void main(String[] args) {
		String str1 = "홍길동 이순신   이순신 Tom 홍길동";
		String str2 = "    TOM    을지문덕 김유신 연개소문";
		//1
		StringBuilder sb = new StringBuilder();

		sb.append(str1).append(str2);
			
		String[] names = sb.toString().split(" ");
		
		for(String s : names) {
			System.out.println("-" + s + "-");
		}
		
		
		
	}

}
