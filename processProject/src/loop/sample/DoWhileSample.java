package loop.sample;

import java.util.Scanner;

import condition.sample.SwitchSample;

/**
 * do ~while 문
 * : 무조건 한번 실행시키고 나서 반복을 결정하는 구조임
 * do{
 * 		반복 실행할 구문들;
 * }while(반복에 대한 조건식);
 * => 마지막 끝부분에 새미콜론(;) 꼭기입해야됨 아하면 에러
 *
 */
public class DoWhileSample {
	
	//문자 입력받아서 유니코드 출력을 반복 처리
	public void printUnicode() {
		Scanner sc = new Scanner(System.in);
		char ch;
		
		do {
			System.out.print("문자입력 : ");
			ch = sc.next().charAt(0);
			// 종료값이 '0'이 입력되면, 유니코드 출력하고 종료됨
			System.out.println(ch + " is unicode " + (int)ch);
		}while(ch != '0');
		System.out.println("=====The End======");
	}
	
	public void printUnicode2() {
		Scanner sc = new Scanner(System.in);
		char ch;
		
		do {
			System.out.print("문자입력 : ");
			ch = sc.next().charAt(0);
			
			if(ch == '0') break;
			// 종료값이 '0'이 입력되면, 유니코드 출력하고 종료됨
			System.out.println(ch + " is unicode " + (int)ch);
		}while(true);
		System.out.println("=====The End======");
	}
	
	public void displayMenu() {
		Scanner sc = new Scanner(System.in);
		int no;
		//ForSample 은 같은 패키여서 () 안씀
		ForSample fsamp = new ForSample();
		WhileSample wsamp = new WhileSample();
		SwitchSample sswitch = new SwitchSample();
		
		do {
			System.out.println("*** 제어문 연습 프로그램 ***\n");
			System.out.println("1. 구구단 출력");
			System.out.println("2. 과일 구매");
			System.out.println("3. 문자열 문자 찾기");
			System.out.println("4. 인사말 고르기");
			System.out.println("9. 끝나기");
			
			System.out.print("번호 선택 : ");
			no = sc.nextInt();
//			if(no ==1) break;
			switch(no){
				case 1: fsamp.printGugudan(); break;
				case 2: sswitch.fruitSale(); break;
				case 3: wsamp.containChar(); break;
				case 4: sswitch.greetings(); break;
				case 9: System.out.println("정말로 끝내시겟습니까?(y/n) : ");
				         char answer = sc.next().toUpperCase().charAt(0);
//				         if(answer == 'y' || answer =='Y') {
				         if(answer == 'Y') {
//				        	 System.exit(0);   //프로그램 강제 종료함
				        	 return;  //실행 위치로 돌아감
				         } else {
				        	 break;
				         }
				default: System.out.println("잘못 입력하셨습니다. ");
				System.out.println("다시 입력하세요. ");
				
			}
		}while(true);
	}
}
