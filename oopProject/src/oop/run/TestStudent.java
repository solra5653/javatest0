package oop.run;

import oop.encapsulation.Student;

public class TestStudent {

	public static void main(String[] args) {
		// 클래스 사용 : 자료형으로 사용함
		// 클래스를 참조자료형(Reference Type)이라고 함
		// 클래스명 변수;
		Student st;  //st 는 레퍼런스 변수 : 객체의 주소저장용

		st = new Student();
		//레퍼런스변수 = new 생성자();
		//클래스가 생성자를 가지고 있지 않을 때만
		//컴파일시 기본생성자가 자동 코드로 추가됨
		
		//클래스 사용
		//클래스명 레퍼런스변수 = new 생성자(초기값,...);
		//1. 클래스에 대한 객체공간(인스턴스)을 힙에 할당함(만듦)
		//2. 클래스의 생성자가 호출(실행)됨 : 초기값 전달
		//3. 생성자 안의 this 가 할당된 객체의 주소를 자동 받음
		//4. this 가 받은 주소 위치의 필드들에 초기값 기록함
		//5. 할당된 객체의 주소를 레퍼런스변수에 기록함
		
		System.out.println("st가 가진 주소 : " + st.hashCode());
		
		//메소드 사용법 : void 형일 때
		//레퍼런스.메소드명(전달값); ==> 주소.메소드명(전달값); 
		//메소드 안의 this 에게 주소 전달하는 방법임
		st.setNo(12);
		
		Student ss = new Student();
		System.out.println("ss가 가진 주소 : " + ss.hashCode());
		
		ss.setNo(25);
	}

}






