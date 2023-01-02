package primitive.array;

import java.util.Random;
import java.util.Scanner;

public class ArraySample {
	public void test1() {
		int[] arr = new int[10];
		
		int sum = 0;

		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100) + 1;
			sum += arr[i];
			System.out.println("arr" + "[" + i + "]: "+ arr[i]);
		}
		System.out.println("10���� �������� ��: " + sum);
	}
	public void test2() {
		int[] arr = new int[10];
		
		int max = 0;
		int min = 0;
		for(int i = 0; i<arr.length;i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
			if(i==0) {				// ù��° ���������� ���� ���ϰ� �ϱ� ��
				max = min = arr[0];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Max: " + max);
		System.out.println("Min: ");
	}
	public void test3() {
		byte arr[] = new byte[10];
		// byte �ڷ��� �� ����: -128 ~ 127
		int sum = 0;
		Random random = new Random();
		new Random().nextBytes(arr);
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				sum += i;
			}
			System.out.println("arr" + "[" + i + "]: "+ arr[i]);
		}
		System.out.println("sum: " + sum);
	}
	
	public void test4(){
		Scanner sc= new Scanner(System.in);
		System.out.print("���ڿ� �Է�: ");
		String num = sc.next();
		String[] tot = new String[num.length()];
		int sum = 0;
		for(int i = 0; i<num.length(); i++) {
			tot[i]= num.substring(i, i+1);
			sum +=Integer.parseInt((tot[i]));
		}
		System.out.println("�� : " + sum);
	}
	public void test5(){
		Scanner sc= new Scanner(System.in);
		System.out.print("���ڿ� �Է�: ");
		String num = sc.next();
		char[] tot = new char[num.length()];
		int sum = 0;
		for(int i = 0; i<num.length(); i++) {
		tot[i]= num.charAt(i);
			sum += tot[i]-'0';
		}
		System.out.println("�� : " + sum);
	}
}




























