package first.run;

import first.sample.Calculator;
import first.test.Welcome;
//단축기 ctrl+shift+o = import

public class TestMain3 {

	public static void main(String[] args) {
		// 기능제공용 클래스(사용자정의 자료형)의 사용
		// 참조 자료형(Reference Type) : 클래스 자료형
		// 1. 클래스자료형 변수명;
		Welcome ref;
		String str;
		Calculator calc;
		
		//기본 자료형(Primitive Type)
		// *중요 : char, byte, short, int, long, float, double, boolean
		//값 저장함
		int num;
		double dnum;
		
		// 2. 변수방에 값 기록 (기본 자료형)
		num = 120;
		dnum = 3.456;
		char ch = 'A';
		//글자 하나만 기록한다면 char를 써야되면 이때 ""가 아닌 ''로 사용해야된다.
		boolean flag = false;
		
		//참조 자료형(클래스 자료형) 변수방에는 주소가 기록됨
		//주소저장 변수 : 레퍼런스 변수 라고 함
		//레퍼런스 변수 : new 생성자();
		ref = new Welcome();
		str = new String();
		calc = new Calculator();
		
		// 3. 변수 사용 => 출력에 사용
		// 기본자료형 변수의 사용은 변수에 기록된 값의 사용을 뜻함
		System.out.println("num : " + num);
		System.out.println("dnum : " + dnum);
		System.out.println("ch : " + ch);
		System.out.println("flag : " + flag);
		
		//참조자료형 변수의 사용은 기록된 주소를 통한
		//해당 클래스의 메소드
		//레퍼런스변수.메소드(....)
		ref.setMessage("안녕하세요.^^");
		ref.printMessage();
		
		calc.getSamp();
	}

}
