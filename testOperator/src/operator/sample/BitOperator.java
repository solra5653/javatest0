package operator.sample;

//비트연산자 테스트용 클래스
// 비트연산자 : 메모리 기록된 비트값(2진수, bit 0 | bit 1)을
//						계산에 사용하는 연산자임
//2순위 단항 : ~(tield, 비트반전연산자)
//5순위 이항 : <<, >>, >>> (shift, 비트자리이동연산자)
//비트논리연산자 : &(and, 8순위), ^(xor, 9순위), |(or, 10순위)
public class BitOperator {
	// 메모리의 기록된 자리별 비트를 출력하는 메소드
	// 비트 1은 정수 1로, 비트 0은 정수 0으로 출력
	public void printBit(int num) {
		System.out.print(num + " : ");

		for (int pos = 31; pos >= 0; pos--) {
			System.out.print(num >> pos & 1);
		}
		System.out.println();
	}

	public void testBit() {
		int a = 12, b = 20;

		// this.printBit() >>this.가 생략 (같은 클래스 멤버끼는 this 씀)
		printBit(a);
		printBit(b);
		System.out.println("------------------------------------------------------");

		System.out.println("a 변수의 비트 확인");
		this.printBit(a);
		System.out.println("~a 의 비트 확인");
		this.printBit(~a); // 12의 1의 보수 출력
		// ~(Tield : 비트 반전) : bit--> bit0, bit0 -->bit1로 바꿈
		System.out.println("------------------------------------------------------");

		// 양수의 0의 보수를 구한다면
		this.printBit(~a + 1);
		// this. 는 메인에 static이 있어서 에러
		System.out.println("------------------------------------------------------");

		// shift 연산자 : 비트 자리이동 연산자
		// 정수 >> 자리이동값 : 왼쪽 빈자리는 부호비트를 채움
		//								2의 제곱수(자리이동값)에 대한 나누기 연산
		// 정수 >>> 자리이동값 : 왼쪽 빈자리는 무조건 0 채움
		// 정수 << 자리이동값 : 오른쪽 빈자리는 무조건 0 채움
		//								2의 제곱수(자리이동값)에 대한 곱하기 연산
		printBit(b);
		printBit(b << 3);
		System.out.println("------------------------------------------------------");
		
		printBit(-10);
		printBit(-10 >> 2);
		printBit(-10 >>> 2);
		System.out.println("------------------------------------------------------");
		
		printBit(a);
		printBit(b);
		System.out.println();
		System.out.println("a & b");
		printBit(a & b);
		System.out.println("a ^b");
		printBit(a ^ b);
		System.out.println("a | b");
		printBit(a | b);
		System.out.println("------------------------------------------------------");
	}

}
