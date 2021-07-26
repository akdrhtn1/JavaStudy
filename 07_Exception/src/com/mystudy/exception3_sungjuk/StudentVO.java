package com.mystudy.exception3_sungjuk;

//	자바빈(Java Bean)형태의 클래스 작성
//	VO(Value Object) : 값을 저장하기 위한 클래스(객체) - xxxVo , xxxVO
//	DTO(Data Transfer Object) : 값을 저장해서 전달하기 위한 클래스 - xxxDTO, xxxDto
public class StudentVO {

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	
	public StudentVO() {
		
	}
	

	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot
				+ ", avg=" + avg + "]";
	}


	public StudentVO(String name,int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

		
		computeTotAvg();
	}

	
	private void computeTotAvg() {
		tot = kor + eng+ math;
		avg = tot *100 / 3 /100.0;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getKor() {
		return kor;
	}
	//호출한 곳으로 예외 던지기(thorws)
	public void setKor(int kor) throws ScoreOutOfValueException { // 발생 예외 던지기
		if(kor>=0 && kor<=100) {
			this.kor = kor;
			computeTotAvg();
		}else{
			//System.out.println("국어 점수가 범위를 이탈하였습니다.");
			throw new ScoreOutOfValueException(); //예외 발생시키고 던지기
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
	
	public void printInfo() {
		System.out.printf("%s %3d %3d %3d %3d %.2f\n",name,kor,eng,math,tot,avg);
	}

}
