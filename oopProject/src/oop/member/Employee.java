package oop.member;

//직원 정보 저장용 클래스
//클래스 : 자료형이 다른 변수들의 묶음(구조체) + 접근제한기능(보안기능) 
//구조체 : 자료형이 다른 변수들을 연속 나열 할당한 구조임(배열과 유사)
//클래스의 목적 : 데이터 보호가 목적임 => 켑슐화(Encapsulation)
public class Employee {
	//멤버변수 : Field
	//자료형이 다른 변수들 + 캡슐화 : oop 
	//접근제한자 [예약어] 자료형 변수명[= 초기값];
	//접근제한자 [예약어] 클래스형 레퍼런스[= new 생성자()];
	private String empId;		//사번
	private String empName;	//이름
	protected String empNo;		//주민번호
	public String phone;		//전화번호
	String job;		//직급
	String dept;		//부서
	int salary;		//급여
	double bonusPct;	//보너스포인트
	char marriage;	//결혼여부(기혼: Y, 미혼: N)	
	
	//생성자함수 : Constructor
	
	//멤버함수 : Method
	public void testMethod() {
		//주소.필드명
		this.empId = "s333";  //private : 클래스 안에서만 사용
	}
}
