package practice.array;

import java.util.Random;
import java.util.Scanner;

public class Sample {
	private Random random = new Random();
	private Scanner sc = new Scanner(System.in);

	// ����1
//	public void munjae1() {
//		int[][] mat = new int[4][4];
////		for (int i = 0; i < 4; i++) {
////			for (int j = 0; j < 4; j++) {
////				mat[i][j] = (int) (Math.random() * 100 + 1);
////			}
////		}
//		for(int i=0; i<mat.length-1; i++)
//		{
//			System.out.printf("%�� : ", i+1);
//			for(int j=0; j<mat[i].length-1; j++)
//			{
//				mat[i][3] += mat[i][j]; //���� �հ�
//				mat[3][i] += mat[j][i]; //���� �հ�
//			}
//			 mat[3][3] +=  mat[i][3] + mat[3][i];
//		}
//		}
//}

//public void munjae2() {
//	int[][] tar = new int[3][];
//	int[] sums = new int [3];
//}
	
//	public void munjae3() {
//		//1. 7�� 7�� ���� �� ����
//		int[][] a = new int[7][7];
//		int i, j;
//		
//		//7���� ��ȣ, ����, ����, ����
//		
//		for( i=0; i<a.length; i++)
//		{
//			System.out.println("��ȣ : ");
//			a[i][0] = sc.nextInt();
//			System.out.println("���� : ");
//			a[i][1] = sc.nextInt();
//			System.out.println("���� : ");
//			a[i][2] = sc.nextInt();
//			System.out.println("���� : ");
//			a[i][3] = sc.nextInt();
//		}
//		for( i=0; i<a.length-1; i++)
//		{
//			System.out.printf("%d��° �л��� ���� : ", i+1);
//			
//			for( j=0; j<a[i].length-1; j++)
//			{
//				a[i][j] = sc.nextInt();
//				a[i][a[a.length-1].length-1] += a[i][j];
//				a[a.length-1][j] += a[i][j];
//				a[a.length-1][a[a.length-1].length-1] += a[i][j];
//			}		
//	}
//	}
	

	
}