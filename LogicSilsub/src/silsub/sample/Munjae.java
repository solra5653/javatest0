package silsub.sample;

import java.util.Scanner;

public class Munjae {
	public void test1(){
		System.out.println("������ �Է��Ͻÿ�.");
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int mat = sc.nextInt();
		
		int tot = kor+eng+mat;
		int avg = tot/3;
		
		
		
		if(kor>=40 && eng>= 40 && mat>=40 && avg>=60) {
			System.out.println("����: " + kor + " ����:"+eng+" ����: "+ mat
					+ " ����: "+tot+ " ���: " +avg+ " [ �հ� ]" );
			
		}else {
			System.out.println("[ ���հ� ]");
	}
	}
	public void test2(){
		System.out.println("1. �Է� ,2. ���� ,3. ��ȸ ,4. ���� ,7. ����");
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȣ�� �Է��Ͻÿ�. ");
		int a = sc.nextInt();

		if(a == 1) {
			System.out.println("�Է¸޴��� ���õǾ����ϴ�.");	
		}else if(a == 2) {
			System.out.println("�����޴��� ���õǾ����ϴ�.");	
			}else if(a == 3) {
				System.out.println("��ȸ�޴��� ���õǾ����ϴ�.");	
				}else if(a == 4) {
					System.out.println( "�����޴��� ���õǾ����ϴ�.");	
				}else if(a == 7) {
					System.out.println("���α׷��� ����˴ϴ�.");	
				}else {
					System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�.");	
					System.out.println("�ٽ� �Է��Ͻʽÿ�.");
				}
	}
	public void test3(){
		System.out.println("������ �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a > 0 ) {
			System.out.println("�����.");	
		}else {
			System.out.println("����� �ƴϴ�.");
		}
}
	public void test4(){
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int a = sc.next().charAt(0);
		if( a > 0 ) {
		if ( a%2 ==0) {
			System.out.println("¦����.");	
		}else {
			System.out.println("Ȧ����");
		}
		}
	}
	 public void inputTest(){
		 
		 String name;
		 int age;
		 double height;
		 
			Scanner sc = new Scanner(System.in);
			System.out.print("�̸��� �Է����ּ��� : ");
			name = sc.next();
			System.out.print("���̸� �Է����ּ��� : ");
			age = sc.nextInt();
			System.out.print("Ű�� �Է����ּ��� : ");
			height = sc.nextDouble();
			//null:����ִ�. �ּҾ���
			//���۷��� ����(Ŭ������ �ڷ������� ���� ����)
			//���۷��� == null : �������� ���� ����ִ���
			//Ŭ������ ���� �޼ҵ带 ����(ȣ��, call)�� ��
			//���۷���.�޼ҵ�()  --> ���۷��������� ��ü�� �ּҸ� ����
			//== �ּ�.�޼ҵ�() �� ����.
			//�ּҰ� ���� null �� ���� null.�޼ҵ�() ȣ���� �ȴٴ� �ǹ���.
			//�ּҰ� ���� �޼ҵ� ������ ������ : NullPointerException �߻�
			if ((name != null &&  name.length() > 0) && 
					age > 0 && height > 0) {
				
				System.out.println("�̸� : " + name);
				System.out.println("���� : " + age);
				System.out.println("Ű : " + height);
				System.out.println("Ȯ�� : " + name + "�� ���̴� " 
				+ age + "�� �̰�, " + "Ű�� " 
						+ height + "cm �̴�."); 
					
			} else {
				System.out.println("������ �ٽ� �Է����ּ���.");
			}
	 }
	 
	 public void test6(){
		 
		 
		 int first;
		 int second;
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		first = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		second = sc.nextInt();
		
		if (first > 0 && second > 0) {
			System.out.println(first + " + " + second + " : " + (first + second));
			System.out.println(first + " - " + second + " : " + (first - second));
			System.out.println(first + " * " + second + " : " + (first * second));
			System.out.println(first + " / " + second + " : " + (first / second));
			System.out.println(first + " % " + second + " : " + (first % second));
		} else {
			System.out.println("���ڸ� ����� �Է����ּ���.");
		}
	 }
	 
	 public void test7(){
		 
		 int num;
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ��� : ");
		num = sc.nextInt();
		
		if (num >= 0) {
			 char str = 0;
			if (num >= 90) {
				str = 'A';
			} else if (num >= 80) {
				str = 'B';		
			} else if (num >= 70) {
				str = 'C'; 	
			}  else if (num >= 60) {
				str = 'D'; 
			}  else if (num < 60) {
				str = 'F';
				
			}	else {
			}
			System.out.println("���� : " + num + "���� : " + str );
		}
	 }
}

