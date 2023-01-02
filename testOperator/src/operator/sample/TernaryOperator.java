package operator.sample;

import java.util.Scanner;

// 삼항연산자 테스트용 클래스
// 13순위 : 항목이 3개인 연산자
// 결과값 보관변수 = (조건표현식)?참일때 선택할 값: 거짓일때 선택할값;
// 메소드((조건식)? 참값 : 거짓값) --> 메소드가 둘 중 하나 값을 사용함.
public class TernaryOperator {
	//키보드로 정수를 하나 입력 받아, 그 수의 절대값을 출력하는 메소드
	//절대값 : 모든 정수의 양수
	public void testAbs() {
		System.out.print("정수 하나 입력 : ");
		int num = new Scanner(System.in).nextInt();
		
		int absNum = (num > 0)? num: -num;
		
		System.out.println(num + "의 절대값 : " + absNum);
		
		//메소드 안에서 삼항연산자 사용한 경우
		System.out.println(num + "의 절대값 : " 
								+ ((num > 0)? num: -num));
	}
	
	//삼항연산자 중첨 사용 가능함
	//(조건식1)? 참값: ((조건식2)? 참값2: ((조건식3)? 참값3:...........))
	//문자 하나를 입력받아 그 문자가 영어 소문자이면 "Lower",
	//소문자가 아니고 대문자이면 "Upper",
	//영문자가 아니고 숫자문자이면 "Number",
	//모두 아니면 "Other" 문자열을 결과변수에 저장하고 출력처리
	public void testNesting() {
		System.out.print("문자 하나를 입력 : ");
		char ch = new Scanner(System.in).next().charAt(0);
		
		//소문자 범위 : 문자 >= 'a'	&&	문자 <= 'z'
		//'a' <= 문자 <= 'z' : 컴퓨터로 표현할 수 없음
		String result = (ch >= 'a' && ch <= 'z')? "Lower" 
				: ((ch >= 'A' && ch <='A')? "Upper"
						: ((ch >= '0' && ch <='9')? "Number": "Other"));
		
		System.out.println(result);
		}

}
