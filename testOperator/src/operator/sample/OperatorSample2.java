package operator.sample;

import java.util.Scanner;

public class OperatorSample2 {
	// 연산자는 1 ~ 15등급 구분됨.
	// 종류는 최우선, 단항, 이항, 삼항, 대입, 나열연산자로 분류됨.
	// 이항연산자가 세분화됭어서 쉬프트, 비교, 논리연산자로 나뉨.

	// 산술연산자 : +, -, *, /(몫), %(나머지, mod)
	// 3순위 : *, /, %
	// 4순위 : +, -
	public void testOperator1() {
		int num = 120;
		int div = 7;

		System.out.println("결과 1 : " + (num + 2 * div));
		System.out.println("결과 2 : " + ((num + 2) * div));
		System.out.println("120/7 몫 : " + (num / div));
		System.out.println("120/7 나머지 : " + (num % div));

	}

	public void testDimension() {
		float pi = (float) Math.PI;

		System.out.println("pi : " + pi);

		// 소수점아래 셋째자리까지로 변경 : 10의 3제곱 == 1000
		float result = (int) (pi * 1000) / 1000f;
		System.out.println("result : " + result);

		// 소수점아래 둘째자리까지로 변경 : 10의 2제곱 == 100
		result = (int) (pi * 100) / 100f;
		System.out.println("result : " + result);

		// java.lang.Math 가 제공하는 round() 메소드 사용
		// 소수점 아래 첫째자리 값이 5이상이면 자동 반올림하면서
		// 정수를 리턴하는 메소드

		System.out.println("pi : " + (Math.round(pi * 1000) / 1000f));
	}

	// 순수대입연산자 : 오른쪽에서 왼쪽으로 진행
	// 변수 = 값; 또는 변수 = 계산식;
	// 변수 = 레퍼런스.메소드(); --> 리턴값 있는 메소드만 사용가능
	// 메소드가 리턴하는 값을 변수에 대입함

	public void testSubst() {
		int x = 12, y, z;
		z = y = x; // y = x; -> z = y;

		int sum = x + y + z;

		System.out.println(x + " + " + y + " + " + z + "= " + sum);
	}

	// 복합대입연산자(14순위) : 다른 연산자와 대입연산자를 합친것
	// 산술 대입, 쉬프트대입, 비트논리대입
	// = 은 오른쪽에 위치함 : 연산자 =
	// 산술대입연산자 : +=, -+, *=, /+, %=
	// 쉬프트대입연산자 : <<=, >>=, >>>=
	// 비트논리대입연산자 : &=, ^=, |=
	// 메모리 변수에 직접 연산하는 방식임 : 처리 속도가 빠름(권장)
	public void testComlexSubst() {
		int num = 10;
		System.out.println("num : " + num); // 10

		// 1증가 : ++
		num++;
		System.out.println("num : " + num); // 11

		// 3증자 : += 3
		num += 3; // num = num+3;
		System.out.println("num : " + num); // 14

		// 1감소 : --
		num--;
		System.out.println("num : " + num); // 13

		// 2감소 : -= 2
		num -= 2; // num = num-2;
		System.out.println("num : " + num); // 11

		// 4배증가 : *= 4
		num *= 4; // num = num*4;
		System.out.println("num : " + num); // 44

		// 4배감소 : /= 4
		num /= 4; // num = num/4;
		System.out.println("num : " + num); // 11
		}
	//비교 연산자 테스트
	//두 값의 대소차이를 비교해서 true | false 의 결과를 만듦
	//6순위 : > (크냐, 초과), < (작으냐, 미만)
	//			>= (크거나 같으냐,이상), <=(작거나 같으냐,이하)
	//7순위 : ==(같으냐), !=(같지 않느냐)
	//자바느 이름에 한글 사용 가능함 : unicode 문자셋 사용
	public void 비교연산자테스트() {
		int first, second;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번재 정수 : ");
		first = sc.nextInt();
		System.out.print("두번째 정수 : ");
		second = sc.nextInt();
		
		//%d = 10진 정수
		System.out.printf("%d는 %d보다 크냐? %b \n",
									first, second, (first > second));
		System.out.printf("%d는 %d보다 작으냐? %b \n",
				first, second, (first < second));
		System.out.printf("%d는 %d보다 크거나 같으냐? %b \n",
				first, second, (first >= second));
		System.out.printf("%d는 %d보다 작거나 같으냐? %b \n",
				first, second, (first <= second));
		System.out.printf("%d는 %d보다 같으냐? %b \n",
				first, second, (first == second));
		System.out.printf("%d는 %d보다 같지 않으냐? %b \n",
				first, second, (first != second));
		}
	
	//일반논리연산자
	//논리값 true | false 를 가지고 논리 연산을 함
	//11순위 : &&(그리고, ~면서)
	//				-> 여러 조건을 모두 만족하는지 확인 할때 주로 사용
	//12순위 : ||(또는, ~거나)
	//				-> 여러 조건 중 하나라도 맞는게 있는지 확인할 때 사용
	public void 일반논리연산자테스트() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("컴퓨터 활용능력 점수 : ");
		int comp = sc.nextInt();
		System.out.print("데이터베이스 활용 점수 : ");
		int db = sc.nextInt();
		System.out.print("네트워크 : ");
		int netw = sc.nextInt();
		
		int average = (comp + db + netw)/ 3;
		
//		String result = (comp >= 40 && db >= 40 && 
//								netw >= 40 && average >=60)? "합격" :"불합격";
		String result = (comp >= 40 & db >= 40 & 
				netw >= 40 & average >=60)? "합격" :"불합격";
		System.out.println(result);
		
		System.out.print("재응시 하시겠습니까?[y/n]");
		char answer = sc.next().charAt(0);
		
//		String aresult = (answer == 'Y' || answer == 'y')? 
//				"재응시함": "응시 안 함";
		String aresult = (answer == 'Y' || answer == 'y')? 
				"재응시함": "응시 안 함";
		System.out.println(aresult);
	}
	//일반논리연산자의 성질 확인
	//&& : 앞이 false 이면 뒤를 실행 안함
	//|| : 앞이 true 이면 뒤를 실행 안 함
	//비트논리 &, | 는 연산 생략 기능이 없음
	public void 논리연산자성질확인() {
		//값의 범위를 검사할 때 && 사용함
		//수학표현 : 비교값1 <= 변수 <= 비교값2
		//코딩표현 : 변수 >= 비교값1 && 변수 <= 비교값2
		
		//입력된 정수가 반드시 1부터 100사이의 값이어야한다면
		System.out.print("정수 하나 입력 : ");
		int num = new Scanner(System.in).nextInt();
		
		if(num >=1 && num++ <= 100) {
			
			System.out.println(num + "은 범위 안의 값이다.");
			
		}
		else {
			System.out.println("1~100사의 값이 아닙니다.");
		}
		
		System.out.println("num : " + num);
	}
}
