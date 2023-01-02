package operator.run;

import operator.sample.BitOperator;
import operator.sample.OperatorSample;
import operator.sample.OperatorSample2;
import operator.sample.TernaryOperator;

/**
 * 2022-12-23(금) 작성
 * 
 * @author 강용범 자바에서 사용되는 연산자 테스트용 클라스
 */

public class TestOperator {

	public static void main(String[] args) {
		// 클래스가 제공하는 메소드를 사용하려면 (non-static)
		// 클래스명 참조변수명 = new 생성자();
		// [자료형 리턴값 받을 변수 = ] 참조변수.메소드명([전달값);

		// static 메소드이면
		// [자료형 리턴값 받을 변수 = ] 클래스명.메소드명([전달값]);

		OperatorSample osamp = new OperatorSample();

		// osamp.initVariable();
		// osamp.initInputVariable();
		// osamp.testComma();
		// osamp.testLevel1();
		// osamp.testSign();
		// osamp.testBooleanNot();
		// osamp.testIncDec();
		// osamp.Operataor1();
		// osamp.testSubst();

		OperatorSample2 osamp2 = new OperatorSample2();

		// osamp2.testOperator1();
		// osamp2.testDimension();

		// 대입연사자 오른쪽에는 반환값 있는 메소드만 사용 할 수 있음.
		// int result = osamp2.testDimension(); //에러

		//osamp2.testSubst();
		//osamp2.testComlexSubst();
		//osamp2.비교연산자테스트();
		//osamp2.일반논리연산자테스트();
		osamp2.논리연산자성질확인();
		
		TernaryOperator test= new TernaryOperator();
		
		//test.testAbs();
		//test.testNesting();
		
		
		BitOperator btest = new BitOperator();
		
		//btest.testBit();
	}

}
