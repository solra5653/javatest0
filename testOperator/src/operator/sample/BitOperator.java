package operator.sample;

//��Ʈ������ �׽�Ʈ�� Ŭ����
// ��Ʈ������ : �޸� ��ϵ� ��Ʈ��(2����, bit 0 | bit 1)��
//						��꿡 ����ϴ� ��������
//2���� ���� : ~(tield, ��Ʈ����������)
//5���� ���� : <<, >>, >>> (shift, ��Ʈ�ڸ��̵�������)
//��Ʈ�������� : &(and, 8����), ^(xor, 9����), |(or, 10����)
public class BitOperator {
	// �޸��� ��ϵ� �ڸ��� ��Ʈ�� ����ϴ� �޼ҵ�
	// ��Ʈ 1�� ���� 1��, ��Ʈ 0�� ���� 0���� ���
	public void printBit(int num) {
		System.out.print(num + " : ");

		for (int pos = 31; pos >= 0; pos--) {
			System.out.print(num >> pos & 1);
		}
		System.out.println();
	}

	public void testBit() {
		int a = 12, b = 20;

		// this.printBit() >>this.�� ���� (���� Ŭ���� ������� this ��)
		printBit(a);
		printBit(b);
		System.out.println("------------------------------------------------------");

		System.out.println("a ������ ��Ʈ Ȯ��");
		this.printBit(a);
		System.out.println("~a �� ��Ʈ Ȯ��");
		this.printBit(~a); // 12�� 1�� ���� ���
		// ~(Tield : ��Ʈ ����) : bit--> bit0, bit0 -->bit1�� �ٲ�
		System.out.println("------------------------------------------------------");

		// ����� 0�� ������ ���Ѵٸ�
		this.printBit(~a + 1);
		// this. �� ���ο� static�� �־ ����
		System.out.println("------------------------------------------------------");

		// shift ������ : ��Ʈ �ڸ��̵� ������
		// ���� >> �ڸ��̵��� : ���� ���ڸ��� ��ȣ��Ʈ�� ä��
		//								2�� ������(�ڸ��̵���)�� ���� ������ ����
		// ���� >>> �ڸ��̵��� : ���� ���ڸ��� ������ 0 ä��
		// ���� << �ڸ��̵��� : ������ ���ڸ��� ������ 0 ä��
		//								2�� ������(�ڸ��̵���)�� ���� ���ϱ� ����
		printBit(b);
		printBit(b << 3);
		System.out.println("------------------------------------------------------");
		
		printBit(-10);
		printBit(-10 >> 2);
		printBit(-10 >>> 2);
		System.out.println("------------------------------------------------------");
		
		printBit(a);
		printBit(b);
		System.out.println();
		System.out.println("a & b");
		printBit(a & b);
		System.out.println("a ^b");
		printBit(a ^ b);
		System.out.println("a | b");
		printBit(a | b);
		System.out.println("------------------------------------------------------");
	}

}
