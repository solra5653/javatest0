package cast.practice;

import java.util.Scanner;

public class CastingSample {
	public void printUniCode() {
		System.out.print("���� �Է� : ");
		
		char ch = new Scanner(System.in).next().charAt(0);
		
		System.out.println(ch + " is unicode " + (int)ch);
				}
	
public void calculatorScore() {
	Scanner gg = new Scanner(System.in)
	System.out.print("���� : ");
	double kor =gg.nextDouble();
	System.out.print("���� : ");
	double en = gg.nextDouble();
	System.out.print("���� : ");
	double ma = gg.nextDouble();

	
	System.out.println("���� : " + (int)(kor+en+ma));
	System.out.println("��� : " + (int)((kor+en+ma)/3));
}

//�ǽ� 3
//������ �ϳ� �Է� �޾�,
//�� ������ 2���� ������ ��Ʈ1�� ������ ������� �����
//(��Ʈ : java.lang.lnteger �� �޼ҵ带 ã�Ƽ� �̿���)
public void printBitCount(){
	System.out.print("���� �Է� : ");
	int b = new Scanner(System.in).nextInt();
	
	
	System.out.println(b +"�� 2������ ���Ե� 1�� ���� : " + Integer.bitCount(b));
	this.printBit(b); //thisǥ��� ��������
	
	
}
//���� �ϳ��� ���� �޾Ƽ�, �� ���� �޸𸮿� ��ϵ�
//�� ������ ����ϴ� �޼ҵ�

//private void printBit(int n) {
//	System.out.print(n + " : ");
//	for(int i = 31; i >= 0; i--) {
//		//����� ��ġ�� ��Ʈ�� 1�̸� ���� 1�� ����
//		//��Ʈ�� 0�̸� ���� 0���� ����ó��
//		System.out.print(n >> i & 1);
//	}
//	System.out.println();
public void testWrapper() {
	//�� �ڷ����� �޸� �Ҵ�ũ��(BYTES), ��� ��Ʈ��(SIZE),
	//�ִ밪(MAX_VALUE), �ּҰ�(MIN_VALUE) ��
	//��� �ʵ尡 ������
	int num = 123;  //�� ���
	//�� --> ��ü�� �ٲ�� �� ���
	//Integer iob = new Integer(num);  
	//deprecated : ������ �Ǹ鼭 ������� ����� ����
	Integer iob = Integer.valueOf(num);
	
	double dnum = 45.6;  //��
	//�� --> ��ü�� ��ȯ
	//Double dob = new Double(dnum);
	Double dob = Double.valueOf(dnum);
	
	System.out.println(num + ", " + iob.toString());
	System.out.println(dnum + ", " + dob.toString());
	
	//�ʵ峪 �޼ҵ忡 static �� ǥ�õ� ��� ������
	//Ŭ������.�ʵ��, Ŭ������.�޼ҵ��(...)
	System.out.println("�Ҵ� ����Ʈ : " + Integer.BYTES);
	System.out.println("��Ϻ�Ʈ�� : " + Integer.SIZE);
	System.out.println("�ִ밪 : " + Integer.MAX_VALUE);
	System.out.println("�ּҰ� : " + Integer.MIN_VALUE);
	
	
}
}
}
