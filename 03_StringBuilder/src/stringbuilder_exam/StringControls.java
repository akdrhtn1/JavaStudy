package stringbuilder_exam;

import java.util.StringTokenizer;

public class StringControls {
	/*
	 * 문자열 다루기 0.문자열 데이터 String str1 = "홍길동 이순신   이순신 Tom 홍길동"; String str2 =
	 * "    TOM    을지문덕 김유신 연개소문"; 
	 * 1. 위의 문자열을 StringBuilder 변수 sb를 이용해서 하나의 문자열로
	 * 만들고, 
	 * 2-1. sb의 문자열을 빈칸(" ")을 구분자로 잘라서(이름만 추출) 화면 출력(데이터확인) 
	 * (String.split() 또는
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

		StringTokenizer strToken = new StringTokenizer(sb.toString(), " ");

		// 2-1
		System.out.println("strToken.countTokens() :" + strToken.countTokens()); 

		while (strToken.hasMoreTokens()) { 
			String token = strToken.nextToken(); 
			System.out.printf(token + " ");

		}
		// 2-2
		System.out.println();
		
		//==배열에 값넣기//
		strToken = new StringTokenizer(sb.toString(), " ");
		int i = 0;
		String[] names = new String[strToken.countTokens()];
		
		while (strToken.hasMoreTokens()) {
			names[i] = strToken.nextToken();
			i++;
		}
		
		/*for(i= 0; i<names.length; i++) {
			System.out.printf(names[i] + " ");
		}
		System.out.println();
		*/
		
		
		//3
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append(names[0]);
		
		for(i=1; i<names.length; i++) {

			sb2.append(",").append(names[i]);
		}
		System.out.println(sb2.toString());
		
		// sb2.delete(0, sb2.length());  밑에랑 똑같음
		sb2.setLength(0); // 데이터 사라지게 하고 공간을 재사용 (그대로 쓰기) 
		

		if(names.length>0)
		{	
			sb2.append(names[0].charAt(0));
		}
		for(i=1; i<names.length; i++) {

			sb2.append(",").append(names[i].charAt(0));
		}
		
		System.out.println(sb2.toString());
		
		
		sb2.setLength(0);
		
		//5
		for(i=0; i<names.length; i++) {
			if(names[i].length()>=4) {
				sb2.append(i + ":" + names[i] + " ");
			}
			
			
		}
		System.out.println(sb2.toString());

	}

}
