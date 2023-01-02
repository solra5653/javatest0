package var.sample;

import java.util.Scanner;

public class VariableSample2 {
	//Method(����Լ�) �ۼ����� :
	//����������[�����(������ Ư���Ѱ��)] ��ȯ�ڷ��� �޼ҵ��([�ڷ��� �Ű�������])
	
	//���� ������ �����÷ο� �׽�Ʈ�� �޼ҵ�
//	public void valueOverflow() {
//		byte bnum; //1byte ũ���� ���������� �޸𸮿� �Ҵ���
//		//1byte(8bit) : bit 0 | 1�� 8�� �����
//		//���� : ����, 0, ����� ������
//		//byte �ڷ����� ���� ���� : -128 ~ 127
//		
//		bnum = 128;		 //error ���� �ʰ������� error
	

		
//	}

	
	//����ȯ �׽�Ʈ
	//���� �ڷ����� �ٲٴ°��� ����ȯ
	//��ǻ���� ����Ģ�� �������� ������ ����ȯ�� �߻�.
	public void testCasting() {
		//�ڵ�����ȯ : �ڷ����� �ٸ����� ���Եɶ�
		//		���� ũ���� �ڷ��� ���� ū ũ���� ������ ���Ե� ��
		//��Ģ 1 : ���� ���������� ������ �� �ִ�.
		int num = 'A'; //int <- char >> int �� �ٲ�
		//������ �����ڵ�(unicode) ������ ��ȯ�Ǽ� ���Ե�.
		System.out.println("num : " + num);
		
		//�ڵ�����ȯ : �ڷ����� �ٸ� ������ ������ ���� ��
		//��Ģ 2 : ���� ���������� ����� �� �ִ�.
		//�޸� �Ҵ�ũ�Ⱑ ū �ڷ������� �ڵ�����ȯ��
		//���� : ������ �Ǽ����� ���꿡���� �Ǽ������� ����ȯ��
		double result = 3 + 2.5 *7;
		//int + double *int => 3.0 + 2.5 * 7.0 �ٲ�
		//	double + double *double => double ó������
		System.out.println("result : " +result);
		
		//��������ȯ(����� ����ȯ)�� �ʿ��� ���
		//��� 1 : ũ�Ⱑ ū �ڷ��� ���� ũ�Ⱑ ���� ������ ���Խ�
		//cast ������ ��� : (�ٲ��ڷ���)�� | (�ٲ��ڷ���)����
		int k = (int)35.7;
		//int(4byte) <- double(8byte) =>>int�� Ÿ�Ժ�ȯ�� ����Ѵ�.
		System.out.println("k : "+k);
		
		//��� 2 : ����� ����� ���� ������ �ƴ� �� ����ȯ �ʿ�
		//��Ģ 3 : ����� ����� ���� �������� ��
		int value = 2147483647;
		System.out.println("value : " + value);
		
//		long result2 = value + value; //int+int �� ���� overflow���Ͽ� long�� �����Ͽ��� -2�� ����̵ȴ�
		long result2 = (long)value + value;
		System.out.println("result2 : " +result2);

//		return; //void �̿��� �ڵ� return ����
		
	}
	
	public void testCasting2() {
		//�ڹٴ� byre, short �ڷ��� �� ����� �������
		//������ int �� ó����
		byte b1 = 10;
		byte b2 = 20;
//		byte b3 = b1 + b2; //error : ������� int ��
		//byte(1byte) <- int(4byte)
		
		//�ذ� 1: 
		int result1 = b1 +b2;
		//�ذ� 2 : ����ȯ ó��
		byte b3 = (byte)(b1 + b2);
		
		
		short s1 = 11;
		short s2 = 22;
		
//		short s3 = s1 + s2; //error : ����� int��
		//short(2byte) <- int(4byte)
		
		//�ذ�
		int result2 = s1 + s2;
		short s3 = (short)(s1 + s2);
		
//		short ss = b1 + s1; //error : ������� int ��
		int result3 = b1 + s1;
		
		System.out.println(b3+", " + result1);
		System.out.println(s3+", " + result2);
		System.out.println(result3);
		
	}
	
	@SuppressWarnings("resource")
	public void charCasting() {
		//���ڿ� �������� ����ȭ�� char <=> int �� ������
		System.out.print("���� �ϳ� �Է� : ");
		char ch = new Scanner(System.in).next().charAt(0);
		System.out.println(ch + " is unicode " +  (int)ch);
		
	}
	@SuppressWarnings("resource")
	public void charCasting2() {
		
		System.out.print("���� �ϳ� �Է� : ");
		int unicode = new Scanner(System.in).nextInt();
		System.out.println("�����ڵ�" + unicode + " => " + (char)unicode);
		}
	
	//�ڹٿ����� �⺻�ڷ���(8��)�� ���� ���� Ŭ������ ������
	//�⺻�ڷ��� Ŭ������ ���� (Wrapper)Ŭ���������
	//Wrapper class : �⺻�ڷ��� ���� ĸ��ȭ ó���� ������
	//Boxing : data --> enCapsulation(ĸ��ȭ) : object ��ü -> (����Ÿ�� ��ü�� �ٲٴ� �۾�)
	//UnBoxing : object
	//�ڹٰ� �����ϴ� Ŭ������ �޼ҵ�� �߿� ��ü�� ����ϴ� 
	//�޼ҵ带 ����Ҷ� Wrapper class�� �޼ҵ� �̿��ϸ� ��
	public void testWrapper() {
		//�� �ڷ����� �޸� �Ҵ�ũ��(BYTES), ��� ��Ʈ��(SIZE),
		//�ִ밪(MAX_VALUE), �ּҰ�(MIN_VALUE) ��
		//��� �ʵ尡 ������
		int num = 123;		//�� ���
		//�� --> ��ü�� �ٲ�� �� ���
		//Integer iob = new Integer(num);
		//deprecated : ������ �Ǹ鼭 ������� ����� ����
		Integer iob = Integer.valueOf(num);
		//�۲��� ���������� static �̿��� ��￩����.
		
		double dnum = 45.6;  //��
		//�� --> ��ü�� ��ȯ
		//Double dob = new Double(dnum);
		Double dob = Double.valueOf(dnum);
		
		System.out.println(num + ", " + iob.toString());
		//.toString �� ���ϴ� ���� ����Ҷ�
		System.out.println(dnum + ", " + dob.toString());
	}
}
