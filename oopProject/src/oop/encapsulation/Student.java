package oop.encapsulation;

//class : 자료형이 다른 변수들의 묶음(구조체) + 접근제한
//객체지향은 1원칙 : 캡슐화
//필드를 비공개(private) 처리함
//private : 클래스 안에서만 사용 가능, 클래스 밖에서는 접근 불가능
public class Student {
	//Field(멤버변수) : 자료형이 다른 변수들(취급할 데이터들)
	//객체(instance) 안에 만들어질 변수들임 
	//field == instance 변수 라고 함
	//접근제한자 [예약어] 자료형 변수명[ = 초기값];
	private int no;  		//학번
	private String name;	//이름
	private String major;	//전공학과
	private double score;	//성적점수
	private char grade;		//학점등급
	private int age;		//나이
	private char gender;	//성별
	
	//캡슐화된 필드를 다루는 방식이
	//생성자나 메소드를 public 처리해서 oop 를 해결함
	
	//생성자 함수(Constructor) ----------------------------------
	//오버로딩(overloading, 중복 정의) 가능함
	//클래스 안에 이름이 같은 생성자를 여러 개 작성한 경우
	
	//작성방법 : 접근제한자 클래스명([자료형 매개변수, ....]){  필드 초기화 }
	//함수이름은 반드시 클래스명과 같아야 함
	//반환자료형 없음 (return 없음)
	//new 할때만 사용됨 : 객체공간 할당시에만 사용함
	//객체공간 만들어질때 객체안에 필드가 생성됨
	//  => 생성되는 필드에 초기값 기록이 목적임
	
	//기본생성자 : 매개변수가 없는 생성자 -------------------
	//jvm 이 준비한 각 자료형별 기본값(default) 으로 초기화됨
	//boolean : false, char : '\u0000', 정수 : 0, 실수 : 0.0
	//참조형 : null
	public Student() {
		//System.out.println("this가 받은 주소 : " + this.hashCode());
	}	
	
	//매개변수가 있는 생성자 ---------------------------------------
	//필드 일부만 초기화하는 생성자
	public Student(int no, String name, int age, char gender) {
		this.no = no;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//필드 모두 초기화하는 생성자
	public Student(int no, String name, String major, 
			double score, char grade, int age, char gender) {
		this.no = no;
		this.name = name;
		this.major = major;
		this.score = score;
		this.grade = grade;
		this.age = age;
		this.gender = gender;
	}
	
	//멤버함수(Method) ----------------------------------------------
	//non-static 메소드에는 this 레퍼런스가 존재함
	//static 메소드에는 this 가 없다.	
	
	//객체 안의 필드값 확인용 메소드
	//1. 출력용
	public void printInfo() {
		System.out.println("학번 : " + this.no 
				+ ", 이름 : " + this.name
				+ ", 전공 : " + this.major
				+ ", 학점 : " + this.score
				+ ", 등급 : " + this.grade
				+ ", 나이 : " + this.age
				+ ", 성별 : " + this.gender);
	}
	
	//2. 객체 정보를 문자열 합치기해서 문자열 리턴
	public String information() {
		return "학생정보[학번 : " + this.no 
				+ ", 이름 : " + this.name
				+ ", 전공 : " + this.major
				+ ", 학점 : " + this.score
				+ ", 등급 : " + this.grade
				+ ", 나이 : " + this.age
				+ ", 성별 : " + this.gender + "]";
	}
	
	//Setter -------------------------------------------------
	//필드 각각에 대해 필드값 변경이 목적인 메소드
	//작성방법 : 
	//public void set필드명(자료형 매개변수){
	//		this.필드 = 매개변수;
	//}
	
	public void setNo(int no) {
		//System.out.println("setNo() 작동");
		//System.out.println("this 가 받은 주소 : " + this.hashCode());
		this.no = no;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
	
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	//Getter -----------------------------------------------------
	//각각의 필드에 대해 기록된 값 조회용 메소드
	//작성방법 : 
	//public 반환값자료형 get필드명(){  return this.필드명;  }
	
	public int getNo() {
		return this.no;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getMajor() {
		return this.major;
	}
	
	public double getScore() {
		return this.score;
	}
	
	public char getGrade() {
		return this.grade;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public char getGender() {
		return this.gender;
	}
}







