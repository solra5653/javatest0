package var.sample;

import java.util.Scanner;

public class VariableSample2 {
	//Method(멤버함수) 작성형식 :
	//접근제한자[예약어(예약어는 특별한경우)] 반환자료형 메소드명([자료형 매개변수명])
	
	//정수 변수값 오버플로우 테스트용 메소드
//	public void valueOverflow() {
//		byte bnum; //1byte 크기의 변수공간을 메모리에 할당함
//		//1byte(8bit) : bit 0 | 1을 8개 기록함
//		//정수 : 음수, 0, 양수로 구성됨
//		//byte 자료형의 값의 범위 : -128 ~ 127
//		
//		bnum = 128;		 //error 범위 초과로인한 error
	

		
//	}

	
	//형변환 테스트
	//값의 자료형을 바꾸는것을 형변환
	//컴퓨터의 계산원칙이 지켜지지 않을때 형변환이 발생.
	public void testCasting() {
		//자동형변환 : 자료형이 다른값이 대입될때
		//		작은 크기의 자료형 값이 큰 크기의 변수에 대입될 때
		//원칙 1 : 같은 종류끼리만 대입할 수 있다.
		int num = 'A'; //int <- char >> int 로 바뀜
		//문자의 유니코드(unicode) 값으로 변환되서 대입됨.
		System.out.println("num : " + num);
		
		//자동형변환 : 자료형이 다른 값들이 섞여서 계산될 때
		//원칙 2 : 같은 종류끼리만 계산할 수 있다.
		//메모리 할당크기가 큰 자료형으로 자동형변환됨
		//주의 : 정수와 실수간의 연산에서는 실수형으로 형변환됨
		double result = 3 + 2.5 *7;
		//int + double *int => 3.0 + 2.5 * 7.0 바뀜
		//	double + double *double => double 처리가됨
		System.out.println("result : " +result);
		
		//강제형변환(명시적 형변환)이 필요한 경우
		//경우 1 : 크기가 큰 자료형 값을 크기가 작은 변수에 대입시
		//cast 연산자 사용 : (바꿀자료형)값 | (바꿀자료형)변수
		int k = (int)35.7;
		//int(4byte) <- double(8byte) =>>int로 타입변환을 명시한다.
		System.out.println("k : "+k);
		
		//경우 2 : 계산의 결과가 같은 종류가 아닐 때 형변환 필요
		//원칙 3 : 계산의 결과도 같은 종류여야 함
		int value = 2147483647;
		System.out.println("value : " + value);
		
//		long result2 = value + value; //int+int 로 인한 overflow인하여 long를 대입하여서 -2로 출력이된다
		long result2 = (long)value + value;
		System.out.println("result2 : " +result2);

//		return; //void 이여서 자동 return 생략
		
	}
	
	public void testCasting2() {
		//자바는 byre, short 자료형 값 계산의 결과형을
		//무조건 int 로 처리함
		byte b1 = 10;
		byte b2 = 20;
//		byte b3 = b1 + b2; //error : 결과값이 int 임
		//byte(1byte) <- int(4byte)
		
		//해결 1: 
		int result1 = b1 +b2;
		//해결 2 : 형변환 처리
		byte b3 = (byte)(b1 + b2);
		
		
		short s1 = 11;
		short s2 = 22;
		
//		short s3 = s1 + s2; //error : 결과형 int임
		//short(2byte) <- int(4byte)
		
		//해결
		int result2 = s1 + s2;
		short s3 = (short)(s1 + s2);
		
//		short ss = b1 + s1; //error : 결과형은 int 임
		int result3 = b1 + s1;
		
		System.out.println(b3+", " + result1);
		System.out.println(s3+", " + result2);
		System.out.println(result3);
		
	}
	
	@SuppressWarnings("resource")
	public void charCasting() {
		//문자와 정수간의 형변화은 char <=> int 만 가능함
		System.out.print("문자 하나 입력 : ");
		char ch = new Scanner(System.in).next().charAt(0);
		System.out.println(ch + " is unicode " +  (int)ch);
		
	}
	@SuppressWarnings("resource")
	public void charCasting2() {
		
		System.out.print("정수 하나 입력 : ");
		int unicode = new Scanner(System.in).nextInt();
		System.out.println("유니코드" + unicode + " => " + (char)unicode);
		}
	
	//자바에서는 기본자료형(8개)에 대한 대한 클래스를 제공함
	//기본자료형 클래스를 래퍼 (Wrapper)클래스라고함
	//Wrapper class : 기본자료형 값에 캡휼화 처리가 목적임
	//Boxing : data --> enCapsulation(캡슐화) : object 객체 -> (데이타를 객체로 바꾸는 작업)
	//UnBoxing : object
	//자바가 제공하는 클래스의 메소드들 중에 객체만 취급하는 
	//메소드를 사용할때 Wrapper class의 메소드 이용하면 됨
	public void testWrapper() {
		//각 자료형의 메모리 할당크기(BYTES), 기록 비트수(SIZE),
		//최대값(MAX_VALUE), 최소값(MIN_VALUE) 등
		//상수 필드가 제공됨
		int num = 123;		//값 기록
		//값 --> 객체로 바꿔야 할 경우
		//Integer iob = new Integer(num);
		//deprecated : 버전업 되면서 사용하지 말라는 뜻임
		Integer iob = Integer.valueOf(num);
		//글꼴이 기울려진것은 static 이여서 기울여진다.
		
		double dnum = 45.6;  //값
		//값 --> 객체로 변환
		//Double dob = new Double(dnum);
		Double dob = Double.valueOf(dnum);
		
		System.out.println(num + ", " + iob.toString());
		//.toString 은 원하는 값을 출력할때
		System.out.println(dnum + ", " + dob.toString());
	}
}
