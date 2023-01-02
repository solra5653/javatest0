package loop.sample;

import java.util.Scanner;

import condition.sample.SwitchSample;

/**
 * do ~while ��
 * : ������ �ѹ� �����Ű�� ���� �ݺ��� �����ϴ� ������
 * do{
 * 		�ݺ� ������ ������;
 * }while(�ݺ��� ���� ���ǽ�);
 * => ������ ���κп� �����ݷ�(;) �������ؾߵ� ���ϸ� ����
 *
 */
public class DoWhileSample {
	
	//���� �Է¹޾Ƽ� �����ڵ� ����� �ݺ� ó��
	public void printUnicode() {
		Scanner sc = new Scanner(System.in);
		char ch;
		
		do {
			System.out.print("�����Է� : ");
			ch = sc.next().charAt(0);
			// ���ᰪ�� '0'�� �ԷµǸ�, �����ڵ� ����ϰ� �����
			System.out.println(ch + " is unicode " + (int)ch);
		}while(ch != '0');
		System.out.println("=====The End======");
	}
	
	public void printUnicode2() {
		Scanner sc = new Scanner(System.in);
		char ch;
		
		do {
			System.out.print("�����Է� : ");
			ch = sc.next().charAt(0);
			
			if(ch == '0') break;
			// ���ᰪ�� '0'�� �ԷµǸ�, �����ڵ� ����ϰ� �����
			System.out.println(ch + " is unicode " + (int)ch);
		}while(true);
		System.out.println("=====The End======");
	}
	
	public void displayMenu() {
		Scanner sc = new Scanner(System.in);
		int no;
		//ForSample �� ���� ��Ű���� () �Ⱦ�
		ForSample fsamp = new ForSample();
		WhileSample wsamp = new WhileSample();
		SwitchSample sswitch = new SwitchSample();
		
		do {
			System.out.println("*** ��� ���� ���α׷� ***\n");
			System.out.println("1. ������ ���");
			System.out.println("2. ���� ����");
			System.out.println("3. ���ڿ� ���� ã��");
			System.out.println("4. �λ縻 ����");
			System.out.println("9. ������");
			
			System.out.print("��ȣ ���� : ");
			no = sc.nextInt();
//			if(no ==1) break;
			switch(no){
				case 1: fsamp.printGugudan(); break;
				case 2: sswitch.fruitSale(); break;
				case 3: wsamp.containChar(); break;
				case 4: sswitch.greetings(); break;
				case 9: System.out.println("������ �����ðٽ��ϱ�?(y/n) : ");
				         char answer = sc.next().toUpperCase().charAt(0);
//				         if(answer == 'y' || answer =='Y') {
				         if(answer == 'Y') {
//				        	 System.exit(0);   //���α׷� ���� ������
				        	 return;  //���� ��ġ�� ���ư�
				         } else {
				        	 break;
				         }
				default: System.out.println("�߸� �Է��ϼ̽��ϴ�. ");
				System.out.println("�ٽ� �Է��ϼ���. ");
				
			}
		}while(true);
	}
}
