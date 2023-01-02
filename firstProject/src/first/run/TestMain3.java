package first.run;

import first.sample.Calculator;
import first.test.Welcome;
//����� ctrl+shift+o = import

public class TestMain3 {

	public static void main(String[] args) {
		// ��������� Ŭ����(��������� �ڷ���)�� ���
		// ���� �ڷ���(Reference Type) : Ŭ���� �ڷ���
		// 1. Ŭ�����ڷ��� ������;
		Welcome ref;
		String str;
		Calculator calc;
		
		//�⺻ �ڷ���(Primitive Type)
		// *�߿� : char, byte, short, int, long, float, double, boolean
		//�� ������
		int num;
		double dnum;
		
		// 2. �����濡 �� ��� (�⺻ �ڷ���)
		num = 120;
		dnum = 3.456;
		char ch = 'A';
		//���� �ϳ��� ����Ѵٸ� char�� ��ߵǸ� �̶� ""�� �ƴ� ''�� ����ؾߵȴ�.
		boolean flag = false;
		
		//���� �ڷ���(Ŭ���� �ڷ���) �����濡�� �ּҰ� ��ϵ�
		//�ּ����� ���� : ���۷��� ���� ��� ��
		//���۷��� ���� : new ������();
		ref = new Welcome();
		str = new String();
		calc = new Calculator();
		
		// 3. ���� ��� => ��¿� ���
		// �⺻�ڷ��� ������ ����� ������ ��ϵ� ���� ����� ����
		System.out.println("num : " + num);
		System.out.println("dnum : " + dnum);
		System.out.println("ch : " + ch);
		System.out.println("flag : " + flag);
		
		//�����ڷ��� ������ ����� ��ϵ� �ּҸ� ����
		//�ش� Ŭ������ �޼ҵ�
		//���۷�������.�޼ҵ�(....)
		ref.setMessage("�ȳ��ϼ���.^^");
		ref.printMessage();
		
		calc.getSamp();
	}

}
