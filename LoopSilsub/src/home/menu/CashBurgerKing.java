package home.menu;

import java.util.Scanner;

public class CashBurgerKing {

	public void selectMenu() {
		Scanner sc = new Scanner(System.in);
		int no;
		int price = 0;
		String a = null;
		String list = "";
		int sum = 0;
		
		do {
			System.out.println("*** �޴��� �����ϼ��� ***\n");
			System.out.println("�ܹ��� ***************");
			System.out.println("1. �Ұ�����	3500��");
			System.out.println("2. ġŲ����		3200��");
			System.out.println("�߰� ****************");
			System.out.println("3. ����Ƣ��		1000��");
			System.out.println("5. ������			2000��");
			System.out.println("����� ***************");
			System.out.println("7. ���̵�			1200��");
			System.out.println("8. Ŀ��			1000��");
			System.out.println("********************");

			System.out.print("��ȣ ���� : ");
			no = sc.nextInt();
				switch (no) {
				case 1:
					System.out.println("�Ұ����Ÿ� �����ϼ̽��ϴ�. ");
					a="�Ұ�����";
					price = 3500;
					break;
				case 2:
					System.out.println("ġŲ���Ÿ� �����ϼ̽��ϴ�. ");
					a="ġŲ����";
					price = 3200;
					break;
				case 3:
					System.out.println("����Ƣ�踦 �����ϼ̽��ϴ�. ");
					a="����Ƣ��";
					break;
				case 4:
					System.out.println("ġ�ƽ�� �����ϼ̽��ϴ�. ");
					a="ġ�ƽ";
					price = 400;
					break;
				case 5:
					System.out.println("�����带 �����ϼ̽��ϴ�. ");
					a="������";
					price = 2000;
					break;
				case 6:
					System.out.println("�ݶ� �����ϼ̽��ϴ�. ");
					a="�ݶ�";
					price = 700;
					break;
				case 7:
					System.out.println("���̵带 �����ϼ̽��ϴ�. ");
					a="���̵�";
					price = 1200;
					break;
				case 8:
					System.out.println("Ŀ�Ǹ� �����ϼ̽��ϴ�. ");
					a="Ŀ��";
					price = 1000;
					break;
				}
				System.out.print("���� : ");
				int su = sc.nextInt();
				list += a+" : " +su + "��"+ " - "+(price*su)+ "��" + "\n";
				sum +=(price*su);
					System.out.println("�߰� �ֹ��Ͻðڽ��ϱ�?(y/n) : ");
			         char answer = sc.next().toUpperCase().charAt(0);
			         if(answer == 'Y') {
			        	 continue;
			         } else {
			        	System.out.println("* �ֹ��Ͻ� ������ ������ �����ϴ�. *");
					 	System.out.println("-----------------------------------------------");
					 	System.out.print(list);
					 	System.out.println("-----------------------------------------------");
					 	System.out.println("�� ���� : " + sum);
			        	 break;
			         }		       
			} while (true);		
		}
	}
