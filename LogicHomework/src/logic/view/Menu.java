package logic.view;

import java.util.Scanner;

import logic.controller.Function;

public class Menu {
	public void displayMenu(){
		
		Scanner sc = new Scanner(System.in);
		int no;
		
		Function fun = new Function();
		
		do {
			System.out.println("*** 지역변수/연산자/제어문 연습 프로그램 ***\n");
			System.out.println("1. 간단 계산기");
			System.out.println("2. 작은수에서 큰수까지 합계구하기");
			System.out.println("3. 신상정보 확인하기");
			System.out.println("4. 학생정보 확인하기");
			System.out.println("5. 별과 숫자 출력하기");
			System.out.println("6. 난수까지의 합게 구하기");
			System.out.println("7. 구구단");
			System.out.println("8. 주사위 숫자 알아맞추기 게임");
			
			System.out.println("9. 프로그램 종료");
			
			System.out.print("메뉴 번호 입력 : ");
			no = sc.nextInt();
			switch(no){
				case 1: fun.calculator(); break;
				case 2: fun.totalCalculator(); break;
				case 3: fun.profile(); break;
				case 4: fun.sungjuk(); break;
				case 5: fun.printStarNumber(); break;
				case 6: fun.sumRandomaber(); break;
				case 7: fun.continueGugudan(); break;
				case 8: fun.shutNumber(); break;
				case 9:  System.out.println("===========프로그램 종료==========");
					break;
			}
			System.out.println("--------------------------------------------------------");
		}while(true);	
	}
}
