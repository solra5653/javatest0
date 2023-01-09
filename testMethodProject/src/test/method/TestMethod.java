package test.method;

public class TestMethod {

	public static void main(String[] args) {
		// 일반메소드 작성 사용 테스트
		NonStaticSample samp= new NonStaticSample();
//		System.out.println("samp : " + samp.hashCode());
		
		//1.
//		samp.printLottoNumbers();
		
		//2.
//		samp.outputChar(5, '★');
		
		//3.
//		char result = samp.alphabette();
//		System.out.println("받은 문자 : " + result);
		
//		System.out.println("받은 문자 : " + samp.alphabette());
		
		//4.
		String ss = samp.mySubstring("test Method", 3, 7);
		System.out.println("리턴 결과 : " + ss);
	}

}
