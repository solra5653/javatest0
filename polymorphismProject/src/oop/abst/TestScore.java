package oop.abst;

public class TestScore {

	public static void main(String[] args) {
		// 다형성 테스트
		Score score = new Score();
		Object ref1 = score;			// 사용할 수 있는 메소드 없음
		SuperSample ref2 = score;	//사용 메소드 없음
		IGrade ref3 = score;			//getGrade() 만 사용가능
		ICalc ref4 = score;				//sum, sub, mul, div, mod 사용
		
		//ref4 로 getGrade() 메소드를 사용하려면
		//형변환하면 됨 : 참조 인스턴스의 클래스 타입으로 변환
		char grade = ((Score)ref4).getGrade(85);
		System.out.println("85 : " + grade);
		
		//2. 실제 소유자 타입으로 변환
		char grade2 = ((IGrade)ref4).getGrade(77);
		System.out.println("77 : " + grade2);
	}

}
