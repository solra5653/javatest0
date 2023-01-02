package silsub.test;

import silsub.sample.Munjae;

public class TestSilsub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Munjae test = null;
		//레퍼런스 변수 초기화시에 null 선언할 수 있음
		//레퍼런스 변수를 주소없는 빈 상태로 만들어라는 뜻임
		
		Munjae mj = new Munjae();
		//클래스에 대한 객체공간을 메모리에 할당(new)하고
		//그 객체의 주소를 레퍼런수변수에 기록해라.
		
//		System.out.println(mj);
//		System.out.println(test);
//		mj.test1();
//		test.test1(); //NullPointerException 발생(Null.메소드 호출로 인한 에러)

//		mj.test1();
//		mj.test2();
//		mj.test3();
//		mj.test4();
		mj.inputTest();
//		mj.test6();
//		mj.test7();
	}

}
