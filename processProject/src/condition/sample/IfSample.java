package condition.sample;

import java.util.Scanner;

/**
 * ���ǹ����� if�� ����ϴ� �׽�Ʈ�� ���� Ŭ���� ������ �����ϴ�(true�� ���) ��쿡�� �غ�� ������ ����ǰ� �� �� ����ϴ� ������
 * if(����ǥ����) { ������ ���� �� ������ ������ } ----> ���� �� ������ ������ �� ���϶��� ���� ������[������ �����ʴ°�
 * ������]
 *
 */
public class IfSample {
	// ���� �ϳ��� �Է¹޾Ƽ�, ����� ���� ������ ���� ���ó��
	// 0�̰ų� ������ ���� ó���� ���� ����
	public void ifMethod1() {
		System.out.print("���� �ϳ� �Է� : ");
		int num = new Scanner(System.in).nextInt();

		if (num > 0) {
			// ������ ����� ���̸� ������ ������ �۵���
			System.out.println(num + "�� ���� : " + (num * num));
			System.out.println(num + "�� ���� : " + (int) Math.pow(num, 2));
		}
		// return;
	}

	// ���� �ϳ��� �Է� �޾Ƽ�, ����빮�϶��� �����ڵ尡 ���
	public void ifMethod2() {
		System.out.print("���� �ϳ� �Է� : ");
		char ch = new Scanner(System.in).next().charAt(0);

		// if(ch >= 'A'&& ch<= 'Z') {
		if (Character.isUpperCase(ch)) {
			System.out.println(ch + " is uincode : " + (int) ch);
		}
	}

	// ���� ���Ǻ� ó���� if�� ����ؼ� �ۼ�
	public void ifMethod3() {
		Scanner sc = new Scanner(System.in);

		// ȸ���̸� 1, ��ȸ���̸� 2�� �Է� �޵��� ó��
		System.out.print("ȸ���̸� 1, ��ȸ���̸� 2 �Է� : ");
		int no = sc.nextInt();

		// if�� ���
		/*
		 * ȸ���̸� "�α��� �� ���̵� : " ����ϰ�, ���̵� �Է¹��� "�н����� : " ����ϰ� ��ȣ �Է¹��� ���̵�� ��ȣ ��� Ȯ��
		 */
		if (no == 1) {
			System.out.print("�α����� ���̵� : ");
			String userId = sc.next();
			System.out.print("�н����� : ");
			String passwd = sc.next();

			System.out.println("Ȯ�� : " + userId + ", " + passwd);
		}
		/*
		 * ��ȸ���̸� "ȸ������ �ϼž� �մϴ�." ����ϰ�, "�̸� : " ����ϰ�, �̸� �Է¹��� "������ ���̵� : " ����ϰ� ���̵� �Է� ����
		 * "������ �н����� : " ����ϰ� ��ȣ �Է� ���� "�̸��� : " ����ϰ�, �̸��� �Է� ���� �Է¹��� �� ��� ��� Ȯ��
		 */
		if (no == 2) {
			System.out.println("ȸ������ �ϼž� �մϴ�.");
			System.out.print("�̸� : ");
			String name = sc.next();
			System.out.print("������ �α����� ���̵� : ");
			String userId = sc.next();
			System.out.print("������ �н����� : ");
			String passwd = sc.next();
			System.out.print("�̸��� : ");
			String email = sc.next();

			System.out.println("Ȯ�� : " + name + ", " + userId + ", " + passwd + ", " + email);
		}
	}
}
