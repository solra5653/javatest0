package array.Sample;

import java.util.Random;
import java.util.Scanner;

/**		2���� �迭 �׽�Ʈ�� Ŭ����
 * 		1���� �迭 : �ڷ����� ���� �������� ����,
 * 				�迭 ����� �Ҵ�ÿ� �迭��ȣ[] 1��
 * 				����(index)
 * 				ex) int a, b, c, d, e; => int[] ar = new int[5];
 * 
 * 		2���� �迭 : �ڷ����� ���� 1���� �迭�� ����
 * 				�迭����� �Ҵ�ÿ� �迭��ȣ[][] 2�� 
 * 				��(��|��)�� ��(ȣ|ĭ)
 * 				ex) int[] ar = new int[5];
 * 					 int[] br = new int[5];
 *  				 int[] cr = new int[5];
 *  				 => int[][] tar = new int[3][5]; 3�� 5���� ����
 *  			�ڹٴ� 1���� �迭�� �����Ҵ���
 *  			2�����迭�� �� 1���� �迭�� �ּҵ��� �迭�� ������
 *  			�ڹ��� 2�����迭 == �ּ�(���۷���)�迭��
 * 		3���� �迭 : �ڷ����� ���� 2���� �迭�� ����
 * 				�迭����� �Ҵ�ÿ� �迭��ȣ[][][] 3��
 * 				��(��|������)/��(��|��)/��(ȣ|ĭ)
 * 
 */
public class TwoArraySample {
	//Field
	//���������� �ڷ��� ������ [= �ʱⰪ];
	private Scanner sc =new Scanner(System.in);
	private Random random = new Random();
	
	//Method
	//���������� ��ȯ�ڷ��� �޼ҵ��([�ڷ��� �Ű�����]){ �ҽ��ۼ� }
	//[]�� ���� ������
	public void testMethod() {
		//1. 2�����迭 ����
		//2���� �迭�� ���� ���۷���(�ּҺ���) �����
		//�ڷ���[][] �迭���۷���;
		//�ڷ��� []�迭���۷���[];
		//�ڷ� �迭���۷���[][];
		int[][] tar; //���������� �����޸� stack �� �Ҵ��
		
		//2. �迭 ����
		//�� �޸𸮿� �迭���� �����
		//���� �迭 ����� : �� 1���� �迭���� �氹��(��)�� ������ ���
		tar =new int[3][5];
		
		System.out.println("�Ҵ�� �� ���� : " + tar.length);
		System.out.println("�� 1�����迭�� �氹�� : ");
		for(int i= 0; i<tar.length; i++) {
			System.out.println(i + "��° : " + tar[i].length);
		}
		
		//2�����迭�� ��� : 2�� for���� �����
		//for(��ݺ�){ for(�� �ະ ���� ���� �ݺ�){ �迭���۷���[��][��] }}
		for(int i = 0; i<tar.length; i++) {
			for(int j = 0; j<tar[i].length; j++) {
				System.out.print(tar[i][j]+ "     ");
			}
			System.out.println();
		}

		//1~100������ ������ ��� ó��
		for(int i = 0; i<tar.length; i++) {
			for(int j = 0; j<tar[i].length; j++) {
				tar[i][j] = random.nextInt(100)+1;
				System.out.print(tar[i][j]+ "     ");
			}
			System.out.println();
		}
			
			//���Ȯ��
			for(int i = 0; i<tar.length; i++) {
				for(int j = 0; j<tar[i].length; j++) {
					System.out.print(tar[i][j]+ "     ");
				}
				System.out.println();
			}
		}
		
	}
