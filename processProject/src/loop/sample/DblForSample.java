package loop.sample;

import java.util.Scanner;

/**
 * ���� for�� �׽�Ʈ�� Ŭ���� : �ݺ� ������ �ٽ� �ݺ��� �Ǵ� ��� for(�ʱ��; ���ǽ�; ������){ �ݺ���ų ���� => for(){}
 * }
 *
 */
public class DblForSample {

	public void testDoubleFor() {
		// �ܼ� �信 '*' ���� �ϳ� ���
//		System.out.println("*");
		// �ֺܼ信 ******* 7�� ���
//		System.out.println("*");
//		System.out.println("*");
//		System.out.println("*");
//		System.out.println("*");
//		System.out.println("*");
//		System.out.println("*");
//		System.out.println("*");

		// �ݺ��� ���
//		for (int k = 1; k <8; k++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
		/*
		 * ���ٿ� * 7�� ����� 5�ٷ� ��µǰ� �Ѵٸ� ******* ******* ******* ******* *******
		 */

		// �� �� �� ����ϴ� �ݺ����� 5�� �ݺ� ��뿡 ����
		// �ݺ������� ó����
//		for(int n= 1; n<6; n++) {
//			for (int k = 1; k <8; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// Ʈ��
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 7 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		// ���� Ʈ��
//		for (int k = 1; k <8; k++) {
//			for (int j = 0; j <k; j++) {
//			System.out.print("*");
//			}
//			System.out.println();
//		}
//}

	}

	// ������ 2�ܺ��� 9�ܱ����� ���
	public void gugudan() {
		for (int dan = 2; dan < 10; dan++) {
			for (int su = 1; su < 10; su++) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			System.out.println("========================");
		}
	}
	
	/**
	 * 1���� 5���� ������ �ϳ��� ���η� ���
	 * 12345
	 * 12345
	 * 12345
	 * 12345
	 * 12345
	 */
	public void printNumbers() {
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.print(j);
			}
			System.out.println();
		}	
	}
	/**
	 * 1���� 5���� ������ �ϳ��� ���η� ���
	 * ���� ����ϰ� �״��� ��¶� +1�����Ͽ� ���
	 * 12345
	 * 23456
	 * 34567
	 * 45678
	 * 56789
	 * 
	 */
	public void printNumbers2() {
		for (int i = 1; i < 6; i++) {
			for (int j = i; j < (i+5); j++) {
				System.out.print(j);
			}
			System.out.println();
		}	
	}
	
	public void printNumberStar() {
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				if( i == j) {System.out.print(i);
			}else {
				System.out.print("*");
			}
		}
			System.out.println();
		}
	}

/*	1
*	*2
*	**3
*	***4
*	****5
*/
	public void printNumberStar2() {
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < (i+1); j++) {
				if( i == j) {
					System.out.print(i);
			}else {
				System.out.print("*");
			}

		}
			System.out.println();
		}
	}
	
	/**������ �ϳ� �Է� �޾�, �� ���� ����ϴ븸
	 * �Էµ� ���� �ټ��� ĭ���� �����ؼ� �Ʒ��� ���� ��� ó��
	 * ���� �Ǵ� 0�� �ԷµǸ� "����� �Է��ϼ���"���
	 */
	public void printStar() {
		System.out.print("�ټ� �Է� : ");
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		if(line > 0) {
			for(int i=1; i<line; i++) {
				for(int k =1; k<line; k++) {
					if( i>k) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
			}
				System.out.println();
			}
		}else {
				System.out.print("����� �Է��ϼ���");
			}		
	}
}
