package var.sample;

import java.util.Scanner;

public class VariableSample {
	//멤버 : Field(멤버변수), Constructor(생성자), Method(멤버함수)
	
	//Method(멤버함수) : 기능 제공용 소스를 가진 함수
	//접근제한자 [예약어] 반환자료형 메소드([자료형 변수명]){ 소스 작성 }
	//접근제한자(access modifier) : 접근에 제한을 거는 단어
	//public, protected, private, default(표기 생략됨) -> default가 자바에 추가됨
	//public(공개) : 패키지 안/밖, 클래스 안/밖 어디서나 사용 가능
	//protected(상속시에만 후손에게 공개[선택적 비공개]) : 
	//				상속 받은 후손 클래스 안에서만 사용 가능함
	//				상속관계가 아니면, 같은 패키지 안에서만 사용 가능함
	//private(비공개) : 클래스 밖에서 사용 불가능, 따라서 다른 패키지에서 사용 불가(캡슐화)
	//							클래스 안에서만 사용 가능함
	//default(표기가 생략됨) : 같은 패키지 내에서만 사용 가능
	//		package private 이라고 함(패키지 내에서만 사용 가능해서 쓰이는 말)
	
	public void testPrimitiveType() {
		// 기본 자료형(primitive type) 확인용 메소드
		// 자바가 제공하는 8개 기본 자료형 :
		// boolean, char, byte, short, int, long, float, double
		
		//변수(variable) : 메모리(RAM)에 값 기록할 방(공간)
		//변수 선언 > 변수에 값 기록 > 변수 사용
		
		//변수 선언 : 메모리에 방 만들기
		//자료형 변수명;
		boolean yesNo;		//true, false 만 기록할 수 있음, 1byte기록
		char gender;			//글자 1개 기록할 수 있음. 2byte 기록
		byte bvalue;			//바이트(byte) 정수(-128 ~ 127)기록할수 있는 공간
		short svalue;			//2바이트(byte) 정수(-32768 ~ 32767)
		int age;					//정수의 기본형, 4바이트(byte) (-2147483648 ~ 214783647)
		long pay;				//int  보다 큰 정수일때 기록, 8바이트(2의 63승에 대한 음수 양수)
		float tax;				//4바이트 실수형
		double salary;			//8바이트 실수형, 실수값의 기본형
		
		//준비된 변수방에 값 기록
		//변수명 = 기록할 값;
		//- 주의 : 선언된 변수의 자료형과 같은 종류의 값만 기록할 수 있음.
		//			  불일치시 에러남
		yesNo =  false;		// true | false 만 사용
		gender = '남';			// 문자하나 표현시 작은 따음표 사용
		bvalue = 100; 		// -128 ~127 사의 값만
		svalue = 30000;		// -32768 ~ 32767 사이의 값만
		age = 30;				
		pay = 4500000L;		//long형 정수값 뒤에는 접미사 L 붙임 [iso국제 표준으로 정해짐]
		tax =0.03f;				//float형 실수값 뒤에는 접미사 f 붙임 [iso국제 표준으로 정해짐]
		salary = 50000000.; //3. 은 3.0 과 같다.
		
		//변수 사용 : 변수 방에 기록된 값의 사용을 뜻함
		System.out.println(yesNo + ", " + gender + ", " 
									+ bvalue + ", " + svalue + ", " + age 
									+ ", " + pay +  ", "  + tax + ", "  + salary);
		return; 			//표기 생략 가능함	
	}
	
	//자바에서 문자열값과 문자열 변수
	public void testString() {
		//클래스는 자료형으로 사용된다. -> 참조자료형 이라고 함
		//클래스의 사용 : 
		//클래스명 변수 = new 생성자();
		//생성자는 클래스명과 이름이 같음
		//클래스로 만들어진 변수를 레퍼런스 변수라고 함
		//레퍼런스변수에는 할당된 객체공간의 주소가 기록됨
		
		//자바에서는 문자열을 다룰 때 java.lage.String 클래스를 사용함.
		String str = new String("test string");
		System.out.println(str);
		
		//모든 클래스는 new를 써야된다.(객체지향의 원칙)
		//자바에서 String을 기본자료형처럼 사용할 수 있음.
		//자료형 변수명 = 기록할값;
		String name = "홍길순";
		System.out.println("name : " + name);
		
		return;
	}
	
	//변수 초기화(initialization[Init]) 테스트용
	public void testInit() {
		//변수 초기화 :
		//		변수 선언과 동시에 초기값 기록하는 것
		//초기값 : 변수방에 첫번째 기록되는 값
		//자료형 변수 = 초기값;
		boolean yesNo = true;
		int age = 30;
		double salary = 450000.;
		char gender = '여';
		String name = "홍길순";
		
		System.out.println("[" + yesNo + ", " + age + ", " 
									+ salary+ "원, " + gender+ "자, "
									+name +  "님]" ) ;
		return;
	}
	
	public String testInit2() {
		//변수 초기화 :
		//		변수 선언과 동시에 초기값 기록하는 것
		//초기값 : 변수방에 첫번째 기록되는 값
		//자료형 변수 = 초기값;
		boolean yesNo = true;
		int age = 31;
		double salary = 850000.;
		char gender = '남';
		String name = "강용범";
		
		 String result = "[" + yesNo + ", " + age + ", " 
									+ salary+ "원, " + gender+ "자, "
									+name +  "님]" ;
		return result;
	}
	
	//변수 연습
	public String example() {
		//변수 초기화를 사용해서 변수 선언과 값 대입 처리
		//학생 정보를 저장하도록 함
		//이름(name), 국어점수(kor), 영어점수(eng)
		//수학점수(mat), 총점(tot), 평균(avg)
		//결과정보를 문자열로 만들어서 리턴
		String name = "강용범";
		int kor = 80;
		int eng = 75;
		int mat = 95;
		int tot = kor+eng+mat;
		int avg = tot/3;
		
		String exam = "[이름 : " + name + ", 국어 : " + kor
							+ "점, 영어 :" + eng + "점, 수학 : " + mat 
							+ "점, 총점 : " + tot + "점, 평균 : " + avg + "점 ]";
		return exam;
		
	}
	
	//java.util.Scanner 사용 테스트용
	@SuppressWarnings("resource")
	public void testSanner() {
		//키보드와 연결된 Sanner 객체 생성
		//키보드 : java.lang.System static field : in
		//static 필드 사용 : 클래스명.필드명
		Scanner sc = new Scanner(System.in);
		//System.in = public static final InputStream in
		System.out.print("이름을 입력하세요. : ");
		//입력전에 출력문구를 안하면 빈화면이 나온다.
		//println는 줄 바꿔서 커서가되고 print 줄바꾸지 않고 옆에서 커서가 나온다.
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("키[소숫점 첫째자리까지] : ");
		double height = sc.nextDouble();
		
		
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("height : " + height);
		
		return;
	}
	
}
