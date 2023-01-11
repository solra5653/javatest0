package oop.etc.test;

public class TestRecursiveCall {
	
	//정수를 하나 전달받아, 해당 정수의 펙토리얼 구해서 리턴
	// 예 : 5! = 5*4*3*2*1, 0! : 1
	int fectorial(int num) {
		
		int result = 1;
		
		//반복문으로 표현해도 됨
//		for(int n = num; n > 0; n--) {
//			result *= n;
//			System.out.print(n + " * ");
		
		//재귀 호출 방식으로 처리
		System.out.print(num + " * ");
		if(num >0) {
			return num*fectorial(num -1);
		}else {
			System.out.println();
			return result; //num 이 0이면 1리턴함
		}		
	}
	
	//overloading(오버로딩) : 한클래스 안에 이름 같은 메소드
	//						여러 개 작성한 경우 (중복 정의)
	//주의 : 매개변수가 달라야함
	//반환자료형(return type)은 오버로딩에 상관없음.
	double fectorial(double number) {
		return 0;
	}
	
	public static void main(String[] args) {
		// 재귀호출(Recursive Call) 메소드 테스트
		//메소드 안에서 자신을 실행시키는 메소드
		// 반복 처리임 => 반복문으로 표현해도됨
		int result = new TestRecursiveCall().fectorial(5);
		
		System.out.println("5! : " + result);
	}

}
