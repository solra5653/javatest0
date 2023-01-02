package first.run;

//import : 다른 패키지에 소속된 사용시 선언하는 구문임
//import 패키지명.*; 
//import 패키지명.클래스명;

//import static : 싱글톤(Single-Ton) 디자인 패턴으로 작성된
//클래스의 메소드 import시에 사용함
//single-ton :  프로그램이 구동되는 동안 메모리에 딱 한개만 만들어서
//					계속 공유하면서 사용하게 작성하는 방식임
import static java.lang.Math.max;
//import로 Math를 불러와서 실해되는것이다.


public class TestimportStatic {

	public static void main(String[] args) {
		// 클래스가 가진 public static 멤버 사용
		// 클래스명.멤버
		System.out.println("원주율 : " + Math.PI );
		System.out.println("결과 : " + max(12.5, 33.7));
		//System.out.println("결과 : " + Math.max(12.5, 33.7));
		System.out.println("절대값 : " + Math.abs(-5));
		//System.out.println("절대값 : " + abs(-5)); 에러 import는 설정안하면 에러
		/*
		Math math = new Math();
		math.abs(-3.5);
		*/
		
		
	}

}
