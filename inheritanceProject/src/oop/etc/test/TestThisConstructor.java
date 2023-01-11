package oop.etc.test;

public class TestThisConstructor {
	
	public static void main(String[] args) {
		//this() 생성자 사용 테스트
		Customer c1 = new Customer(1350, "홍길동",
							53000, "010-1234-5678");
		System.out.println(c1.info());
		System.out.println("c1 : " + c1.hashCode());
		
		Customer c2 = new Customer(c1);
		System.out.println(c2.info());
		System.out.println("c2 : " + c2.hashCode());
		
		Customer c3 = c1;
		System.out.println(c3.info());
		System.out.println("c3 : " + c3.hashCode());
	}
	
}

//this() 생성자 샘플 클래스
//목적 : 자기 클래스 안에서 다른 새엉자를 실행시키기 위해 사용함.
//			생성자 안에서 다른 생성자를 실행시키는 구조임.
//			일반적으로 사용안함.
//			코드의 중복을 줄이기 위해 사용할 수 있음.
class Customer{
	//Field
	private int code;
	private String name;
	private int point;
	private String phone;
	
	//Constructor
	public Customer() {
		super(); //모든 생성자 안 첫줄에 무조건 존재함
		//부모의 기본생성자를 호출함
	}
	
	//매개변수 있는 생성자
	public Customer(String name, String phone) {
//		super(); //첫줄에만 작성할 수있음.
		//this(); //기본생성자 실행
		this.name = name;
		this.phone =phone;	
	}
	
	public Customer(int code ,String name,int point, String phone) {
		//생성자 안에서 다른 생성자를 실행 할 때 사용
		//Customer(name, phone); //error
		this(name, phone); //매개변수 2개 있는 생성자 실행
		//반드시 첫줄에만 작성해야함
		this.code =code;
		this.point =point;
	}
	
	//복사 생성자 : 
	//기존에 할당된 인스터스(객체)가 가진 필드값들을
	//새로 만드는 객체에 복사하는 생성자
	public Customer(Customer otherRef) {
		this(otherRef.code, otherRef.name,
				otherRef.point, otherRef.phone);
//		this.code = otherRef.code;
//		this.name = otherRef.name;
//		this.point = otherRef.point;
//		this.phone = otherRef.phone;
	}
	
	//Method
	public String info() {
		return "Customer [ " + code +", " +name +", "+ point
				+", " +phone +" ]";
	}
}
