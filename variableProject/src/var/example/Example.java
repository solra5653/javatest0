package var.example;

import java.util.Scanner;

public class Example {
	public void example1() {
		//연습1
		Scanner exa = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int first = exa.nextInt();
		System.out.print("두번째 정수 : ");
		int second =  exa.nextInt();
		
		System.out.println("더하기 결과 : " +(first+second));
		System.out.println("빼기 결과 : " +(first-second));
		System.out.println("곱하기 결과 : " +(first*second));
		System.out.println("나누기한 몫 : " +(first/second));
		System.out.println("나누기한 나머지 결과 : " +(first%second));
		}
	public void example2() {
		//연습2
		Scanner exa = new Scanner(System.in);
		//메소드는 사용하면 자동 소멸이므로 클래스 추가로 하려면 메소드를 새로 입력
		System.out.print("가로 : ");
		double w = exa.nextDouble();
		System.out.print("세로 : ");
		double h = exa.nextDouble();
		
		double area = w*h;
		double perimeter = (w+h)*2;
		
		System.out.println("면적 : " +area);
		System.out.println("둘레 : " + perimeter);
		}
	public void example3() {
		//연습3
		
		//.substring(0,0) 방식
		/*
		 * Scanner exa = new Scanner(System.in);
		 * System.out.print("문자열을 입력하시오 : ");
		 * String l = exa.nextLine();
		 * 
		 * System.out.println("첫번째 문자 : " + l.substring(0,1));
		 * System.out.println("두번째 문자 : " + l.substring(1,2));
		 * System.out.println("세번째 문자 : " + l.substring(2,3));
		 * System.out.println("네번째 문자 : " + l.substring(3,4));
		 * System.out.println("다번째 문자 : " + l.substring(4,5));
		 */
		
		//.charAt(0) 방식
		System.out.print("문자열을 입력하시오 : ");
		String exa = new Scanner(System.in).next();
		//입력을 한번만 사용할때만 가능한 방법
		
		System.out.println("첫번째 문자 : " + exa.charAt(0));
		System.out.println("두번째 문자 : " + exa.charAt(1));
		System.out.println("셋번째 문자 : " + exa.charAt(2));
		
		}

}
