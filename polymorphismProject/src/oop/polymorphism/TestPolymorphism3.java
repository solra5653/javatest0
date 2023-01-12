package oop.polymorphism;

import java.util.Date;

public class TestPolymorphism3 {
	//메소드 매개변수에 다형성 사용하면, 오버로딩을 줄일 수 있음.
//	public void println(ClassA ref) {
//		System.out.println(ref.toString());
//	}
//	//메소드 오버로딩(overloading) : 중복정의 ※시험
//	//한 클래스 안에서 이름같은 메소드 여려개 작성한 경우
//	//주의 : 매개변수가 달라야 함(갯수, 자료형)
//	public void println(ClassB ref) {
//		System.out.println(ref.toString());
//	}
//	public void println(ClassC ref) {
//		System.out.println(ref.toString());
//	}
//	public void println(ClassD ref) {
//		System.out.println(ref.toString());
//	}
//	public void println(Date ref) {
//		System.out.println(ref.toString());
//	}
//	public void println(String ref) {
//		System.out.println(ref.toString());
//	}
	
	//다형성 이용 : 메소드 오버로딩 갯수 줄일 수 있음
	public void println(Object ref) {
		System.out.println(ref.toString());
	}
	
	public static void main(String[] args) {
		// 다형성 사용 테스트
		//메소드의 리턴타입, 메소드 매개변수, 
		// 배열 또는 컬렉션 등에 주로 이용함.
		
		//배열 :  한 종류의 자료형 값 여러개를 나열 할당함
		//=> 다형성 적용시, 여러 타입을 저장할 수 있게 됨.
		
		TestPolymorphism3 test = new TestPolymorphism3();
		test.println(new ClassA());
		test.println(new ClassB());
		test.println(new ClassC());
		test.println(new ClassD());
		test.println(new Date());
		test.println(new String("다형성 사용 테스트"));
	}

}
