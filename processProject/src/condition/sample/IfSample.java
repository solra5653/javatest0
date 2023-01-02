package condition.sample;

import java.util.Scanner;

/**
 * 조건문으로 if만 사용하는 테스트용 샘플 클래스 조건을 만족하는(true인 경우) 경우에만 준비된 내용이 실행되게 할 때 사용하는 구문임
 * if(조건표현식) { 조건이 참일 때 실행할 구문들 } ----> 참일 때 실행할 구문이 한 개일때는 생략 가능함[생략을 하지않는걸
 * 권장함]
 *
 */
public class IfSample {
	// 정수 하나를 입력받아서, 양수일 때만 제곱한 값을 출력처리
	// 0이거나 음수일 때는 처리할 내용 없음
	public void ifMethod1() {
		System.out.print("정수 하나 입력 : ");
		int num = new Scanner(System.in).nextInt();

		if (num > 0) {
			// 조건의 결과가 참이면 블럭안의 내용이 작동됨
			System.out.println(num + "의 제곱 : " + (num * num));
			System.out.println(num + "의 제곱 : " + (int) Math.pow(num, 2));
		}
		// return;
	}

	// 문자 하나를 입력 받아서, 영어대문일때만 유니코드가 출력
	public void ifMethod2() {
		System.out.print("문자 하나 입력 : ");
		char ch = new Scanner(System.in).next().charAt(0);

		// if(ch >= 'A'&& ch<= 'Z') {
		if (Character.isUpperCase(ch)) {
			System.out.println(ch + " is uincode : " + (int) ch);
		}
	}

	// 여러 조건별 처리를 if만 사용해서 작성
	public void ifMethod3() {
		Scanner sc = new Scanner(System.in);

		// 회원이면 1, 비회원이면 2를 입력 받도록 처리
		System.out.print("회원이면 1, 비회원이면 2 입력 : ");
		int no = sc.nextInt();

		// if만 사용
		/*
		 * 회원이면 "로그인 할 아이디 : " 출력하고, 아이디 입력받음 "패스워드 : " 출력하고 암호 입력받음 아이드와 암호 출력 확인
		 */
		if (no == 1) {
			System.out.print("로그인할 아이디 : ");
			String userId = sc.next();
			System.out.print("패스워드 : ");
			String passwd = sc.next();

			System.out.println("확인 : " + userId + ", " + passwd);
		}
		/*
		 * 비회원이면 "회원가입 하셔야 합니다." 출력하고, "이름 : " 출력하고, 이름 입력받음 "지정할 아이디 : " 출력하고 아이디 입력 받음
		 * "지정할 패스워드 : " 출력하고 암호 입력 받음 "이메일 : " 출력하고, 이메일 입력 받음 입력받은 값 모두 출력 확인
		 */
		if (no == 2) {
			System.out.println("회원가입 하셔야 합니다.");
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("지정할 로그인할 아이디 : ");
			String userId = sc.next();
			System.out.print("지정할 패스워드 : ");
			String passwd = sc.next();
			System.out.print("이메일 : ");
			String email = sc.next();

			System.out.println("확인 : " + name + ", " + userId + ", " + passwd + ", " + email);
		}
	}
}
