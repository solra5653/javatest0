package oop.abst;

//인터페이스 : 
//		추상메소드만 멤버로 가진 추상클래스
//제공되는 메소드 사용 규칙(signature)에 대한 강제화가 필요할때 이용

public interface IGrade {
	//public abstract 반환자료형 메소드명([자료형 매개변수,....]);
	//인터페이스 안에서는 public abstract 표기 생략함
	/* public abstract */ char getGrade(int score);
	
	//상수필드는 멤버로 가질 수 있음.
	public static final int NUMBER = 100;
}
