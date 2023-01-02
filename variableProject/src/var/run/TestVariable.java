package var.run;

//다른 패키지의 클래스 사용시 반드시 import 선언을 해야함
import var.sample.VariableSample;
import var.sample.VariableSample2;

public class TestVariable {

	public static void main(String[] args) {
		// 자바 변수 테스트
		// import 한 클래스가 제공하는 메소드를 사용하려면
		// 클래스명 레퍼런스변수 = new 클래스명();       [new 생성자]
		// 레퍼런스변수.메소드명([전달값,...]);
		// 객채 지향이여서 new 써서 객체를 만들어야 하는 과정
		// 컴파일시 자동으로 기본 생성자가 추가된다. 단 생성자 없는 클래스만 만들어진다.
		
		VariableSample vsamp = new VariableSample();
		//vsamp.testPrimitiveType();
		//5.0E7는 5.0의 7승
		
		//import 사용하지 않고 다른 패키지의 클래스 사용 : 
		//var.sample.VariableSample vsamp 이런걸 클래스 풀네임이라고 한다.
		//var.sample.VariableSample vsamp
		//			= new var.sample.VariableSample();
		
		//vsamp.testPrimitiveType();
		//vsamp.testString();
		
		//사용 메소드의 리턴 타입이 void 일때 :
		//레퍼런스변수.메소드명();
		//Svsamp.testInit();
		
		//리턴값이 있는 메소드를 사용할때 : 
		//리턴값 받아줄 변수 = 레퍼런스.메소드명();
		//String value = vsamp.testInit2();
		//System.out.println("value : " + value);
		
		//메소드 안에서 return 딱 한번만 가능함. 여러번 return이 불가능.
		
		//String exam = vsamp.example();
		//System.out.println("학생정보 : "+ exam);
		//vsamp.testSanner();
		
		

	}

	private static VariableSample2 VariableSample2() {
		VariableSample2 vsamp2 = new.VariableSample2();
		vsamp2.testWrapper();
	}

}
