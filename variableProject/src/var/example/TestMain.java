package var.example;

import var.sample.VariableSample2;

public class TestMain {

		public static void main(String[] args) {
//		String wl = ("7"+7);
//		String sl = 7+7+"7";
//		System.out.println(wl);
//		System.out.println(sl);
		
		//Example exam = new Example();
		//exam.example1();
		//exam.example2();
		//exam.example3();
		
//		int score = 100;
//		final int MAX = 200;
//		//final 값은 한번 정하면 변경이 불가능하다.
//		
//		System.out.println("score : " + score);
//		System.out.println("MAX : " + MAX);
//		
//		score = 90;
//		//MAX = 300;  //상수는 값 변경 불가능
//		System.out.println("score : " + score);
		
//		int decimal = 20;
//		int octal = 0011; //숫자 앞에 0붙이면 8진수를 뜻함
//		int hexDecimal = 0x011; //숫자 앞에 0x(0X)를 붙이면 16진수
//		
//		System.out.println(decimal);
//		System.out.println("8진수 : "+octal);
//		System.out.println("16진수 : "+hexDecimal);
//		System.out.printf("20 : %d, %o, %x\n",decimal, decimal, decimal);
		//%d ,%o 8진수, %x 16진수, \n 줄바꿈
		//실제 기록되는건 2진수이다.
		//진수는 정수에만 쓸수있다 실수는 불가능하다.
			
			//-정수 변수값 오버플로우 테스트용 메소드
			VariableSample2 samp2 = new VariableSample2();
//			samp2.valueOverflow();
//			samp2.testCasting();
//			samp2.testCasting2();
			samp2.charCasting();
			samp2.charCasting2();
			
	}
	//char 사용시 유니코드일경우 '' 사용가능 
	// \b =  backspace키
	//0x 16진수
	//0 8진수
	//...가변매개변수
	
	

}