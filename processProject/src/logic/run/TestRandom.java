package logic.run;

import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
		// java.lang.Math �� �����ϴ� random() �޼ҵ� ��� �׽�Ʈ
		// static �޼ҵ�� ������ Ŭ������.�޼ҵ�() �� �����
		double value = Math.random();
		System.out.println("�߻��� : " + value);
		//0.0 <= value 1.0
		//1~100������ ���� ������ Ȱ���Ѵٸ�
		//(int)(Math.random() * ���ϴ� ����) + ���۰�
		int num =  (int)(value*100)+1;
		System.out.println("num : " + num);
		
		//51~ 100������ ������ �߻��� ���ٸ�
		//(int)(Math.random() * (����-���۰�+1))+���۰�
		int num2 =  (int)(value*(100-51+1))+51;
		System.out.println("num2 : " + num2);
		
		//java,util.Random Ŭ������ �̿��ص� ��
		Random random = new Random();
		
		//�� �ڷ������� ������ �߻�(����) �޼ҵ带 ������
		System.out.println("���� Ȯ�� : "+random.nextInt());
		System.out.println("�Ǽ� Ȯ�� : "+random.nextDouble());
		
		//51~100����
		int num3 = random.nextInt(50)+51;
		System.out.println("51~100���� Ȯ��(num3) : "+num3);
		
		//1~ 100������ ���� �߻�
		int num4 = random.nextInt(100)+1;
		System.out.println("1~100���� Ȯ��(num4) : "+num4);
	}

}
