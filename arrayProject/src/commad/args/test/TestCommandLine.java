package commad.args.test;

public class TestCommandLine {

//	public static void main(String[] args) {
//		// 메소드명(자료형 매개변수) { 소스 작성 }
//		// 매개변수(parameter)가 있는 메소드는 사용시
//		// 반드시 매개변수에게 전달할 값을 표기해야 함
//		// 사용 : 레퍼런스.메소드명(전달값);
//		// 전달값(argument) ==전달인자
//		//메소드의 parameter와 사용시의 argument는 반드시
//		//갯수와 자료형이 일치해야 함
//		// 확인
//		new Sample().method(10,20);
//
//		//프로그램 실행시 main 메소드에게도 전달값이 반드시
//		//있어야 함. 
//		//=> 실행시 실행클래스명을 기본 전달 인자로 받음
//		//		이클립스에서 실행클래스명을 배열로 저장하지 않음
//		//		명령프롬프트에서 실행 확인해 보면 알 수 있음.
//		System.out.println("main args : " + args.length);
//		//main 에게 전달온 값 확인
//		for(int i=0; i< args.length; i++) {
//			System.out.println(i + " : " + args[i]);
//		}
//	}
	// 실습문제 3
	public static void main(String[] args) {
		if (args.length == 5) {
			String name = args[0];
			char gender = args[1].charAt(0);
			int age = Integer.parseInt(args[2]);
			double height = Double.parseDouble(args[3]);
			double weight = Double.parseDouble(args[4]);
			System.out.println("이름 : " + name);
			System.out.println("성별 : " + gender);
			System.out.println("나이 : " + age);
			System.out.println("키 : " + height);
			System.out.println("몸무게 : " + weight);

		} else {
			System.out.println("실행시 main 전달인자로 " + "5개를 반드시 입력해야 합니다.");
		}

	}// class closed

//하나의 .java 파일 안에 class 여러 개 작성할 수도 있음
//주의사항 : 파일명으로 사용된 클래스만 public class 임
//				나머지 클래스들은 public 사용 못함
//클래스 작성법 2가지 : 
//public class 클래스명 {} 		
// 			: 패키지 안/밖 어디서나 사용가능함.
//			다른 패키지에서는 import  해서 사용함
//class 클래스명 {}					: 
//		 : default(package private) 클래스라고함.
//			패키지 안에서만 사용가능함. 패키지 밖에서는 사용못함.

//public class Test {}  //에러(public 빼야됨)
	class Test {
	}

	class Sample {
		// 메소드 사용시 정수값 2개를 전달받아서 사용하겠다는 의미임
		public void method(int a, int b) {
			System.out.println(a + "+" + b + "=" + (a + b));
		}
	}
}