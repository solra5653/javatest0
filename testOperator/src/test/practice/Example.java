package test.practice;

import java.util.Scanner;

public class Example {
	public void sample1() {
		System.out.println("���� ������ �Է��Ͻÿ�.");
		Scanner sam1 = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int kor = sam1.nextInt();
		System.out.print("���� ���� : ");
		int eng = sam1.nextInt();
		System.out.print("���� ���� : ");
		int mat = sam1.nextInt();

		int tot = (kor + eng + mat);
		double avg = tot / 3.0;

		String result = (kor >= 40 && eng >= 40&& mat>=40 && avg >=60)?
				"�հ�" : "���հ�";
		
		System.out.println(kor + "��, " +eng+ "��, "+mat+ "��, "
									+ tot + "��, " +avg+ "��, "+ result);
		
//		if�� ����
//		if (kor >= 40 && eng >= 40&& mat>=40 && avg >=60) {	
//			System.out.println("�հ�");
//		}
//		else {
//			System.out.println("���հ�");
//	}

	}
//���� 2
	public void sample2() {
		
		System.out.println("�л� ���� �Է��ϼ���.");
		Scanner sam2 = new Scanner(System.in);
		System.out.print("�л��̸� : ");
		String a = sam2.nextLine();
		System.out.print("�г� : ");
		int b = sam2.nextInt();
		System.out.print("�� : ");
		int c = sam2.nextInt();
		System.out.print("��ȣ : ");
		int d = sam2.nextInt();
		System.out.print("����(M:���л�/F:���л�) : ");
		char e = sam2.next().toUpperCase().charAt(0);
		System.out.print("����(�Ҽ��� �ι�°�ڸ�����) : ");
		double f = sam2.nextDouble();
		
		System.out.println(" �̸� " + a +"/"+b+"�г� " +c+"�� "+ d +"�� "+ 
		((e=='M')? "���л�" : "���л�")+f + " ���̴�");
		//
		System.out.printf("%s�� %d�г� %d�� %d�� %s ������ %.2f�̴�", 
				a,b,c,d,((e=='M')? "���л�" : "���л�"),f);
	}
	public void sample3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		System.out.println((num>0)? "���": "����� �ƴ�");
		
	
	}
	
	public void sample4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		String a = ((num%2==0)? "¦��": "Ȧ��");
		System.out.println(a);
		
	
	}
	public void sample5() {
		System.out.println("���� ������ �Է��Ͻÿ�.");
		Scanner sam1 = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int kor = sam1.nextInt();
		System.out.print("���� ���� : ");
		int eng = sam1.nextInt();
		System.out.print("���� ���� : ");
		int mat = sam1.nextInt();

		int tot = (kor + eng + mat);
		double avg = tot / 3.0;
		
		System.out.println("���� : "+kor + "��, ���� : " +eng+ 
									"��, ���� : "+mat+ "��, ���� : "
									+ tot + "��, ��� : " +avg+ "��");
		
		System.out.println("���� ���");

//		char a = (avg >=90)? 'A'
//					: ((avg < 90 && avg >=80)? 'B' 
//					: ((avg < 80 && avg >=70)? 'C'
//					: ((avg < 70 && avg >=60)? 'D'
//					: 'F')));
		
		//�̻��� �ݴ�� �̸���
		//��, 90�̻��� �ݴ�� 90�̸���
		char a = (avg >=90)? 'A'
				: ((avg >=80)? 'B' 
				: ((avg >=70)? 'C'
				: ((avg >=60)? 'D' : 'F')));
		
		System.out.println("���������� " + a+ "��� ���� �Դϴ�.");
	
	}

}


