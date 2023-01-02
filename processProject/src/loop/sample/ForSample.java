package loop.sample;

import java.util.Scanner;

/**
 * Ƚ���� ������ �ݺ��� �ַ� �����
 * for(�ʱ��; ���ǽ�; ������){
 * 		�ݺ������� ������;
 * }
 * 
 * �ʱ�� : �ݺ� ī��Ʈ�� ���۰� �����
 * 				���� = ���۰�; �Ǵ� �ڷ��� ������ = ���۰�;
 * ���ǽ� : �ݺ��� ���ᰪ �����, ������ ���� ���� �ݺ��� �����
 * 				ī��Ʈ���� �񱳿����� ���ᰪ(�� : k < 11)
 * ������ : �ݺ�Ƚ���� ������
 * 				ī��Ʈ����++ �Ǵ� ++ī��Ʈ���� �Ǵ� ����--
 * 				���� += ������, ���� -= ���Ұ�
 * 
 * for ���� �帧 : 
 * �ʱ�� -> ���ǽ� -> true�̸� ��{} ���� �ݺ����೻�� ����
 * -> ������ -> ���ǽ� -> true : �ݺ�����........
 * -> ������ -> ���ǽ� -> false : �ݺ������
 *
 */
public class ForSample {
	//1���� 100���� �������� �հ踦 ���ض�
	public void sumNumbers() {
		int sum = 0;
		System.out.println("[1~100������ ������ ��]");
		for(int k = 1; k < 101; k++)
		{
		   sum += k;
		   if(k <100 ) {
			 
		   System.out.print(k+ "+");
		   }else {
			   System.out.println(k);
			   System.out.println( " = " + sum);
		   }
		}
		System.out.println("");
		System.out.println("1~100������ ������ �� : " + sum);
	}
	public void sumNumbers2() {
		int sum,k;
		//for������ �ʱ���� �� �ѹ��� �����
		//�ʱ�� ��ġ�� �������� ���� �� ������ ���� ����
		System.out.println("[1~100������ ������ ��]");
		for( k = 1 ,sum = 0; k < 101; k++)
		{
		   sum += k; //sum = sum+k;
		   if(k <100 ) {
			 
		   System.out.print(k+ "+");
		   }else {
			   System.out.println(k);
			   System.out.println( " = " + sum);
		   }
		}
		System.out.println("");
		System.out.println("1~100������ ������ �� : " + sum);
	}
	
	//1���� 100���� �������� ¦���鸸 �հ踦 ���ؼ� ���
	public void sum1To100Even() {
		int sum,k;
		//for������ �ʱ���� �� �ѹ��� �����
		//�ʱ�� ��ġ�� �������� ���� �� ������ ���� ����
		System.out.println("[1���� 100���� �������� ¦���鸸 �հ�]");
		for( k = 2 ,sum = 0; k < 101; k+=2)
		{
			
		   sum += k;//sum = sum+k;
		   if(k == 100 ) {
			
		   System.out.print(k+ "=");
		   }else {
			   System.out.print(k + "+");
		   }
		}
		System.out.println("");
		System.out.println("1���� 100���� �������� ¦������ �� : " + sum);
	}
	//���� �� ���� ���Ƿ� �Է� �޾�, �μ� �� ���������� ū������
	//�������� �հ踦 ���ؼ� ���
	//ù��° ���� : 12
	//�ι�° ���� : 7
	//7+8+9+10+11+12=�հ�
	public void sumMintoMax() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� : ");
		int first= sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int second= sc.nextInt();
		
		
		int min; 
		int max;
		   if(first > second ) {
			max = first;
			min = second;
		   }else {
			   max = second;
			min = first;
		   }
		   int sum=0;
		   for (int k = min; k<=max; k++) {
			   sum += k;
			   if(k==max) {
				   System.out.print(k+ "=");
			   }else {
				   System.out.print(k +"+");
			   }
		   }
		System.out.println(sum);
	}
	/*
	 * ���� �ϳ� �Է¹޾Ƽ�, �� ���� ������ ���
	 * ���� �Է� : 3
	 * 3*1 = 3
	 * 3*2 = 6
	 * 3*3 = 9
	 * 3*4 = 12
	 * 3*5 = 15
	 * 3*6 = 18
	 * 3*7 = 21
	 * 3*8 = 24
	 * 3*9 = 27
	 */
	public void printGugudan() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int a= sc.nextInt();
		
		for(int b = 1; b<=9; b++) {
			System.out.println(a+" * " +b +" = "+(a*b));
		}	
	}
	//1���� 100������ ���� ������ �߻���Ŵ
	//1���� ������ ���������� �հ� ���ؼ� ���
	public void sum1toRandom() {
		int value =  (int)(Math.random()*(100))+1;
		int sum=0;
		System.out.println("[1~100�������� 1~���� ������ ��]");
		System.out.println("���� ���� : " + value);
		for( int k = 1; k<=value ; k++)
		{
		   sum += k; //sum = sum+k;
		   if(k == value ) {
			 
		   System.out.print(k+ "=");
		   }else {
			   System.out.print(k + "+");
		   }
		}
		System.out.println(sum);
	}	
}
