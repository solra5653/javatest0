package oop.encapsulation;

//class : 자료형이 다른 변수들의 묶음(구조체) + 접근제한
//객체지향은 1원칙 : 캡슐화
//필드를 비공개(private)처리함
//private : 클래스 안에서만 사용 가능, 클래스 밖에서는 접근 불가능
public class Student {
	//Field(멤버변수) : 자료형이 다른 변수들(취급할 데이터들)
	//객체(instance) 안에 만들어질 변수들임
	//field == instance 변수라고 함
	//접근제한자 [예약어] 자료형 변수명[ = 초기값];
	private int no;//학번
	private String name;//이름
	private String major;//전공학과
	private double score;//성적점수
	private char  grade;//학점등급
	private int age;//나이
	private char gender;//성별
	
	//캡슐화된 필드를 다루는 방식이
	//생성자나 메소드를 public 처리해서 oop를 해결함
	
	//생성자 함수(Constructor)
	//오버로딩(overloading, 중복 정의) 가능함
	//클래스 안에 이름이 같은 생성자를 여러개 작성한 경우
	
	//작성방법 : 접근제한자 클래스명([자료형 매개변수, .....]){ 	필드 초기화 }
	//함수이름은 반드시 클래스명과 같아야 함
	//반환 자료형 없음 (return 없음)
	//new 할때만 사용됨 : 객체공간 할당시에만 사용함
	//객체공간 만들어질때 객체안에 필드가 생성됨
	//		=> 생성되는 필드에 초기값 기록이 목적임
	
	//기본생성자 : 매개 변수가 없는 생성자
	//jvm 이 준비한 각 자료형별 기본값(default) 으로 초기화됨
	//boolean : false, char : '\u0000', 정수 : 0, 실수 : 0.0
	//참조형 : null
	
	
	//매기변수가 있는 생성자
	
	//멤버함수(Method)
	

}
