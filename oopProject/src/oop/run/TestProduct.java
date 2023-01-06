package oop.run;

import oop.encapsulation.Product;
import oop.encapsulation.Student;

public class TestProduct {
	public static void main(String[] args) {
		//Product 클래스 사용 테스트
		
		//클래스 사용 : 클래스를 자료형으로 사용함
		//Reference Type(참조 자료형)이라고 함
		//클래스명 변수; => 참조변수
		
		Product p1 = null; //레퍼런스변수 : 주소 가질 변수임.
//		int num = 0;
//		int num = null; //null 은 기본자료형 값으로 사용못함
		
		//값 또는 주소가 없는 빈 변수는 자바에서 사용 못함
		//주소변수는 기본 null 로 초기화함
		//null : 비었다. (주소없다) 의미임
		System.out.println("p : "+ p1);
		
		//레버런스(주소변수)에는 선언시 사용된 클래스타입과 같은
		//객체의 주소만 기록할 수 있음
		//즉, p1에는 Product 클래스 객체의 주소만 저장함
//		p1 = new Student(); //error
		
		//레퍼런스변수 = new 할때 생성된 객체의 주소;
		//레퍼런스변수 = new 생성자();
		//new 클래스()
		//=> new 클래스로 해당 클래스에 대한 객체 공간을
		//		힙에 맒듬 (할당 : allocation)
		//=>객체 공간(인스턴스) 만들고
		//		바로 클래스명과 이름이 같은 생성자를 자동 실행함
		//=> 생성자가 실행되면서 안에 있는 this 레퍼런스가
		//		자동 객체의 주소를 전달받아서
		//=> 새로 만들어진 this 위치안의 필드(인스턴스변수)들에
		//		준비된 초기값 또는 전달받은 초기값으로 초기화시킴
		//초기화(initionalization) : 변수방에 첫번째로 값을 기록함
		
		p1 =new Product();
		//객체가 생성(할당)되면서 기본생성자 호출(실행)함
		
		//주소 확인
		System.out.println("p1이 가진 객체의 위치(주소) : "
				+p1);
	}
}
