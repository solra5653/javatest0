package logic.controller;

import java.util.Random;
import java.util.Scanner;

public class Function {
	private Scanner sc = new Scanner(System.in);

	// ����4
	public void calculator() {
		int a1, a2, result = 0;
		char op;

		System.out.println("====����======");
		System.out.print("ù��° ���� : ");
		a1 = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		a2 = sc.nextInt();

		System.out.print("���깮��(+,-,*,/) : ");
		op = sc.next().charAt(0);

		switch (op) {
		case '+':
			result = a1 + a2;
			break;
		case '-':
			result = a1 - a2;
			break;
		case '*':
			result = a1 * a2;
			break;
		case '/':
			if (a2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�.");
				System.out.println("����� : " + (result = 0));
				return;
			} else {
				result = a1 / a2;
			}
			break;
		}
		System.out.println(a1 + " " + op + " " + a2 + " = " + result);
	}

	// ���� 5
	public void totalCalculator() {
		System.out.print("ù��° ���� : ");
		int first = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int second = sc.nextInt();

		int min;
		int max;
		if (first > second) {
			max = first;
			min = second;
		} else {
			max = second;
			min = first;
		}

		int sum = 0;
		for (int k = min; k <= max; k++) {
			sum += k;
		}
		System.out.println(min + "���� " + max + "���� �������� �հ� : " + sum);
	}

	// ����6
	public void profile() {
		String name, se, cha;
		int age;
		System.out.print("�̸��� �Է��Ͻÿ� : ");
		name = sc.next();
		System.out.print("������ �Է��Ͻÿ� : ");
		age = sc.nextInt();
		System.out.print("���� �� �Է��Ͻÿ� : ");
		se = sc.next();
		System.out.print("������ �Է��Ͻÿ� : ");
		cha = sc.next();

		System.out.println("�̸� : " + name + "\n���� : " + age + " ��" + "\n���� : " + se + "\n���� : " + cha);
	}

	// ����7
	public void sungjuk() {
		System.out.println("�л� ���� �Է��ϼ���.");
		System.out.print("�л��̸� : ");
		String a = sc.nextLine();
		System.out.print("�г� : ");
		int b = sc.nextInt();
		System.out.print("�� : ");
		int c = sc.nextInt();
		System.out.print("��ȣ : ");
		int d = sc.nextInt();
		System.out.print("����(M:���л�/F:���л�) : ");
		char e = sc.next().toUpperCase().charAt(0);
		System.out.print("����(�Ҽ��� �ι�°�ڸ�����) : ");
		double f = sc.nextDouble();

		char g = (f >= 90) ? 'A' : ((f >= 80) ? 'B' : ((f >= 70) ? 'C' : ((f >= 60) ? 'D' : 'F')));

		System.out.printf("%s�� %d�г� %d�� %d�� %s ������ %.1f�̰�, %s �����Դϴ�.", a, b, c, d, ((e == 'M') ? "���л�" : "���л�"), f, g);
	}

	// ���� 8��
	public void printStarNumber() {
		System.out.print("���� �ϳ� �Է� : ");
		int l = sc.nextInt();

		if (l > 0) {
			for (int i = 1; i < 6; i++) {
				for (int j = 1; j < (i + 1); j++) {
					if (i == j) {
						System.out.print(i);
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			System.out.println("================");

		} else {
			System.out.println("���� �Է� : " + l);
			System.out.println("����� �ƴմϴ�.");
		}
	}

	// ����9
	public void sumRandomaber() {
		System.out.println("1���� ���� ���������� �հ�");
		int num9 = (int) (Math.random() * 100) + 1;
		System.out.println("1~100 ���� ���� Ȯ�� : " + num9);

		int sum9 = 0;
		for (int i = 1; i <= num9; i++) {
			sum9 += i;
		}
		System.out.println("1���� " + num9 + " ������ ���� " + sum9 + " �Դϴ�.");
	}

	// ����10
	public void continueGugudan() {

		System.out.print("�ܼ�: ");
		int a = sc.nextInt();
		int result = 1;

		if (a >= 0) {
			System.out.print("������� ������ ���: ");
			int su = sc.nextInt();

			for (int b = 1; b <= 9; b++) {
				result = a * b;
				if (result % su != 0) {
					System.out.println(a + " * " + b + " = " + result);
				}

				else {
					continue;
				}
			}
		} else {
			System.out.println("����� �ƴմϴ�.");
		}
		System.out.println();
	}
//���� 11��
	public void shutNumber() {
		Random rd = new Random();

		do {
			System.out.print("�� �ֻ��� ���� �� : ");
			int ex = sc.nextInt();
			int num1 = rd.nextInt(6);
			int num2 = rd.nextInt(6);
			int sum = num1 + num2;
			System.out.println("ù��° �ֻ��� + �ι�° �ֻ��� = ��");
			System.out.println(num1 + " + " + num2 + "  = " + sum);

			if (sum == ex) {
				System.out.println("[������ϴ�.]");
			} else {
				System.out.println("[Ʋ�Ƚ��ϴ�.]");
			}
			char an = 0;
			System.out.print("����Ͻðڽ��ϱ�?(y/n) : ");
			an = sc.next().charAt(0);
			if ((an == 'y') || (an == 'Y')) {
				continue;
			}
			if ((an == 'n') || (an == 'N')) {
				System.out.println("==Game Over==");
				break;
			}
		} while (true);
	}
}
