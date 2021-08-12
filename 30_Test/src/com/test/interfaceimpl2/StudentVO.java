package com.test.interfaceimpl2;


public class StudentVO {
	private String id; //학번(고유번호: 유일한 데이터 - 중복 데이터 없음)
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public StudentVO() {
		
	}
	
	public StudentVO(String id, String name, int kor, int eng, int math) {
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

		computeTotAvg();
	}


	
	// 	생정자 선언 ---------------------------------
	//	생성자 - 성명, 국어, 영어, 수학 점수를 입력받는 생성자
	//	총점, 평균 계싼처리 computeTotAvg() 사용
	
	public StudentVO(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;

		
		computeTotAvg();
	}
	public StudentVO(String name,int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

		
		computeTotAvg();
	}
	//	setter, getter 메소드 선언 ----------------
	//	국어, 영어, 수학 점수가 변경되면 총점, 평균 재계산 처리
	//	점수는 0~100 값만 입력 처리
	
	private void computeTotAvg() {
		tot = kor + eng+ math;
		avg = tot *100 / 3 /100.0;
	}
	//	setter, getter 메소드 선언 ---------------------------------
	//	국어, 영어, 수학 점수가 변경 되면 총점,평균 재계산 처리
	//	점수는 0~100 값만 입력처리
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getKor() {
		return kor;
	}
	
	public void setKor(int kor) {
		if(kor>=0 && kor<=100) {
			this.kor = kor;
			computeTotAvg();
		}else{
			System.out.println("국어 점수가 범위를 이탈하였습니다.");
		}
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) {
		if(eng>=0 && eng<=100) {
			this.eng = eng;
			computeTotAvg();
		}else{
			System.out.println("영어 점수가 범위를 이탈하였습니다.");
		}
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		if(math>=0 && math<=100) {
			this.math = math;
			computeTotAvg();
		}else{
			System.out.println("수학 점수가 범위를 이탈하였습니다.");
		}
	}
	public int getTot() {
		return tot;
	}
	public double getAvg() {
		return avg;
	}
	

	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot
				+ ", avg=" + avg + "]";
	}

	
	

}
