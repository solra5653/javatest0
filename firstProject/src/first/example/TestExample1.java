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
		
		name = "�����";
		age = 31;
		t = 162.3;
		k = 73.5;
		s = 'M';
		phone = "010-7739-5090";
		e = "solra5090@naver.com";
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age + " ��");
		System.out.println("Ű : " + t + " cm");
		System.out.println("������ : " + k + " kg");
		System.out.println("����(��:M, ��:F) : " + s);
		System.out.println("��ȭ��ȣ : " + phone);
		System.out.println("�̸��� : " + e);
		
	}
	
	
	

	public static void main(String[] args) {
		
		TestExample1 test = new TestExample1();
		
		test.example();
		
					

	}

}
