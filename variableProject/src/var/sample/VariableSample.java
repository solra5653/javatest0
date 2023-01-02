package var.sample;

import java.util.Scanner;

public class VariableSample {
	//��� : Field(�������), Constructor(������), Method(����Լ�)
	
	//Method(����Լ�) : ��� ������ �ҽ��� ���� �Լ�
	//���������� [�����] ��ȯ�ڷ��� �޼ҵ�([�ڷ��� ������]){ �ҽ� �ۼ� }
	//����������(access modifier) : ���ٿ� ������ �Ŵ� �ܾ�
	//public, protected, private, default(ǥ�� ������) -> default�� �ڹٿ� �߰���
	//public(����) : ��Ű�� ��/��, Ŭ���� ��/�� ��𼭳� ��� ����
	//protected(��ӽÿ��� �ļտ��� ����[������ �����]) : 
	//				��� ���� �ļ� Ŭ���� �ȿ����� ��� ������
	//				��Ӱ��谡 �ƴϸ�, ���� ��Ű�� �ȿ����� ��� ������
	//private(�����) : Ŭ���� �ۿ��� ��� �Ұ���, ���� �ٸ� ��Ű������ ��� �Ұ�(ĸ��ȭ)
	//							Ŭ���� �ȿ����� ��� ������
	//default(ǥ�Ⱑ ������) : ���� ��Ű�� �������� ��� ����
	//		package private �̶�� ��(��Ű�� �������� ��� �����ؼ� ���̴� ��)
	
	public void testPrimitiveType() {
		// �⺻ �ڷ���(primitive type) Ȯ�ο� �޼ҵ�
		// �ڹٰ� �����ϴ� 8�� �⺻ �ڷ��� :
		// boolean, char, byte, short, int, long, float, double
		
		//����(variable) : �޸�(RAM)�� �� ����� ��(����)
		//���� ���� > ������ �� ��� > ���� ���
		
		//���� ���� : �޸𸮿� �� �����
		//�ڷ��� ������;
		boolean yesNo;		//true, false �� ����� �� ����, 1byte���
		char gender;			//���� 1�� ����� �� ����. 2byte ���
		byte bvalue;			//����Ʈ(byte) ����(-128 ~ 127)����Ҽ� �ִ� ����
		short svalue;			//2����Ʈ(byte) ����(-32768 ~ 32767)
		int age;					//������ �⺻��, 4����Ʈ(byte) (-2147483648 ~ 214783647)
		long pay;				//int  ���� ū �����϶� ���, 8����Ʈ(2�� 63�¿� ���� ���� ���)
		float tax;				//4����Ʈ �Ǽ���
		double salary;			//8����Ʈ �Ǽ���, �Ǽ����� �⺻��
		
		//�غ�� �����濡 �� ���
		//������ = ����� ��;
		//- ���� : ����� ������ �ڷ����� ���� ������ ���� ����� �� ����.
		//			  ����ġ�� ������
		yesNo =  false;		// true | false �� ���
		gender = '��';			// �����ϳ� ǥ���� ���� ����ǥ ���
		bvalue = 100; 		// -128 ~127 ���� ����
		svalue = 30000;		// -32768 ~ 32767 ������ ����
		age = 30;				
		pay = 4500000L;		//long�� ������ �ڿ��� ���̻� L ���� [iso���� ǥ������ ������]
		tax =0.03f;				//float�� �Ǽ��� �ڿ��� ���̻� f ���� [iso���� ǥ������ ������]
		salary = 50000000.; //3. �� 3.0 �� ����.
		
		//���� ��� : ���� �濡 ��ϵ� ���� ����� ����
		System.out.println(yesNo + ", " + gender + ", " 
									+ bvalue + ", " + svalue + ", " + age 
									+ ", " + pay +  ", "  + tax + ", "  + salary);
		return; 			//ǥ�� ���� ������	
	}
	
