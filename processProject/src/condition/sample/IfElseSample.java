package condition.sample;

import java.util.Scanner;

/**
 * if~else문 : true일때와 false일때의 2가지 동작처리를 준비하는 구문임 if(조건표현식){ => 조건식은 반드시 결과가
 * true|false가 나오게 작성 true일때 작동할 구문들 }else{ false일때 작동할 구문들 }
 */
public class IfElseSample {
	// 정수를 하나 입력받아, 짝수이면 "작수다" 출력하고
	// 짝수가 아니면(홀수이면) "홀수다" 출력
	public void ifElseMethod1() {
		System.out.print("정수 하나 입력 : ");
		int num = new Scanner(System.in).nextInt();

		// 짝수의 조건 : 2의 배수임
		// 2로 나눈 나머지가 0인 수
//		if(num % 2 == 0) {
//			System.out.println(num + " is even.(짝수다)");
//		}else {
//			//else는 제시된 if 조건의 반대의 뜻을 가짐
//			System.out.println(num + " is odd.(홀수다)");
//		}	

		// 실행구문이 1개일 때는 블럭{} 생략해도됨(권장하지 않음)
		if (num % 2 == 0)
			System.out.println(num + " is even.(짝수다)");
		else // else는 제시된 if 조건의 반대의 뜻을 가짐
			System.out.println(num + " is odd.(홀수다)");
	}

	// 정수형으로 국어, 영어, 수학 점수를 입력받아
	// 총점과 평균을 계산하고
	// 각 과목의 점수가 각각 40점 이상이고, 평균이 60점이면
	// "합격"을 출력하고, 아니면 "불합격" 출력
	public void ifElseMethod2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int mat = sc.nextInt();

		int tot = kor + eng + mat;
		int avg = tot / 3;

		System.out.println(
				"국어 : " + kor + "점, 영어 : " + eng + "점, 수학 : " + mat + "점, 총점 : " + tot + "점, 평균 : " + avg + "점");

		if (kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60)
			System.out.println("합격");
		else // else는 제시된 if 조건의 반대의 뜻을 가짐
			System.out.println("불합격");
	}

	// 두 개의 정수를 입력받아, 두 수 모두 양수일때만
	// 두 수의 합, 차, 곱, 몫 나머지를 계산해서 출력
	// "양수가 아닌 값은 계산할 수 없습니다." 출력
	public void ifElseMethod3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();

		if (num1 > 0 && num2 > 0) {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
		} else {
			// else는 제시된 if 조건의 반대의 뜻을 가짐
			System.out.println("양수가 아닌 값은 계산할 수 없습니다.");
		}
	}

	// 정수 두 개와 연산문자('+', '-', '*','/', '%')를 하나 입력받고
	// 두 정수는 반드시 1~100사이의 값이어야 함
	// 두 수중 하나라도 범위를 벗어난 값이면
	// "계산할 숫자는 반드시 1~100사이의 값이어야 합니다." 출력
	// 두 수가 범위 안의 값이면
	// 입력된 문자가 '+' 이면 두 수의 합을 계산 출력함
	// 입력된 문자가 '-' 이면 두 수의 차을 계산 출력함
	// 입력된 문자가 '*' 이면 두 수의 곱을 계산 출력함
	// 입력된 문자가 '/' 이면 두 수의 나누기한 몫을 계산 출력함
	// 입력된 문자가 '%' 이면 두 수의 나누기한 나머지를 계산 출력함
	public void ifElseMethod4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.print("연산문자(+,-,*,/,%) : ");
		char op = sc.next().charAt(0);

		if ((num1 >= 1 && num1 <= 100) && (num2 >= 1 && num2 <= 100)) {
			if (op == '+') {
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			}
			if (op == '-') {
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			}
			if (op == '*') {
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			}
			if (op == '/') {
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			}
			if (op == '%') {
				System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
			}
		} else {
			System.out.println("계산할 숫자는 반드시 1~100사이의 값이어야 합니다.");
		}
	}

	// 나눌값(num)과 나눌수(div)를 입력받아서
	// num / div 한 결과를 출력되게 함
	// 단, 나눌수(div)는 0이 아니어야 함
	// 나눌 수가 0이면, "0으로 나눌 수 없습니다." 출력 (컴퓨터는 0을 못나눈다.에러)
	public void ifElseMethod5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int num = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int div = sc.nextInt();

		if (div != 0) {
			System.out.println(num + " / " + div + " = " + (num / div));
		} else {
			System.out.println("0으로 나눌 수 없습니다.");
		}

	}
	// 정수 두개를 입력받아서 나누기한 결과를 출력(몫, 나머지)
	// 두 정수 중에서 큰 값을 나눌값으로, 작은 값을 나눌수로 사용함
	// 작은값(나눌수, div)는 0이 아니어야 함
	// 0이면, "0으로 나눌 수 없습니다." 출력

	public void ifElseMethod6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int first = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int second = sc.nextInt();

		int num, div;

		if (first > second) {
			num = first;
			div = second;
		} else {
			num = second;
			div = first;
			System.out.println("0으로 나눌 수 없습니다.");
		}
		if (div != 0) {
			System.out.println(num + " / " + div + " = " + (num / div));
			System.out.println(num + " % " + div + " = " + (num % div));
		} else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
}
