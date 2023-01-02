package condition.sample;

import java.util.Scanner;

/**
 * switch �� (���ù�) : if ������ ���� ������
 * switch(true, false �� ����� ������ ���ǽ� ������) = ��������
 * ���� ����? ��� ǥ���� => ���� == �� �� ����
 * switch(���� �Ǵ� ����){
 * case ���ð�1: ���ð��� ������ ������ ������;
 * 						break; => �ݵ�� �����(switch �� ����)
 * case ���ð�2: ���౸��; break;
 * case ���ð�3: ���౸��; break;
 * ..........
 * defalut: ���౸��; =>���� ���õ� ���� ��� �ƴ� �� ����
 * 				�����Ҽ� ����
 * 
 *} => switch ���� ��{} ���� ����. ������ �־����
 *
 */
public class SwitchSample {
	
	//���������� ��ȣ�� �Է¹޾�, ��ȣ�� ���� �λ縻�� ���õǾ� ���
	public void greetings() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ȣ ����(1, 2, 3) : ");
		int no = sc.nextInt();
		
		String message = null;
		switch(no) {
		case 1: message = "�ȳ��ϼ���."; break;//no ==1
		case 2: message = "ȯ���մϴ�."; break;
		case 3: message = "�������."; break;
		default: message = "�ȳ��� ������."; //else ���� �ǹ�
		}
		System.out.println(no + " : " + message);
	}
	public void greetings2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ȣ ����(1, 2, 3) : ");
		int no = sc.nextInt();
		
		String message = null;
//		switch(no) {
//		case 1: message = "�ȳ��ϼ���."; break;//no ==1
//		case 2: message = "ȯ���մϴ�."; break;
//		case 3: message = "�������."; break;
//		default: message = "�ȳ��� ������."; //else ���� �ǹ�
//		}
		
		if(no == 1) {
			System.out.println(message = "�ȳ��ϼ���.");
		}else if(no == 2) {
			System.out.println(message = "ȯ���մϴ�.");
		}else if(no == 2) {
			System.out.println(message = "�������.");
		}else {
			System.out.println(message = "�ȳ��� ������.");
		}
		System.out.println(no + " : " + message);
	}
	
	//���� �ΰ��� ���깮��(+,-,*,/,%)�� �Է� �޾�
	//���깮�ڿ� ���� �� ������ ��������� ����ؼ� ���
	//�Է� ��:
	//ù��° ���� : 25
	//�ι�° ���� : 7
	//���깮��(+,-,*,/,%) : +
	//��� �� : 
	//25 + 7 = 32
	public void calculator() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
		int no1 = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int no2 = sc.nextInt();
		System.out.print("���깮��(+,-,*,/,%) : ");
		char no3 = sc.next().charAt(0);
		
		int result = 0;
		switch(no3) {
					case '+' : result = no1 + no2; break;
					case '-' : result = no1 - no2; break;
					case '*' : result = no1 * no2; break;
					case '/' : result = no1 / no2; break;
					case '%' : result = no1 % no2; break;
					default: 
					System.out.println("���깮�ڰ� �߸� �ԷµǾ����ϴ�.");
					System.out.println("Ȯ���ϰ� �ٽ� �����ϼ���.");
					return;
		}
		
		System.out.println(no1 + " " + no3 +" "+ no2 +" = "+ (result));
		return;
	
	}
	//���ϸ�(String)�� ����(int)�� �Է¹޾�, ���� ������ ��� ���
	//������ �ܰ�(����) ���� : int price = 0;
	//��� : 1200, �� : 2500, ���� : 5000
	//������ : 700, Ű�� : 500
	//�� ���� ������ "��ǰ�� ǰ���Ǿ����ϴ�." ��� ó��
	//��� ���� :
	//��� : 1200�� * 3�� => ���� : 3600��
	public void fruitSale() {
		
		//jdk 7���� case �� ���ڿ� �� ����� �� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է��ϼ���. ");
		String name = sc.nextLine();
		System.out.print("������ �Է��ϼ���. ");
		int b = sc.nextInt();
		
		int price = 0;
		
		switch(name) {
		case  "���" : price = 1200; break;
		case "��" : price = 2500; break;
		case "����" : price = 5000; break;
		case "������" : price = 700; break;
		case "Ű��" : price = 500; break;
		default: 
			System.out.println("��ǰ�� ���ų� ǰ���Ǿ����ϴ�.");
		}
		
		System.out.println(name+" : " + b + "�� * "
		+ price +"�� => " + (b*price) +"��" );
	} 
public void fruitSale2() {
		
		//jdk 7���� case �� ���ڿ� �� ����� �� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է��ϼ���. ");
		String name = sc.nextLine();
		System.out.print("������ �Է��ϼ���. ");
		int b = sc.nextInt();
		
		int price = 0;
		
//		switch(name) {
//		case  "���" : price = 1200; break;
//		case "��" : price = 2500; break;
//		case "����" : price = 5000; break;
//		case "������" : price = 700; break;
//		case "Ű��" : price = 500; break;
//		default: 
//			System.out.println("��ǰ�� ���ų� ǰ���Ǿ����ϴ�.");
//		}
		//switch ���� if ������ �ٲٱ�
		if(name.equals("���")) {
			price = 1200;
			
		}else if(name.equals("��"))
		{
			price = 2500;
		}else if(name.equals("����"))
		{
			price = 5000;
		}else if(name.equals("������"))
		{
			price = 700;
		}else if(name.equals("Ű��"))
		{
			price = 500;
		}else
		{
			System.out.println("��ǰ�� ���ų� ǰ���Ǿ����ϴ�.");
			return;
		}
		System.out.println(name+" : " + b + "�� * "
		+ price +"�� => " + (b*price) +"��" );
	} 
}
