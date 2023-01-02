package first.sample;

import java.util.GregorianCalendar;

//import 선언문 작성 위치
//import 패키지명.클래스명;
//import 패키지명.*;  => 패키지안에 모든것을 import 해라
//패키자가 다른 클래스를 사용하려면, 반드시 import 선언을 해야 함

//같은 패키지 안에 클래스끼리는 import 하지 않고 그대로 사용함
//다른 패키지를 사용하려면 import 써야 다른 다른 패키지를 사용할수 있다.

public class Calculator {
	//클래스 사용 : 필드, 매개변수, 메소드 안의 지역변수
	//1. 필드로 클래스 사용하는 방법
	//private 자료형 변수명;
	private Sample samp;
	//자료형(Data Type) : 값의 종류를 구분하기 위한 단어
	//클래스자료형 : 객체(Object)의 종류를 구분짓기 위한 용도임
	private GregorianCalendar today;
	
	//2. 메소드의 매개변수로 사용
	//public ,반환자료형 메소드명(자료형 매개변수){.....}
	public void getSamp(Sample obj) {
		obj.printlnfo();
		
	}
	//3. 메소드 안에서 지역 변수(Local Variable)로 사용
	public void getSamp() {
		Sample s = new Sample();
		s.printlnfo();
	}

}
