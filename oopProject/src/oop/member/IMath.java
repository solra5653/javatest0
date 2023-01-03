package oop.member;

public class IMath {
	//상수 필드(constant field)
	//public static final 자료형 필드명 = 초기값;
	//static : 정적메모리에 기록됨.
	//필드의 final : 값 변경 못함.
	public static final double PI = 3.14159;
	
	public void testFinal() {
		PI =5.432; //error
	}

}
