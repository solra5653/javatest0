package operator.sample;

import java.util.Scanner;

// ���׿����� �׽�Ʈ�� Ŭ����
// 13���� : �׸��� 3���� ������
// ����� �������� = (����ǥ����)?���϶� ������ ��: �����϶� �����Ұ�;
// �޼ҵ�((���ǽ�)? ���� : ������) --> �޼ҵ尡 �� �� �ϳ� ���� �����.
public class TernaryOperator {
	//Ű����� ������ �ϳ� �Է� �޾�, �� ���� ���밪�� ����ϴ� �޼ҵ�
	//���밪 : ��� ������ ���
	public void testAbs() {
		System.out.print("���� �ϳ� �Է� : ");
		int num = new Scanner(System.in).nextInt();
		
		int absNum = (num > 0)? num: -num;
		
		System.out.println(num + "�� ���밪 : " + absNum);
		
		//�޼ҵ� �ȿ��� ���׿����� ����� ���
		System.out.println(num + "�� ���밪 : " 
								+ ((num > 0)? num: -num));
	}
	
	//���׿����� ��÷ ��� ������
	//(���ǽ�1)? ����: ((���ǽ�2)? ����2: ((���ǽ�3)? ����3:...........))
	//���� �ϳ��� �Է¹޾� �� ���ڰ� ���� �ҹ����̸� "Lower",
	//�ҹ��ڰ� �ƴϰ� �빮���̸� "Upper",
	//�����ڰ� �ƴϰ� ���ڹ����̸� "Number",
	//��� �ƴϸ� "Other" ���ڿ��� ��������� �����ϰ� ���ó��
	public void testNesting() {
		System.out.print("���� �ϳ��� �Է� : ");
		char ch = new Scanner(System.in).next().charAt(0);
		
		//�ҹ��� ���� : ���� >= 'a'	&&	���� <= 'z'
		//'a' <= ���� <= 'z' : ��ǻ�ͷ� ǥ���� �� ����
		String result = (ch >= 'a' && ch <= 'z')? "Lower" 
				: ((ch >= 'A' && ch <='A')? "Upper"
						: ((ch >= '0' && ch <='9')? "Number": "Other"));
		
		System.out.println(result);
		}

}
