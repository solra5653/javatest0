package loop.sample;

import java.util.Scanner;

/**
 * while문 테스트용 클래스 반복할 횟수가 정해지지 않은 반복 실행시 주로 사용 while(반복에 대한 조건식){ --> 조건이 참일 동안
 * 반복 수행됨 반복 수행 할 내용에 대한 구문들; }
 *
 */
public class WhileSample {

	// 키보드로 문자 하나를 입력받아, 그 문자의 유니코드 출력
	// 반복 실행
	// 반복 종류는 '0'입력 되면 종료됨
	public void printUnicod() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자 입력(종료 문자:0) : ");
		char ch = sc.next().charAt(0);

		while (ch != '0') {
			System.out.println(ch + " is unicode " + (int) ch);

			System.out.print("문자 입력(종료 문자:0) : ");
			ch = sc.next().charAt(0);
		}

		System.out.println("====== The End ======");

	}

	// 중복 구문 줄이기
	public void printUnicod2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자 입력(종료 문자:0) : ");
//			char ch = sc.next().charAt(0);
		char ch;
		while ((ch = sc.next().charAt(0)) != '0') {
			System.out.println(ch + " is unicode " + (int) ch);

			System.out.print("문자 입력(종료 문자:0) : ");
//				ch = sc.next().charAt(0);
		}

		System.out.println("====== The End ======");

	}

	// 중복 구문 줄이기2
	public void printUnicod3() {
		Scanner sc = new Scanner(System.in);

		// true를 하면 특정 조건을 주지 않는 이상 무한 루프로 들어간다
		while (true) {
			System.out.print("문자 입력(종료 문자:0) : ");
			char ch = sc.next().charAt(0);

			// 이 if문이 없는경우 무한 루프로 돌아간다
			if (ch == '0') {
				// 반복을 종료시킴
				break;
			}
			System.out.println(ch + " is unicode " + (int) ch);
		}
		System.out.println("====== The End ======");
	}

	// for 문을 while 문으로 바꾸기
	// 1부터 100까지 정수들의 합계 구하기
	public void testWhile1() {
		int sum = 0;

//			for(int n = 1; n <101; n++) {
//				sum += n;
//			}

		int n = 1;
		while (n < 101) {
			sum += n++;
//				n++;
		}
		System.out.println("1부터 100까지 정수들의 합계 : " + sum);
	}

	// while 문을 for 문으로 바꾸기
	public void printUnicod4() {
		Scanner sc = new Scanner(System.in);

//			System.out.print("문자 입력 : ");
//			char ch = sc.next().charAt(0);

//			for( ; ch != '0';) {
//			for( ; true; ) {
		for (;;) { // while(true) 와 같음
			System.out.print("문자 입력 : ");
			char ch = sc.next().charAt(0);

			if (ch == '0') {
				break;
			}

			System.out.println(ch + " is unicode " + (int) ch);

		}

		System.out.println("====== The End ======");
	}

	// 문자열값을 입력 받아서, 글자 갯수 카운트해서 출력하고
	// 영어소문자는 대문자로 바꾸기
	// 문자열 입력 : java
	// 글자 갯수 : 4
	// 반복 내용 : 문자 하나씩 영어소문자인지 확인하고
	// 소문자이면 대문자로 바꾸는 반복되는 구문
	public void strLength() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		String str = sc.next();
		System.out.println("글자갯수 : " + str.length());
		// 글자갯수는 문자열을 문자배열로 바꿔서 확인할 수도 있음
		char[] array = str.toCharArray();
		System.out.println("글자갯수 : " + array.length);

		// 문자열 안의 문자값이 영어소문자인지 확인하고
		// 소문자이면 대문자로 바꾸기

		// String 으로 취급하기
		int index = 0;
		while (index < str.length()) {
			char ch = str.charAt(index);

			if (ch >= 'a' && ch <= 'z') {
				// 'a' : 97, 'A' :65 => 97-65 =>32
				// 소문자는 -32를 하면 대문자로 바뀜
				// String 에는 index 위치의 문자바꾸기 기능(메소드) 없음
				// char[]은 index 위치의 문자 변경 가능함
				array[index] -= 32;
			}
			index++; // 다음 문자칸으로 이동(위에 if문으로 인하여 줄일수 없음)

		}
		System.out.println("before : " + str);
		System.out.println("after : " + String.valueOf(array));

		// char[] (문자배열)로 취급하기

	}

	public void strLength2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		String str = sc.next();
		System.out.println("글자갯수 : " + str.length());
		char[] array = str.toCharArray();
		System.out.println("글자갯수 : " + array.length);

		for (int index = 0; index < str.length(); index++) {

//				char ch = str.charAt(index);
//				if(ch >= 'a' && ch <= 'z') {
			if (Character.isLowerCase(str.charAt(index))) {
				array[index] -= 32;
			}
		}
		System.out.println("before : " + str);
		System.out.println("after : " + String.valueOf(array));
	}

	public void strLength3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		String str = sc.next();
		System.out.println("글자갯수 : " + str.length());
		char[] array = str.toCharArray();
		System.out.println("글자갯수 : " + array.length);
		
		//char[] 을 사용한 경우
		for (int index = 0; index < array.length; index++) {

			if (Character.isLowerCase(array[index])) {
				array[index] -= 32;
			}
		}
		System.out.println("before : " + str);
		System.out.println("after : " + String.valueOf(array));
	}
	
	//문자열 입력 받고, 문자 하나 입력 받아서
	//문자열 안에 입력받은 문자가 몇개 포함되어 있는지 갯수 출력
	//문자열 입력 : apple
	//문자 입력 : p
	//"apple 에 포함된 p의 갯수는 2개" 출력
	//반복내용 : 
	//문자열 안에 포함된 문자 카운트
	public void containChar() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
//		int index = 0, count = 0;
//		while (index <str.length()   ) {
//			
//			index++;
		int count =0;
		for (int index = 0; index <str.length(); index++) {
			if(str.charAt(index)==ch) {
				count++;
			}
		}
		System.out.println("["+str + "]에 포함된 [" + ch + "]문자의 갯수는 [" + count + "]개");
	}
}
