package logic.run;
//logic.run.TestContinue
public class TestContinue {
	
	//continue 문 테스트용 메소드
	//반복문 내에서만 사용할 수있는 분기문
	//if(조건식) continue;
	//반복 내용의 중간 생략 처리됨
	public void continueSample() {
		//1~100까지 정수들의 합계
		//단, 3의 배수들은 제외함
		int sum = 0;
		for(int no1 =1; no1 < 101; no1++ ) {
			if(no1%3 ==0) continue;
			sum += no1;
			
			System.out.print(no1 + "+");	
		}
		System.out.println();
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// continue 문 테스트
		new TestContinue().continueSample();
		
	}

}
