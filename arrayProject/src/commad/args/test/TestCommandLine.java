package commad.args.test;

public class TestCommandLine {

//	public static void main(String[] args) {
//		// �޼ҵ��(�ڷ��� �Ű�����) { �ҽ� �ۼ� }
//		// �Ű�����(parameter)�� �ִ� �޼ҵ�� ����
//		// �ݵ�� �Ű��������� ������ ���� ǥ���ؾ� ��
//		// ��� : ���۷���.�޼ҵ��(���ް�);
//		// ���ް�(argument) ==��������
//		//�޼ҵ��� parameter�� ������ argument�� �ݵ��
//		//������ �ڷ����� ��ġ�ؾ� ��
//		// Ȯ��
//		new Sample().method(10,20);
//
//		//���α׷� ����� main �޼ҵ忡�Ե� ���ް��� �ݵ��
//		//�־�� ��. 
//		//=> ����� ����Ŭ�������� �⺻ ���� ���ڷ� ����
//		//		��Ŭ�������� ����Ŭ�������� �迭�� �������� ����
//		//		���������Ʈ���� ���� Ȯ���� ���� �� �� ����.
//		System.out.println("main args : " + args.length);
//		//main ���� ���޿� �� Ȯ��
//		for(int i=0; i< args.length; i++) {
//			System.out.println(i + " : " + args[i]);
//		}
//	}
	// �ǽ����� 3
	public static void main(String[] args) {
		if (args.length == 5) {
			String name = args[0];
			char gender = args[1].charAt(0);
			int age = Integer.parseInt(args[2]);
			double height = Double.parseDouble(args[3]);
			double weight = Double.parseDouble(args[4]);
			System.out.println("�̸� : " + name);
			System.out.println("���� : " + gender);
			System.out.println("���� : " + age);
			System.out.println("Ű : " + height);
			System.out.println("������ : " + weight);

		} else {
			System.out.println("����� main �������ڷ� " + "5���� �ݵ�� �Է��ؾ� �մϴ�.");
		}

	}// class closed

//�ϳ��� .java ���� �ȿ� class ���� �� �ۼ��� ���� ����
//���ǻ��� : ���ϸ����� ���� Ŭ������ public class ��
//				������ Ŭ�������� public ��� ����
//Ŭ���� �ۼ��� 2���� : 
//public class Ŭ������ {} 		
// 			: ��Ű�� ��/�� ��𼭳� ��밡����.
//			�ٸ� ��Ű�������� import  �ؼ� �����
//class Ŭ������ {}					: 
//		 : default(package private) Ŭ���������.
//			��Ű�� �ȿ����� ��밡����. ��Ű�� �ۿ����� ������.

//public class Test {}  //����(public ���ߵ�)
	class Test {
	}

	class Sample {
		// �޼ҵ� ���� ������ 2���� ���޹޾Ƽ� ����ϰڴٴ� �ǹ���
		public void method(int a, int b) {
			System.out.println(a + "+" + b + "=" + (a + b));
		}
	}
}