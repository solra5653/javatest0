package oop.abst;

public abstract class AbstractSample {
	
	public AbstractSample () {
		
	}
	//Method
	//추상(abstract) 메소드 : 미완성된 메소드를 의미함
	//메소드의 헤드 선언만 있고, 메소드 바디가 없는 메소드
	//목적 : 메소드 사용 규칙의 강제화 목적임
	//			후손클래스 작성시 모든 후손들이 같은 형식의 메소드를
	//			작성해서 사용하게 하기 위함.
	//접근제한자 abstract 반환타입 메소드명([자료형 매개변수]);
	public abstract void abtMethod();
	//추상(미완성) 메소드를 멤버로 가진 클래스는 반드시
	//abstract class 로 표기해야함
	
	//오버라이딩 못함
	public final void display(){
		System.out.println("method run.");
	}
	
}
