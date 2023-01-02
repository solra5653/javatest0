package condition.sample;

import java.util.Scanner;

/**
 * switch 문 (선택문) : if 문으로 변경 가능함
 * switch(true, false 의 결과가 나오는 조건식 사용못함) = 에러나옴
 * 값이 뭐냐? 라는 표현임 => 변수 == 값 과 같음
 * switch(변수 또는 계산식){
 * case 제시값1: 제시값이 맞으면 실행할 구문들;
 * 						break; => 반드시 기록함(switch 문 끝냄)
 * case 제시값2: 실행구문; break;
 * case 제시값3: 실행구문; break;
 * ..........
 * defalut: 실행구문; =>위에 제시된 값이 모두 아닐 때 실행
 * 				생략할수 있음
 * 
 *} => switch 문은 블럭{} 생략 못함. 무조건 넣어야함
 *
 */
public class SwitchSample {
	
	//정수형으로 번호를 입력받아, 번호에 따라 인사말이 선택되어 출력
	public void greetings() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호 선택(1, 2, 3) : ");
		int no = sc.nextInt();
		
		String message = null;
		switch(no) {
		case 1: message = "안녕하세요."; break;//no ==1
		case 2: message = "환영합니다."; break;
		case 3: message = "어서오세요."; break;
		default: message = "안녕히 가세요."; //else 같은 의미
		}
		System.out.println(no + " : " + message);
	}
	public void greetings2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호 선택(1, 2, 3) : ");
		int no = sc.nextInt();
		
		String message = null;
//		switch(no) {
//		case 1: message = "안녕하세요."; break;//no ==1
//		case 2: message = "환영합니다."; break;
//		case 3: message = "어서오세요."; break;
//		default: message = "안녕히 가세요."; //else 같은 의미
//		}
		
		if(no == 1) {
			System.out.println(message = "안녕하세요.");
		}else if(no == 2) {
			System.out.println(message = "환영합니다.");
		}else if(no == 2) {
			System.out.println(message = "어서오세요.");
		}else {
			System.out.println(message = "안녕히 가세요.");
		}
		System.out.println(no + " : " + message);
	}
	
	//정수 두개와 연산문자(+,-,*,/,%)를 입력 받아
	//연산문자에 따라 두 정수의 산술연산을 계산해서 출력
	//입력 예:
	//첫번째 정수 : 25
	//두번째 정수 : 7
	//연산문자(+,-,*,/,%) : +
	//출력 예 : 
	//25 + 7 = 32
	public void calculator() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int no1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int no2 = sc.nextInt();
		System.out.print("연산문자(+,-,*,/,%) : ");
		char no3 = sc.next().charAt(0);
		
		int result = 0;
		switch(no3) {
					case '+' : result = no1 + no2; break;
					case '-' : result = no1 - no2; break;
					case '*' : result = no1 * no2; break;
					case '/' : result = no1 / no2; break;
					case '%' : result = no1 % no2; break;
					default: 
					System.out.println("연산문자가 잘못 입력되었습니다.");
					System.out.println("확인하고 다시 진행하세요.");
					return;
		}
		
		System.out.println(no1 + " " + no3 +" "+ no2 +" = "+ (result));
		return;
	
	}
	//과일명(String)과 수량(int)을 입력받아, 구매 가격을 계산 출력
	//과일의 단가(가격) 변수 : int price = 0;
	//사과 : 1200, 배 : 2500, 포도 : 5000
	//오렌지 : 700, 키위 : 500
	//그 외의 과일은 "제품이 품절되었습니다." 출력 처리
	//출력 예시 :
	//사과 : 1200원 * 3개 => 가격 : 3600원
	public void fruitSale() {
		
		//jdk 7부터 case 에 문자열 값 사용할 수 있음
		
		Scanner sc = new Scanner(System.in);
		System.out.print("과일 명을 입력하세요. ");
		String name = sc.nextLine();
		System.out.print("수량을 입력하세요. ");
		int b = sc.nextInt();
		
		int price = 0;
		
		switch(name) {
		case  "사과" : price = 1200; break;
		case "배" : price = 2500; break;
		case "포도" : price = 5000; break;
		case "오렌지" : price = 700; break;
		case "키위" : price = 500; break;
		default: 
			System.out.println("제품이 없거나 품절되었습니다.");
		}
		
		System.out.println(name+" : " + b + "개 * "
		+ price +"원 => " + (b*price) +"원" );
	} 
public void fruitSale2() {
		
		//jdk 7부터 case 에 문자열 값 사용할 수 있음
		
		Scanner sc = new Scanner(System.in);
		System.out.print("과일 명을 입력하세요. ");
		String name = sc.nextLine();
		System.out.print("수량을 입력하세요. ");
		int b = sc.nextInt();
		
		int price = 0;
		
//		switch(name) {
//		case  "사과" : price = 1200; break;
//		case "배" : price = 2500; break;
//		case "포도" : price = 5000; break;
//		case "오렌지" : price = 700; break;
//		case "키위" : price = 500; break;
//		default: 
//			System.out.println("제품이 없거나 품절되었습니다.");
//		}
		//switch 문을 if 문으로 바꾸기
		if(name.equals("사과")) {
			price = 1200;
			
		}else if(name.equals("배"))
		{
			price = 2500;
		}else if(name.equals("포도"))
		{
			price = 5000;
		}else if(name.equals("오렌지"))
		{
			price = 700;
		}else if(name.equals("키위"))
		{
			price = 500;
		}else
		{
			System.out.println("제품이 없거나 품절되었습니다.");
			return;
		}
		System.out.println(name+" : " + b + "개 * "
		+ price +"원 => " + (b*price) +"원" );
	} 
}
