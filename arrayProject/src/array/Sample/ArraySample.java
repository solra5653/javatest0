package array.Sample;

import java.util.Scanner;

/**
 * 
 * �⺻ �ڷ���(Primitive Type) 1���� �迭 �׽�Ʈ�� Ŭ���� 2023.01.02(��) �ۼ�
 *
 */
public class ArraySample {
	// Method
//	public void testArray1() {

//		// 1. �迭 ����
//		// �迭 ������ �ּ������ ���۷��� ���� �����
//		// �ڹ�: ���۷��� ���� == C/C++������ ������ ����
//		// �ڷ���[] ������; �Ǵ� �ڷ��� ������[]; �Ǵ� �ڷ��� []������;
//		// �迭 ���۷��� == �迭�̸� == �迭�� == �迭�� �ּ�
//		int[] arr;
//		
//		// 2. �迭 ����
//		// ��(Heap, ���� �޸� ����)�� �迭 ������ �Ҵ�(allocation)�ϴ� ��
//		// �ڹٿ����� �迭������ ��ü������ heap�� ���鵵�� ������ ����.
//		// heap�� Ư¡: ������(���̸�) ��� ����. => �ּ� ���� ��ĸ� �����ϴ�
//		// �ڹٴ� ���� �Ҵ��� �� new�� ����Ѵ�.
//		// �迭 ���۷��� = new �ڷ���[�氳��];
//		// �氳�� == ÷��
//		// heap�� �ش� �ڷ����� �������� ������ŭ ���� ���� �Ҵ��ϰ� �߻��� ���� �ּҸ� �迭���۷����� ��� ������
//		arr = new int[5];
//		System.out.println("arr�� ���� �ּ�: " + arr.hashCode());
//		// �ڹٰ� java.lang.Array�� �迭�� ����� �⺻���� ������. 
//		System.out.println("arr�� �����ϴ� �迭 ������ �� ����: " + arr.length);
//		
//		// 3. �迭 ���
//		// �� ���, �� ���, �� �б�
//		// �迭�� �����ּҸ� �̿��ؼ� �� ���� �������� �����Ѵ�.
//		// �迭 ���۷���[����]: �����ּҿ��� ������ŭ �̵��� ��ġ
//		// �ѹ��� �̵�����Ʈ ũ�� == �ڷ��� �Ҵ� ����Ʈ ũ��� ���� 
//		// �ڹٴ� ���� �Ҵ�� �濡 �ڵ����� �غ�� �⺻ ��(default) �����.
//		// boolean: false, char: '\u0000', ����: 0, �Ǽ�: 0.0
//		// Ŭ������: null
//		// �迭�� �������� �ٷ� ���� �ַ� for���� ����Ѵ�.
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(i + "��° ���� ��: " + arr[i]);
//		}
//	}
//	// �迭 ����� ������ �ѹ��� �ۼ��ص� �ȴ�. 
//	public void testArray2() {
//		// �ڷ���[] �迭���۷��� = new �ڷ���[����];
//		boolean[] bar = new boolean[10];
//		
//		// �迭 ������ �ʱⰪ�� ������, jvm�� ���� �غ�� �⺻ ��(default) ��ϵ� 
//		for(int i = 0; i < bar.length; i++) {
//			System.out.println(bar + "[" + i + "]: " + bar[i]);
//		}
//	}
//	// �Ҵ�� �迭 �� �濡 �� ���/���
//	// �迭��[����] = ��; 
//	// ���� == �ε���(index)
//	public void testArray3() {
//		int[] arr = new int[5];
//		
//		// �� �濡 �� ��� 
//		arr[0] = 12;	// arr�� ���� ���� �ּ� = ��;
//		arr[1] = 23;	// �����ּҿ��� 1ĭ �̵��� ��ġ = ��;
//		arr[2] = 5;		// �����ּҿ��� 2ĭ �̵��� ��ġ = ��; 
//		arr[3] = 45;
//		arr[4] = 99;
//		
//		// �迭 �� ���� �� ���: �迭��[����]
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(i + ": " + arr[i]);
//		}
//	}
//	//�迭 ������ �ʱ�ȭ �׽�Ʈ
	public void testArrayInit() {
//			//�迭 �ʱ�ȭ
//			//�迭���� ����(�Ҵ�)�� ���ÿ� �ʱⰪ ��� ó��
//			
//			//���� ǥ�����1
//			//�ڷ���[] �迭���۷��� = {�ʱⰪ, �ʱⰪ, �ʱⰪ, .........};
//			//�ʱⰪ�� ������ŭ �ڵ� �����Ҵ�(���� ����)�ϰ�
//			//�ٷ� �ʱⰪ�� �� �濡 ������� �����
			int[] ar =  {11, 22, 33, 44, 55, 66, 77, 88, 99};

		System.out.println("�Ҵ�� ���� ���� : " + ar.length);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
			// ���� ǥ�����2
			// �ڷ���[] �迭���۷��� = {�ʱⰪ, �ʱⰪ, �ʱⰪ, .........};
			int[] ar2 = new int[] { 11, 22, 33, 44, 55, 66, 77, 88, 99 };

			System.out.println("�Ҵ�� ���� ���� : " + ar2.length);
			for (int i1 = 0; i1 < ar2.length; i1++) {
				System.out.print(ar2[i1] + " ");
			}

			// ���1�� ���2�� ������ :
			// ���1�� �迭 ����� �ʱ�ȭ�� �ѹ��� �ۼ��Ǿ����
//				int[] ar3;
//				ar3 = {1, 2, 3, 4, 5};  //error
			int[] ar3 = { 1, 2, 3, 4, 5 };

			// ��� 2�� �迭 ����� �ʱ�ȭ �и��� �� ����
			int[] ar4;
			ar4 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

			for (int i2 = 0; i2 < ar3.length; i2++) {
				System.out.print(ar3[i2] + " ");
				System.out.println();
			}
			for (int i3 = 0; i3 < ar4.length; i3++) {
				System.out.print(ar4[i3] + " ");
				System.out.println();
			}
		}
	}
	public void testArrayInit2() {
		//�迭���� �氹���� �������ͷ�(��) �Ǵ� �������� ��밡��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭�� �Ҵ��� �� ���� : ");
		int su = sc.nextInt();
		
		int[] nums = new int[su];
		System.out.println("nums length : " + nums.length);
		
		//1~100������ ������ ������ ��ϵǰ� ��
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 100)+1;
		}
		
		//��� Ȯ��
		for(int i = 0; i<nums.length; i++) {
			System.out.print(nums[i] + "  ");
		}
		System.out.println();
	}
}