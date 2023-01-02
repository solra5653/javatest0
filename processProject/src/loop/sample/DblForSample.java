package loop.sample;

import java.util.Scanner;

/**
 * 이중 for문 테스트용 클래스 : 반복 내용이 다시 반복이 되는 경우 for(초기식; 조건식; 증감식){ 반복시킬 내용 => for(){}
 * }
 *
 */
public class DblForSample {

	public void testDoubleFor() {
		// 콘솔 뷰에 '*' 문자 하나 출력
//		System.out.println("*");
		// 콘솔뷰에 ******* 7개 출력
//		System.out.println("*");
//		System.out.println("*");
//		System.out.println("*");
//		System.out.println("*");
//		System.out.println("*");
//		System.out.println("*");
//		System.out.println("*");

		// 반복문 사용
//		for (int k = 1; k <8; k++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
		/*
		 * 한줄에 * 7개 출력을 5줄로 출력되게 한다면 ******* ******* ******* ******* *******
		 */

		// 한 줄 씩 출력하는 반복문을 5번 반복 사용에 대해
		// 반복문으로 처리함
//		for(int n= 1; n<6; n++) {
//			for (int k = 1; k <8; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// 트리
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 7 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		// 반쪽 트리
//		for (int k = 1; k <8; k++) {
//			for (int j = 0; j <k; j++) {
//			System.out.print("*");
//			}
//			System.out.println();
//		}
//}

	}

	// 구구단 2단부터 9단까지의 출력
	public void gugudan() {
		for (int dan = 2; dan < 10; dan++) {
			for (int su = 1; su < 10; su++) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			System.out.println("========================");
		}
	}
	
	/**
	 * 1부터 5까지 정수를 하나씩 가로로 출력
	 * 12345
	 * 12345
	 * 12345
	 * 12345
	 * 12345
	 */
	public void printNumbers() {
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.print(j);
			}
			System.out.println();
		}	
	}
	/**
	 * 1부터 5까지 정수를 하나씩 가로로 출력
	 * 한줄 출력하고 그다음 출력때 +1증가하여 출력
	 * 12345
	 * 23456
	 * 34567
	 * 45678
	 * 56789
	 * 
	 */
	public void printNumbers2() {
		for (int i = 1; i < 6; i++) {
			for (int j = i; j < (i+5); j++) {
				System.out.print(j);
			}
			System.out.println();
		}	
	}
	
	public void printNumberStar() {
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				if( i == j) {System.out.print(i);
			}else {
				System.out.print("*");
			}
		}
			System.out.println();
		}
	}

/*	1
*	*2
*	**3
*	***4
*	****5
*/
	public void printNumberStar2() {
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < (i+1); j++) {
				if( i == j) {
					System.out.print(i);
			}else {
				System.out.print("*");
			}

		}
			System.out.println();
		}
	}
	
	/**정수를 하나 입력 받아, 그 수가 양수일대만
	 * 입력된 수를 줄수와 칸수로 적용해서 아래와 같이 출력 처리
	 * 음수 또는 0이 입력되면 "양수만 입력하세요"출력
	 */
	public void printStar() {
		System.out.print("줄수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		if(line > 0) {
			for(int i=1; i<line; i++) {
				for(int k =1; k<line; k++) {
					if( i>k) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
			}
				System.out.println();
			}
		}else {
				System.out.print("양수만 입력하세요");
			}		
	}
}
