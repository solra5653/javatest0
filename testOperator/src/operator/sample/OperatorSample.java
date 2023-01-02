package operator.sample;

import java.util.Scanner;

/**
 * 자바가 제공하는 연산자 사용 확인용 클래스이다.
 * created by 2002-12-23
 * developer : 강용범
 * 자바가 제공하는 45개의 연산자를 확인하기 위한 메소드를 제공한다.
 */

public class OperatorSample {
	/**
	 * 변수의 초기화 테스트
	 * 변수의 초기화란, 변수 선언과 동시에 초기값 기록하는 것
	 * 구문 :
	 * 		자료형 변수명 = 초기값;
	 */
	public void initVariable() {
		//사번(문자열), 직원이름(문자열), 급여정보(정수),
		//보너스포인트(실수), 결혼여부(문자)에 변수 초기화
		
		String empId = "E123";
		String empName = "홍길동";
		int salary = 4800000;
		double bonusPct = 0.2;
		char marriage = 'Y';
		
		System.out.println("직원정보 [ " + empId +", "
									+ empName +", "+ salary +", "
									+ bonusPct +", " +marriage +" ]");
	}
	
	/**
	 * 키보드로 값을 입력받아, 변수 초기화 처리
	 * 사번, 이름, 급여, 보너스포인트, 결혼여부를 키보드로 입력 받아
	 * 변수 초기화 처리 테스트
	 * 보너스포인트가 적용된 연봉을 계산해서 출력 처리 추가함
	 */
	public void initInputVariable() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("직원 정보를 입력하세요. ");
		System.out.print("사번 : ");
		String empld = sc.next();
		System.out.print("이름 : ");
		String empName = sc.next();
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		System.out.print("보너스 포인트 : ");
		double bonusPct = sc.nextDouble();
		System.out.print("결혼 여부[기혼:Y / 미혼:N] : ");
		char marriage = sc.next().toUpperCase().charAt(0);
		
		int pay = (int)(salary +(salary * bonusPct) *12);
		
		System.out.println("[직원정보] ");
		System.out.println("사번 : " + empld);
		System.out.println("이름 : "+ empName);
		System.out.println("급여 : "+ salary+ "원");
		System.out.println("보너스 포인트 : "+ bonusPct+ "point");
		System.out.println("결혼 여부[기혼:Y / 미혼:N] : " +marriage);
		System.out.println("연봉 : " + pay + "원");
	}
	
	//15순위 : 나열연산자(,)
	public void testComma() {
		
//		int a = 10;
//		int b; 
//		int c = 30;
		
		//자료형이 같은 변수 여러 개를 한번에 선언할 수 있음
		int a = 10, b, c =30;
		
		//자바에서는 값이 없는 빈 변수는 사용할 수 없음 : 에러
		b = a +c;
		
		System.out.println(a + "\t" + b + "\t" + c);
	}
	
	//최우선연산자(1순위) : (), [], ., ->
	
	public void testLevel1() {
		System.out.println("result1 : " +(10+ 20 * 30));
		System.out.println("result1 : " +((10+ 20) * 30));
	}
	
	//단항연산자(2순위) : 부호(sign), 연산자(+,-)
	//정수를 하나 입력받아서, 양수이면 그대로 출력하고
	//음수이면 양수로 바꿔서 출력
	public void testSign() {
		System.out.print("정수 하나 입력 : ");
		int value = new Scanner(System.in).nextInt();
		
		//삼항 연산자(13순위) : 항몽이 3개
		//결과 값 보관변수 = (조건시)? 참일때 선택할 값: 거짓일때 선택할 값;
		int result = (value > 0)? value: -value;
		System.out.println("value : " +value);
		System.out.println("result : " +result);
			}
	
	//단항연산자 : 논리부정연산자(! : boolean not);
	//놀리값 : true, false 를 반대로 바꾸는 연산자
	//이항연사자 : 비교연산자(>, >=, <, <=, ==, !=)
	//					결과가 true | false 임
	public void testBooleanNot() {
		int first = 10, second = 20;
		
		System.out.println(first + " > " + second + " : "
									+ (first > second) ); //false
		System.out.println("!("+first + " > " + second + ") : "
									+ !(first > second) ); //true
		System.out.println(first + " < " + second + " : "
									+ (first < second) ); //true
		System.out.println("!("+first + " < " + second + ") : "
									+ !(first < second) ); //false
		System.out.println(first + " == " + second + " : "
									+ (first == second) ); //false
		System.out.println("!("+first + " == " + second + ") : "
				+ !(first == second)); //true
	}
	
	//단항연산자 : 증감연산자(++: 1증가, --:1감소)
	public void testIncDec() {
		int num = 12;
		System.out.println("num : " + num); //12
		
		// 증감연산자가 변수와 함께 단독사용시에는
		// 변수 앞/뒤 위치 구분 안함
		// 변수++; == ++변수; 1증가
		// 변수--; == --변수; 1증가
		num++;
		System.out.println("num : " + num); //13
		++num;
		System.out.println("num : " + num); //14
		num--;
		System.out.println("num : " + num); //13
		--num;
		System.out.println("num : " + num); //12
		
		//증감구문이 다른 계산식이나 다른 구문의 일부로 사용되면
		//증감연산자의 위치를 구분해야됨
		//부분 사용시, 변수 뒤에 위치하면 연산 후 증감을 뜻함
		//부분 사용시, 변수 앞에 위치하면 증감후 연산을 뜻함
		int result = 3 + num++ * 2;
		//계산하고 대입한 다음에 1증감한다(처리 후 증가)
		//12 * 2 > 24+3 > 27 -> result 에 대입
		//그 다음에 num이 1 증가됨
		System.out.println("result : " + result); // 27
		System.out.println("num : " + num); //13
		
		System.out.println("num : " + num++); //14
		//출력하고 난 다음에 1증가 (처리 후 증가)
		
		result = ++num + 5; //15+5
		//num을 1증가시키고 연산함
		System.out.println("result : " + result); //20
		System.out.println("num : " + num); // 15
		
		System.out.println("num : " + ++num); //16		
	}
	
	//이항연산자 : 산술연산자 (+, -, *, /(몫), %(나머지, mod))
	//3순위 : *, /, %
	//4순위 : +, -
	public void Operataor1() {
		int num = 123;
		int div = 7;
		
		System.out.println("123 / 7 몫 : " + (num / div));
		System.out.println("123 / 7 나머지 : " + (num % div));
	}
	
	//순수대입연산자 : 오른쪽에서 왼쪽으로 진행
	//변수 = 값 또는 변수 = 계산식
	
	public void testSubst() {
		int x = 12, y, z;
		
		z = y = x;
//		(12)<-(12)<-12
		int sum = x + y + z;
		
		System.out.println(x + ", " + y + ", " + z);
		System.out.println("sum =" + sum);
	}
}
