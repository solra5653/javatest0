package first.example;

public class TestExample1 {
	public void example() {
		
		String name;
		int age;
		double t;
		double k;
		char s;
		String phone;
		String e;
		
		name = "강용범";
		age = 31;
		t = 162.3;
		k = 73.5;
		s = 'M';
		phone = "010-7739-5090";
		e = "solra5090@naver.com";
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + " 세");
		System.out.println("키 : " + t + " cm");
		System.out.println("몸무게 : " + k + " kg");
		System.out.println("성별(남:M, 여:F) : " + s);
		System.out.println("전화번호 : " + phone);
		System.out.println("이메일 : " + e);
		
	}
	
	
	

	public static void main(String[] args) {
		
		TestExample1 test = new TestExample1();
		
		test.example();
		
					

	}

}
