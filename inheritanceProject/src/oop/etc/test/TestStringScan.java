package oop.etc.test;

import java.util.Scanner;

public class TestStringScan {
	
	Scanner sc = new Scanner(System.in);
	public void test1() {
		
	System.out.print("문자열 입력 : ");
//	String value = sc.next(); //공백없는 문자열만 읽음.
	//공백이 있는 문자열 입력시, 공백 전 글자만 읽음
	String value = sc.nextLine(); //공백 포함 문자열 읽음
	
	System.out.println("value : " +  value);
	}
	
	public void test2() {
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("메세지 : ");
		//nextLine() : 이전 입력메소드가 남긴 엔터키(unicode:13)를
		//문자열 값으로 읽음 : 입력이 건너뜀
		
		sc.nextLine(); //=> 해결: 입력버퍼(stdin)에 남은 엔터키를 제거함
		String message = sc.nextLine();	
		
		System.out.println(name +", "+ age + ", "+ message);
		
	}
	public static void main(String[] args) {
		// java.util.Scanner 로 문자열 입력 테스트
		// next(), nextLine() 차이점확인
		TestStringScan test = new TestStringScan();
		
		//test.test1();
		test.test2();

	}

}
