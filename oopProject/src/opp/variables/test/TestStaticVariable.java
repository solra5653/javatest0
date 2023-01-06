package opp.variables.test;

public class TestStaticVariable {

	public static void main(String[] args) {
		// static 멤버들은 프로그램 실행시
		// 정적(static) 메모리에 자동으로 만들어짐
		// 프로그램이 종료되면 자동으로 삭제됨
		// 즉, 프로그램 구동 동안에는 계속 존재함.
		
		System.out.println("자동차 객체 수 : "+Car.count);
		System.out.println("Car.message : " + Car.getMessage());
		//자바에서는 heap과 static 에 할당되는 변수의 초기값으로
		//기본값을 준비해 두었음 =>  ,초기값 없는 변수 자동 초기화
		
		//static 메모리의 특징 : 
		//같은 변수는 딱 한번만 초기화시킴
		// =>같은 변수는 한 개만 할당함
		//싱글톤(Single-Tone) 디자인패턴에서 활용
		//=>프로그램이 구동되는 동안 메모리에 딱 한개만 만들어서
		//=> 공유해서 사용하는 방식임
		
		//static 필드들은 같은 클래스형 객체들이 공유하게 됨
		//객체의 갯수를 카운트할 목적으로 이용할 수 있음
		Car c1 = new Car();
		System.out.println("자동차 객체 수 : "+Car.count);
		System.out.println(c1.carInfo());
		System.out.println(Car.getMessage());
		
		Car.setMessage("현금으로 구매하였음.");
		
		Car c2 = new Car("현대", "ivory", 2500);
		System.out.println("자동차 객체 수 : "+Car.count);
		System.out.println(c2.carInfo());
		System.out.println(Car.getMessage());
		//여러 객체들이 데이터를 주고 받을 목적으로 사용할 수 있음.
		
	}

} //

//static 테스트용 샘플 클래스
class Car{
	//static field : 클래스변수
	//프로그램 시행시 static 메모리에 자동으로 만들어짐.
	public static int count;		//메모리에 할당된 객체수 카운트용
	private static String message = "할부로 구매하였음";
	
	//field : 인스턴스변수 => 캡슐화
	//new 로 객체 생성하면, 객체 안에 만들어짐.
	private String company;
	private String color;
	private int size;	
	
	// Constructor
	// 기본생성자
	
	public Car() {
		System.out.println("this가 받은 주소 : " + this.hashCode());
		count++;
	}
	
	//매개변수 있는 생성자
	//인스턴스 변수 (객체 안에 할당되는 필드)
	public Car(String company, String color, int size) {
		System.out.println("this가 받은 주소 : " + this.hashCode());
		this.company = company;
		this.color = color;
		this.size =size;
		
		this.count++;
	}
	
	//Method
	public String carInfo() {
		System.out.println("this가 받은 주소 : " + this.hashCode());
		return "자동차정보[ 제조회사 : "+ this.company
					+ ", 색상 : " + this.color
					+ ", 배기량 : " + this.size
					+" ]";
	}
	
	//대상 필드가 static 이면, setter & getter 도 static 이어야함
	public static void setMessage(String msg) {
		//this 레퍼런스가 없음 : 
		//정적메모리에서 동적메모리의 객체를 주소로 참조 불가능함
		//System.out.println("this가 받은 주소 : " + this.hashCode());
		message = msg;
	}
	public static String getMessage() {
		//
		return message;                          
	}
}