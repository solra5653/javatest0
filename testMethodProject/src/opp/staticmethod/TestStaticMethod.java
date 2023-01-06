package opp.staticmethod;

public class TestStaticMethod {

	public static void main(String[] args) {
		
		
		
//		StaticMethod.setValue("AbCdeF");
		
//		StaticMethod.toUpper();
		
//		StaticMethod.setChar(1, 'L');
		System.out.println("value :  " + StaticMethod.getValue());
		
		StaticMethod.setValue("static test");
		System.out.println("value :  " + StaticMethod.getValue());
		//1
		StaticMethod.toUpper();
		System.out.println("\n1. value :  " + StaticMethod.getValue());
		
		//2
		StaticMethod.setChar(7, 'L');
		System.out.println("2. value :  " + StaticMethod.getValue());
		
		//3
		System.out.println("3. 글자갯수 :  " + StaticMethod.valueLength());

//		StaticMethod.valueLength();
//		String result = StaticMethod.valueConcat("java");
//		System.out.println("result : " + result);
	}

}
