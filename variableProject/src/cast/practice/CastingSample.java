package cast.practice;

import java.util.Scanner;

public class CastingSample {
	public void printUniCode() {
		System.out.print("문자 입력 : ");
		
		char ch = new Scanner(System.in).next().charAt(0);
		
		System.out.println(ch + " is unicode " + (int)ch);
				}
	
public void calculatorScore() {
	Scanner gg = new Scanner(System.in)
	System.out.print("국어 : ");
	double kor =gg.nextDouble();
	System.out.print("영어 : ");
	double en = gg.nextDouble();
	System.out.print("수학 : ");
	double ma = gg.nextDouble();

	
	System.out.println("총점 : " + (int)(kor+en+ma));
	System.out.println("평균 : " + (int)((kor+en+ma)/3));
}

//실습 3
//정수가 하나 입력 받아,
//그 정수의 2진수 값에서 비트1의 갯수가 몇개인지를 출력함
//(힌트 : java.lang.lnteger 의 메소드를 찾아서 이용함)
public void printBitCount(){
	System.out.print("정수 입력 : ");
	int b = new Scanner(System.in).nextInt();
	
	
	System.out.println(b +"의 2진수에 포함된 1의 갯수 : " + Integer.bitCount(b));
	this.printBit(b); //this표기는 생략가능
	
	
}
//정수 하나를 전달 받아서, 그 수의 메모리에 기록된
//이 진수를 출력하는 메소드

//private void printBit(int n) {
//	System.out.print(n + " : ");
//	for(int i = 31; i >= 0; i--) {
//		//출력할 위치에 비트가 1이면 정수 1로 연산
//		//비트가 0이면 정수 0으로 연산처리
//		System.out.print(n >> i & 1);
//	}
//	System.out.println();
public void testWrapper() {
	//각 자료형의 메모리 할당크기(BYTES), 기록 비트수(SIZE),
	//최대값(MAX_VALUE), 최소값(MIN_VALUE) 등
	//상수 필드가 제공됨
	int num = 123;  //값 기록
	//값 --> 객체로 바꿔야 할 경우
	//Integer iob = new Integer(num);  
	//deprecated : 버전업 되면서 사용하지 말라는 뜻임
	Integer iob = Integer.valueOf(num);
	
	double dnum = 45.6;  //값
	//값 --> 객체로 변환
	//Double dob = new Double(dnum);
	Double dob = Double.valueOf(dnum);
	
	System.out.println(num + ", " + iob.toString());
	System.out.println(dnum + ", " + dob.toString());
	
	//필드나 메소드에 static 이 표시된 경우 사용범은
	//클래스명.필드명, 클래스명.메소드명(...)
	System.out.println("할당 바이트 : " + Integer.BYTES);
	System.out.println("기록비트수 : " + Integer.SIZE);
	System.out.println("최대값 : " + Integer.MAX_VALUE);
	System.out.println("최소값 : " + Integer.MIN_VALUE);
	
	
}
}
}
