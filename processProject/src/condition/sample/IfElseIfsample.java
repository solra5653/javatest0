package condition.sample;

import java.util.Scanner;

/**
 * 다중 if문 테스트 샘플 클래스 else 다음에 if(조건식)을 사용하는 형태임 제시된 조건이 false 일때 또 다른 조건을 제시하는
 * 형태임 if(조건식1){ 조건식1이 true일 때 실행할 구문 }else if(조건식2){ 조건 1이 false이고 조건2가 true일 때
 * 실행할 구문 }........ }else{ 위에 제시된 모든 조건이 false일 때 실행할 구문 }
 */
public class IfElseIfsample {
	// 3개의 정수를 입력 받아서, 세 수 중 가장 큰값을 알아내서 출력
	public void testThreeMax() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int first = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int second = sc.nextInt();
		System.out.print("셋번째 정수 : ");
		int third = sc.nextInt();

		int max; // 가장 큰 값 저장용
		if (first > second && first > third) {
			max = first;
		} else if (second > first && second > third) {
			// else == (second >= first || third >= first)
			max = second;
		} else {
			max = third;
		}
		System.out.println("세 정수의 값중 제일 큰 값은 : " + max);
	}

	// 점수를 정수로 입력 받아,
	// 단, 점수는 반드시 0이상이여야 함
	// 점수가 90점 이상이면 등급을 'A' 대입
	// 점수가 80이상 90점 미만이면 등급을 'B' 대입
	// 점수가 70이상 80점 미만이면 등급을 'C' 대입
	// 점수가 60이상 70점 미만이면 등급을 'D' 대입
	// 점수가 60점 미만이면 등급을 'F' 대입
	// 점수와 등급 출력
	// 점수가 0점 미만면 "잘못 입력하셨습니다." 출력
	public void testScoreGrade() {
		System.out.println("점수를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
		int a = sc.nextInt();

		if (a >= 90) {
			System.out.println("A등급입니다.");
		} else if (a >= 80) {
			System.out.println("B등급입니다.");
		} else if (a >= 70) {
			System.out.println("C등급입니다.");
		} else if (a >= 60) {
			System.out.println("D등급입니다.");
		} else if (a < 60 && a >= 0) {
			System.out.println("F등급입니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	// 문자의 유니코드를 정수 하나 입력받아
	// 정수는 반드시 0 ~ 65535 범위의 값이어야 함
	// 범위를 벗어난 값이면, "0 ~ 65535" 사이의 값만 입력하세요." 출력
	// 지정된 범위안의 정수이면
	// 영어 대문자이면 "Upper"출력하고
	// 영어 소문자이면 "Lower"출력하고
	// 숫자문자이면 "Numeric" 출력하고
	// 가~힝 범위이면 "한글" 출력하고
	// 그 외의 값이면 "Other" 출력
	public void testCharacter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("유니코드(정수)를 입력하시오");

		int i = sc.nextInt();

		if (i >= 0 && i <= 65535) {
			if (i >= 'A' && i <= 'Z') {
				System.out.println("Upper");
			} else if (i >= 'a' && i <= 'z') {
				System.out.println("Lower");
			} else if (i >= 0 && i < 9) {
				System.out.println("Numeric");
			} else if (i >= '가' && i <= '힣') {
				System.out.println("한글");
			} else {
				System.out.println("Other");
			}
		} else {
			System.out.println("0 ~ 65535 사이의 값만 입력하세요.");
		}
	}

	public void testCharacter2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("유니코드(정수) 입력하시오");

		int i = sc.nextInt();

		if (i >= 0 && i <= 65535) {
			if (Character.isUpperCase(i)) {
				System.out.println("Upper");
			} else if (Character.isLowerCase(i)) {
				System.out.println("Lower");
			} else if (i >= 0 && i < 9) {
				System.out.println("Numeric");
			} else if (Character.isLetter(i)) {
				System.out.println("한글");
			} else {
				System.out.println("Other");
			}
		} else {
			System.out.println("0 ~ 65535 사이의 값만 입력하세요.");
		}
	}

	// 정수 입력을 문자입력으로 변경
	public void testCharacter3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 하나 입력하시오");
		char i = sc.next().charAt(0);

		if (i >= 0 && i <= 65535) {
			if (Character.isUpperCase(i)) {
				System.out.println("Upper");
			} else if (Character.isLowerCase(i)) {
				System.out.println("Lower");
			} else if (Character.isDigit(i)) {
				System.out.println("Numeric");
			} else if (this.isKorean(i)) {
				System.out.println("한글");
			} else {
				System.out.println("Other");
			}
		} else {
			System.out.println("0 ~ 65535 사이의 값만 입력하세요.");
		}
	}
	//한글인지 확인하는 메소드
	public boolean isKorean(char ch) {
//		boolean result = false;
//		result = (ch >= '가' && ch <= '힣');
		
//		boolean result = (ch >= '가' && ch <= '힣');

//		return result;
		
		return (ch >= '가' && ch <= '힣');
	}
}
