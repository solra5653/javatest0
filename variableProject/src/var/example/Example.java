package var.example;

import java.util.Scanner;

public class Example {
	public void example1() {
		//����1
		Scanner exa = new Scanner(System.in);
		System.out.print("ù��° ���� : ");
		int first = exa.nextInt();
		System.out.print("�ι�° ���� : ");
		int second =  exa.nextInt();
		
		System.out.println("���ϱ� ��� : " +(first+second));
		System.out.println("���� ��� : " +(first-second));
		System.out.println("���ϱ� ��� : " +(first*second));
		System.out.println("�������� �� : " +(first/second));
		System.out.println("�������� ������ ��� : " +(first%second));
		}
	public void example2() {
		//����2
		Scanner exa = new Scanner(System.in);
		//�޼ҵ�� ����ϸ� �ڵ� �Ҹ��̹Ƿ� Ŭ���� �߰��� �Ϸ��� �޼ҵ带 ���� �Է�
		System.out.print("���� : ");
		double w = exa.nextDouble();
		System.out.print("���� : ");
		double h = exa.nextDouble();
		
		double area = w*h;
		double perimeter = (w+h)*2;
		
		System.out.println("���� : " +area);
		System.out.println("�ѷ� : " + perimeter);
		}
	public void example3() {
		//����3
		
		//.substring(0,0) ���
		/*
		 * Scanner exa = new Scanner(System.in);
		 * System.out.print("���ڿ��� �Է��Ͻÿ� : ");
		 * String l = exa.nextLine();
		 * 
		 * System.out.println("ù��° ���� : " + l.substring(0,1));
		 * System.out.println("�ι�° ���� : " + l.substring(1,2));
		 * System.out.println("����° ���� : " + l.substring(2,3));
		 * System.out.println("�׹�° ���� : " + l.substring(3,4));
		 * System.out.println("�ٹ�° ���� : " + l.substring(4,5));
		 */
		
		//.charAt(0) ���
		System.out.print("���ڿ��� �Է��Ͻÿ� : ");
		String exa = new Scanner(System.in).next();
		//�Է��� �ѹ��� ����Ҷ��� ������ ���
		
		System.out.println("ù��° ���� : " + exa.charAt(0));
		System.out.println("�ι�° ���� : " + exa.charAt(1));
		System.out.println("�¹�° ���� : " + exa.charAt(2));
		
		}

}
