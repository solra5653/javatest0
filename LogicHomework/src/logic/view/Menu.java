package logic.view;

import java.util.Scanner;

import logic.controller.Function;

public class Menu {
	public void displayMenu(){
		
		Scanner sc = new Scanner(System.in);
		int no;
		
		Function fun = new Function();
		
		do {
			System.out.println("*** ��������/������/��� ���� ���α׷� ***\n");
			System.out.println("1. ���� ����");
			System.out.println("2. ���������� ū������ �հ豸�ϱ�");
			System.out.println("3. �Ż����� Ȯ���ϱ�");
			System.out.println("4. �л����� Ȯ���ϱ�");
			System.out.println("5. ���� ���� ����ϱ�");
			System.out.println("6. ���������� �հ� ���ϱ�");
			System.out.println("7. ������");
			System.out.println("8. �ֻ��� ���� �˾Ƹ��߱� ����");
			
			System.out.println("9. ���α׷� ����");
			
			System.out.print("�޴� ��ȣ �Է� : ");
			no = sc.nextInt();
			switch(no){
				case 1: fun.calculator(); break;
				case 2: fun.totalCalculator(); break;
				case 3: fun.profile(); break;
				case 4: fun.sungjuk(); break;
				case 5: fun.printStarNumber(); break;
				case 6: fun.sumRandomaber(); break;
				case 7: fun.continueGugudan(); break;
				case 8: fun.shutNumber(); break;
				case 9:  System.out.println("===========���α׷� ����==========");
					break;
			}
			System.out.println("--------------------------------------------------------");
		}while(true);	
	}
}
