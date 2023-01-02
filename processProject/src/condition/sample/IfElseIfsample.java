package condition.sample;

import java.util.Scanner;

/**
 * ���� if�� �׽�Ʈ ���� Ŭ���� else ������ if(���ǽ�)�� ����ϴ� ������ ���õ� ������ false �϶� �� �ٸ� ������ �����ϴ�
 * ������ if(���ǽ�1){ ���ǽ�1�� true�� �� ������ ���� }else if(���ǽ�2){ ���� 1�� false�̰� ����2�� true�� ��
 * ������ ���� }........ }else{ ���� ���õ� ��� ������ false�� �� ������ ���� }
 */
public class IfElseIfsample {
	// 3���� ������ �Է� �޾Ƽ�, �� �� �� ���� ū���� �˾Ƴ��� ���
	public void testThreeMax() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� : ");
		int first = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int second = sc.nextInt();
		System.out.print("�¹�° ���� : ");
		int third = sc.nextInt();

		int max; // ���� ū �� �����
		if (first > second && first > third) {
			max = first;
		} else if (second > first && second > third) {
			// else == (second >= first || third >= first)
			max = second;
		} else {
			max = third;
		}
		System.out.println("�� ������ ���� ���� ū ���� : " + max);
	}

	// ������ ������ �Է� �޾�,
	// ��, ������ �ݵ�� 0�̻��̿��� ��
	// ������ 90�� �̻��̸� ����� 'A' ����
	// ������ 80�̻� 90�� �̸��̸� ����� 'B' ����
	// ������ 70�̻� 80�� �̸��̸� ����� 'C' ����
	// ������ 60�̻� 70�� �̸��̸� ����� 'D' ����
	// ������ 60�� �̸��̸� ����� 'F' ����
	// ������ ��� ���
	// ������ 0�� �̸��� "�߸� �Է��ϼ̽��ϴ�." ���
	public void testScoreGrade() {
		System.out.println("������ �Է��Ͻÿ�.");
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int a = sc.nextInt();

		if (a >= 90) {
			System.out.println("A����Դϴ�.");
		} else if (a >= 80) {
			System.out.println("B����Դϴ�.");
		} else if (a >= 70) {
			System.out.println("C����Դϴ�.");
		} else if (a >= 60) {
			System.out.println("D����Դϴ�.");
		} else if (a < 60 && a >= 0) {
			System.out.println("F����Դϴ�.");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}

	// ������ �����ڵ带 ���� �ϳ� �Է¹޾�
	// ������ �ݵ�� 0 ~ 65535 ������ ���̾�� ��
	// ������ ��� ���̸�, "0 ~ 65535" ������ ���� �Է��ϼ���." ���
	// ������ �������� �����̸�
	// ���� �빮���̸� "Upper"����ϰ�
	// ���� �ҹ����̸� "Lower"����ϰ�
	// ���ڹ����̸� "Numeric" ����ϰ�
	// ��~�� �����̸� "�ѱ�" ����ϰ�
	// �� ���� ���̸� "Other" ���
	public void testCharacter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ڵ�(����)�� �Է��Ͻÿ�");

		int i = sc.nextInt();

		if (i >= 0 && i <= 65535) {
			if (i >= 'A' && i <= 'Z') {
				System.out.println("Upper");
			} else if (i >= 'a' && i <= 'z') {
				System.out.println("Lower");
			} else if (i >= 0 && i < 9) {
				System.out.println("Numeric");
			} else if (i >= '��' && i <= '�R') {
				System.out.println("�ѱ�");
			} else {
				System.out.println("Other");
			}
		} else {
			System.out.println("0 ~ 65535 ������ ���� �Է��ϼ���.");
		}
	}

	public void testCharacter2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ڵ�(����) �Է��Ͻÿ�");

		int i = sc.nextInt();

		if (i >= 0 && i <= 65535) {
			if (Character.isUpperCase(i)) {
				System.out.println("Upper");
			} else if (Character.isLowerCase(i)) {
				System.out.println("Lower");
			} else if (i >= 0 && i < 9) {
				System.out.println("Numeric");
			} else if (Character.isLetter(i)) {
				System.out.println("�ѱ�");
			} else {
				System.out.println("Other");
			}
		} else {
			System.out.println("0 ~ 65535 ������ ���� �Է��ϼ���.");
		}
	}

	// ���� �Է��� �����Է����� ����
	public void testCharacter3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ϳ� �Է��Ͻÿ�");
		char i = sc.next().charAt(0);

		if (i >= 0 && i <= 65535) {
			if (Character.isUpperCase(i)) {
				System.out.println("Upper");
			} else if (Character.isLowerCase(i)) {
				System.out.println("Lower");
			} else if (Character.isDigit(i)) {
				System.out.println("Numeric");
			} else if (this.isKorean(i)) {
				System.out.println("�ѱ�");
			} else {
				System.out.println("Other");
			}
		} else {
			System.out.println("0 ~ 65535 ������ ���� �Է��ϼ���.");
		}
	}
	//�ѱ����� Ȯ���ϴ� �޼ҵ�
	public boolean isKorean(char ch) {
//		boolean result = false;
//		result = (ch >= '��' && ch <= '�R');
		
//		boolean result = (ch >= '��' && ch <= '�R');

//		return result;
		
		return (ch >= '��' && ch <= '�R');
	}
}