	//�ڹٿ��� ���ڿ����� ���ڿ� ����
	public void testString() {
		//Ŭ������ �ڷ������� ���ȴ�. -> �����ڷ��� �̶�� ��
		//Ŭ������ ��� : 
		//Ŭ������ ���� = new ������();
		//�����ڴ� Ŭ������� �̸��� ����
		//Ŭ������ ������� ������ ���۷��� ������� ��
		//���۷����������� �Ҵ�� ��ü������ �ּҰ� ��ϵ�
		
		//�ڹٿ����� ���ڿ��� �ٷ� �� java.lage.String Ŭ������ �����.
		String str = new String("test string");
		System.out.println(str);
		
		//��� Ŭ������ new�� ��ߵȴ�.(��ü������ ��Ģ)
		//�ڹٿ��� String�� �⺻�ڷ���ó�� ����� �� ����.
		//�ڷ��� ������ = ����Ұ�;
		String name = "ȫ���";
		System.out.println("name : " + name);
		
		return;
	}
	
	//���� �ʱ�ȭ(initialization[Init]) �׽�Ʈ��
	public void testInit() {
		//���� �ʱ�ȭ :
		//		���� ����� ���ÿ� �ʱⰪ ����ϴ� ��
		//�ʱⰪ : �����濡 ù��° ��ϵǴ� ��
		//�ڷ��� ���� = �ʱⰪ;
		boolean yesNo = true;
		int age = 30;
		double salary = 450000.;
		char gender = '��';
		String name = "ȫ���";
		
		System.out.println("[" + yesNo + ", " + age + ", " 
									+ salary+ "��, " + gender+ "��, "
									+name +  "��]" ) ;
		return;
	}
	
	public String testInit2() {
		//���� �ʱ�ȭ :
		//		���� ����� ���ÿ� �ʱⰪ ����ϴ� ��
		//�ʱⰪ : �����濡 ù��° ��ϵǴ� ��
		//�ڷ��� ���� = �ʱⰪ;
		boolean yesNo = true;
		int age = 31;
		double salary = 850000.;
		char gender = '��';
		String name = "�����";
		
		 String result = "[" + yesNo + ", " + age + ", " 
									+ salary+ "��, " + gender+ "��, "
									+name +  "��]" ;
		return result;
	}
	
	//���� ����
	public String example() {
		//���� �ʱ�ȭ�� ����ؼ� ���� ����� �� ���� ó��
		//�л� ������ �����ϵ��� ��
		//�̸�(name), ��������(kor), ��������(eng)
		//��������(mat), ����(tot), ���(avg)
		//��������� ���ڿ��� ���� ����
		String name = "�����";
		int kor = 80;
		int eng = 75;
		int mat = 95;
		int tot = kor+eng+mat;
		int avg = tot/3;
		
		String exam = "[�̸� : " + name + ", ���� : " + kor
							+ "��, ���� :" + eng + "��, ���� : " + mat 
							+ "��, ���� : " + tot + "��, ��� : " + avg + "�� ]";
		return exam;
		
	}
	
	//java.util.Scanner ��� �׽�Ʈ��
	@SuppressWarnings("resource")
	public void testSanner() {
		//Ű����� ����� Sanner ��ü ����
		//Ű���� : java.lang.System static field : in
		//static �ʵ� ��� : Ŭ������.�ʵ��
		Scanner sc = new Scanner(System.in);
		//System.in = public static final InputStream in
		System.out.print("�̸��� �Է��ϼ���. : ");
		//�Է����� ��¹����� ���ϸ� ��ȭ���� ���´�.
		//println�� �� �ٲ㼭 Ŀ�����ǰ� print �ٹٲ��� �ʰ� ������ Ŀ���� ���´�.
		String name = sc.next();
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.print("Ű[�Ҽ��� ù°�ڸ�����] : ");
		double height = sc.nextDouble();
		
		
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("height : " + height);
		
		return;
	}
	
}
