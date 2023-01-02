package condition.sample;

import java.util.Scanner;

/**
 * if~else�� : true�϶��� false�϶��� 2���� ����ó���� �غ��ϴ� ������ if(����ǥ����){ => ���ǽ��� �ݵ�� �����
 * true|false�� ������ �ۼ� true�϶� �۵��� ������ }else{ false�϶� �۵��� ������ }
 */
public class IfElseSample {
	// ������ �ϳ� �Է¹޾�, ¦���̸� "�ۼ���" ����ϰ�
	// ¦���� �ƴϸ�(Ȧ���̸�) "Ȧ����" ���
	public void ifElseMethod1() {
		System.out.print("���� �ϳ� �Է� : ");
		int num = new Scanner(System.in).nextInt();

		// ¦���� ���� : 2�� �����
		// 2�� ���� �������� 0�� ��
//		if(num % 2 == 0) {
//			System.out.println(num + " is even.(¦����)");
//		}else {
//			//else�� ���õ� if ������ �ݴ��� ���� ����
//			System.out.println(num + " is odd.(Ȧ����)");
//		}	

		// ���౸���� 1���� ���� ��{} �����ص���(�������� ����)
		if (num % 2 == 0)
			System.out.println(num + " is even.(¦����)");
		else // else�� ���õ� if ������ �ݴ��� ���� ����
			System.out.println(num + " is odd.(Ȧ����)");
	}

	// ���������� ����, ����, ���� ������ �Է¹޾�
	// ������ ����� ����ϰ�
	// �� ������ ������ ���� 40�� �̻��̰�, ����� 60���̸�
	// "�հ�"�� ����ϰ�, �ƴϸ� "���հ�" ���
	public void ifElseMethod2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int mat = sc.nextInt();

		int tot = kor + eng + mat;
		int avg = tot / 3;

		System.out.println(
				"���� : " + kor + "��, ���� : " + eng + "��, ���� : " + mat + "��, ���� : " + tot + "��, ��� : " + avg + "��");

		if (kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60)
			System.out.println("�հ�");
		else // else�� ���õ� if ������ �ݴ��� ���� ����
			System.out.println("���հ�");
	}

	// �� ���� ������ �Է¹޾�, �� �� ��� ����϶���
	// �� ���� ��, ��, ��, �� �������� ����ؼ� ���
	// "����� �ƴ� ���� ����� �� �����ϴ�." ���
	public void ifElseMethod3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int num2 = sc.nextInt();

		if (num1 > 0 && num2 > 0) {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
		} else {
			// else�� ���õ� if ������ �ݴ��� ���� ����
			System.out.println("����� �ƴ� ���� ����� �� �����ϴ�.");
		}
	}

	// ���� �� ���� ���깮��('+', '-', '*','/', '%')�� �ϳ� �Է¹ް�
	// �� ������ �ݵ�� 1~100������ ���̾�� ��
	// �� ���� �ϳ��� ������ ��� ���̸�
	// "����� ���ڴ� �ݵ�� 1~100������ ���̾�� �մϴ�." ���
	// �� ���� ���� ���� ���̸�
	// �Էµ� ���ڰ� '+' �̸� �� ���� ���� ��� �����
	// �Էµ� ���ڰ� '-' �̸� �� ���� ���� ��� �����
	// �Էµ� ���ڰ� '*' �̸� �� ���� ���� ��� �����
	// �Էµ� ���ڰ� '/' �̸� �� ���� �������� ���� ��� �����
	// �Էµ� ���ڰ� '%' �̸� �� ���� �������� �������� ��� �����
	public void ifElseMethod4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int num2 = sc.nextInt();
		System.out.print("���깮��(+,-,*,/,%) : ");
		char op = sc.next().charAt(0);

		if ((num1 >= 1 && num1 <= 100) && (num2 >= 1 && num2 <= 100)) {
			if (op == '+') {
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			}
			if (op == '-') {
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			}
			if (op == '*') {
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			}
			if (op == '/') {
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			}
			if (op == '%') {
				System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
			}
		} else {
			System.out.println("����� ���ڴ� �ݵ�� 1~100������ ���̾�� �մϴ�.");
		}
	}

	// ������(num)�� ������(div)�� �Է¹޾Ƽ�
	// num / div �� ����� ��µǰ� ��
	// ��, ������(div)�� 0�� �ƴϾ�� ��
	// ���� ���� 0�̸�, "0���� ���� �� �����ϴ�." ��� (��ǻ�ʹ� 0�� ��������.����)
	public void ifElseMethod5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� : ");
		int num = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int div = sc.nextInt();

		if (div != 0) {
			System.out.println(num + " / " + div + " = " + (num / div));
		} else {
			System.out.println("0���� ���� �� �����ϴ�.");
		}

	}
	// ���� �ΰ��� �Է¹޾Ƽ� �������� ����� ���(��, ������)
	// �� ���� �߿��� ū ���� ����������, ���� ���� �������� �����
	// ������(������, div)�� 0�� �ƴϾ�� ��
	// 0�̸�, "0���� ���� �� �����ϴ�." ���

	public void ifElseMethod6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� : ");
		int first = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int second = sc.nextInt();

		int num, div;

		if (first > second) {
			num = first;
			div = second;
		} else {
			num = second;
			div = first;
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		if (div != 0) {
			System.out.println(num + " / " + div + " = " + (num / div));
			System.out.println(num + " % " + div + " = " + (num % div));
		} else {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
	}
}
