package first.sample;

import java.util.GregorianCalendar;

//import ���� �ۼ� ��ġ
//import ��Ű����.Ŭ������;
//import ��Ű����.*;  => ��Ű���ȿ� ������ import �ض�
//��Ű�ڰ� �ٸ� Ŭ������ ����Ϸ���, �ݵ�� import ������ �ؾ� ��

//���� ��Ű�� �ȿ� Ŭ���������� import ���� �ʰ� �״�� �����
//�ٸ� ��Ű���� ����Ϸ��� import ��� �ٸ� �ٸ� ��Ű���� ����Ҽ� �ִ�.

public class Calculator {
	//Ŭ���� ��� : �ʵ�, �Ű�����, �޼ҵ� ���� ��������
	//1. �ʵ�� Ŭ���� ����ϴ� ���
	//private �ڷ��� ������;
	private Sample samp;
	//�ڷ���(Data Type) : ���� ������ �����ϱ� ���� �ܾ�
	//Ŭ�����ڷ��� : ��ü(Object)�� ������ �������� ���� �뵵��
	private GregorianCalendar today;
	
	//2. �޼ҵ��� �Ű������� ���
	//public ,��ȯ�ڷ��� �޼ҵ��(�ڷ��� �Ű�����){.....}
	public void getSamp(Sample obj) {
		obj.printlnfo();
		
	}
	//3. �޼ҵ� �ȿ��� ���� ����(Local Variable)�� ���
	public void getSamp() {
		Sample s = new Sample();
		s.printlnfo();
	}

}
