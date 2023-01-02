package logic.controller;

import java.util.Random;
import java.util.Scanner;

public class Function {
	private Scanner sc = new Scanner(System.in);

	// 과제4
	public void calculator() {
		int a1, a2, result = 0;
		char op;

		System.out.println("====계산기======");
		System.out.print("첫번째 정수 : ");
		a1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		a2 = sc.nextInt();

		System.out.print("연산문자(+,-,*,/) : ");
		op = sc.next().charAt(0);

		switch (op) {
		case '+':
			result = a1 + a2;
			break;
		case '-':
			result = a1 - a2;
			break;
		case '*':
			result = a1 * a2;
			break;
		case '/':
			if (a2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				System.out.println("결과값 : " + (result = 0));
				return;
			} else {
				result = a1 / a2;
			}
			break;
		}
		System.out.println(a1 + " " + op + " " + a2 + " = " + result);
	}

	// 과제 5
	public void totalCalculator() {
		System.out.print("첫번째 정수 : ");
		int first = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int second = sc.nextInt();

		int min;
		int max;
		if (first > second) {
			max = first;
			min = second;
		} else {
			max = second;
			min = first;
		}

		int sum = 0;
		for (int k = min; k <= max; k++) {
			sum += k;
		}
		System.out.println(min + "부터 " + max + "까지 정수들의 합계 : " + sum);
	}

	// 문제6
	public void profile() {
		String name, se, cha;
		int age;
		System.out.print("이름을 입력하시오 : ");
		name = sc.next();
		System.out.print("나이을 입력하시오 : ");
		age = sc.nextInt();
		System.out.print("성별 을 입력하시오 : ");
		se = sc.next();
		System.out.print("성격을 입력하시오 : ");
		cha = sc.next();

		System.out.println("이름 : " + name + "\n나이 : " + age + " 세" + "\n성별 : " + se + "\n성격 : " + cha);
	}

	// 과제7
	public void sungjuk() {
		System.out.println("학생 정보 입력하세요.");
		System.out.print("학생이름 : ");
		String a = sc.nextLine();
		System.out.print("학년 : ");
		int b = sc.nextInt();
		System.out.print("반 : ");
		int c = sc.nextInt();
		System.out.print("번호 : ");
		int d = sc.nextInt();
		System.out.print("성별(M:남학생/F:여학생) : ");
		char e = sc.next().toUpperCase().charAt(0);
		System.out.print("성적(소수점 두번째자리까지) : ");
		double f = sc.nextDouble();

		char g = (f >= 90) ? 'A' : ((f >= 80) ? 'B' : ((f >= 70) ? 'C' : ((f >= 60) ? 'D' : 'F')));

		System.out.printf("%s은 %d학년 %d반 %d번 %s 성적이 %.1f이고, %s 학점입니다.", a, b, c, d, ((e == 'M') ? "남학생" : "여학생"), f, g);
	}

	// 과제 8번
	public void printStarNumber() {
		System.out.print("정수 하나 입력 : ");
		int l = sc.nextInt();

		if (l > 0) {
			for (int i = 1; i < 6; i++) {
				for (int j = 1; j < (i + 1); j++) {
					if (i == j) {
						System.out.print(i);
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			System.out.println("================");

		} else {
			System.out.println("정수 입력 : " + l);
			System.out.println("양수가 아닙니다.");
		}
	}

	// 문제9
	public void sumRandomaber() {
		System.out.println("1부터 랜덤 정수까지의 합계");
		int num9 = (int) (Math.random() * 100) + 1;
		System.out.println("1~100 임의 정수 확인 : " + num9);

		int sum9 = 0;
		for (int i = 1; i <= num9; i++) {
			sum9 += i;
		}
		System.out.println("1부터 " + num9 + " 까지의 합은 " + sum9 + " 입니다.");
	}

	// 문제10
	public void continueGugudan() {

		System.out.print("단수: ");
		int a = sc.nextInt();
		int result = 1;

		if (a >= 0) {
			System.out.print("결과에서 제외할 배수: ");
			int su = sc.nextInt();

			for (int b = 1; b <= 9; b++) {
				result = a * b;
				if (result % su != 0) {
					System.out.println(a + " * " + b + " = " + result);
				}

				else {
					continue;
				}
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}
		System.out.println();
	}
//문제 11번
	public void shutNumber() {
		Random rd = new Random();

		do {
			System.out.print("두 주사위 눈의 합 : ");
			int ex = sc.nextInt();
			int num1 = rd.nextInt(6);
			int num2 = rd.nextInt(6);
			int sum = num1 + num2;
			System.out.println("첫번째 주사위 + 두번째 주사위 = 합");
			System.out.println(num1 + " + " + num2 + "  = " + sum);

			if (sum == ex) {
				System.out.println("[맞췄습니다.]");
			} else {
				System.out.println("[틀렸습니다.]");
			}
			char an = 0;
			System.out.print("계속하시겠습니까?(y/n) : ");
			an = sc.next().charAt(0);
			if ((an == 'y') || (an == 'Y')) {
				continue;
			}
			if ((an == 'n') || (an == 'N')) {
				System.out.println("==Game Over==");
				break;
			}
		} while (true);
	}
}
