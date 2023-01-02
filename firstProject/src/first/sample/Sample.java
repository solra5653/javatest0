package first.sample;
//1. 패키지 선언문 : package 클래스의 소속패키지명;
//반드시 java 소스파일 첫줄에 작성해야 함

//: 주석 달때(한줄 주석 달때)
// /*주석*/ : 주석 달때(여러 줄 주석 달때)

/*
 	comment(주석문)
 	: 코드 구문의 내용 이해를 돕기 위한 설명문구
	- 주석기호 사용해서 코드와 구분해야 함
	- 설명 문구가 한 줄 일때는 // 구문 앞에 붙여서 사용함
	- 주석문은 컴파일할 때 소스에서 제외됨
*/
//- 설명 문구가 여러 줄일때는 /*로 시작하고 */로 마무리함

//2. 패키지 선언문 다음에는 import 문 작성 영역임
import java.util.*;
//import java.lang.*; //자바 언어의 기본패키지임
//모든 .java 소스 파일에 자동 import 처리되고 있음. 그래서 import java.lang.*; 생략이된다.
//import java.lang.*; 제외한 모든것은 import 선언을 해야됨.



//3. 클래스 작성문
public class Sample {
	
	//멤버 : 클래스 블럭(영역) 안에 작성되는 구성 항복을 말함
	//필드(Field) : 멤버 변수 (값 저장용)
	//private 자료형 변수명; (값의 방)
	private int number = 12;
	//정수 (int) : 정수(소숫점 아래값 사용 안하는 수)값 저장을 지정시 사용 ex) 1, 23, 345
	private double value= 3.45;
	//실수 (double) : 실수(소숫점 아래값 사용하는 수)형 값 저장을 지정시 사용 ex)2.45, 0.5, 3.14
	private  String name = "홍길동";
	//문자열 (String) : 문자나열값(문자열) 저장을 지정시 사용. 자바에서는 String 클래스를 사용함.
	//객채 object
	//"=" 는 프로그래밍 언어로 대입으로 쓰인다 같다라고 쓰지 않는다.
	
	//생성자(Constructor[CONSTR]) : 초기 메소드 (필드를 메모리에 할당)
	//public 클래스명(){}   기본생성자 -> (){}
	public Sample() {}
	
	//메소드(Method) : 멤버함수 (값 처리에 대한 구문을 가짐 : 기능)
	//public 반환자료형 메소드명(자료형 매개변수면) { 처리할 구문들 }
	//-메소드 안에() 는 매개변수. 매개변수는 꼭 있는게 아니라 특정 경우에만 넣는다.
	
	public void printlnfo() {
		System.out.println("기본 출력에 사용함");
		System.out.println("이름 : " + name);
	}
	
	//void는 반환값이 없다. 돌려받을 값이 없다.
	//System.out.println("기본 출력에 사용함") <- 출력할때 사용함
	//syso한 다음 컨트롤+스페이스바 누르면 System.out.println(); 자동 완성
	
	
	//  *중요 : 자바는 소멸자(Destructor)를 사용하지 않음
	//   =>  메모리를 자동으로 관리해 주기 때문임.
	//   => 쓰레기 콜렉터(Garbage Collector)가 자동으로 삭제 처리함
	
	
	
	
}
