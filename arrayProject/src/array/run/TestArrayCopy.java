package array.run;

public class TestArrayCopy {

	public static void main(String[] args) {
		// �迭 ���� ����
		//1. for �� ��� ���� ���� ó��
		//2. java.lang.System.arraycopy() �޼ҵ� ���
		int[] arr = {11,22,33,44,55};
		int[] brr = new int[10];
		
		//arr �� ������ ��� �� brr�� 5�� ���ؽ� ��ġ�� ����
		for(int i =0; i<arr.length; i++) {
			brr[i +5] = arr[i];
			
		}
		
		//brr�� 0�� ��ġ���� arr�� ��� �� ����
		System.arraycopy(arr, 0, brr, 0, arr.length);
		
		for(int i =0; i<brr.length; i++) {
			System.out.print(brr[i]+"  ");	
		}
		System.out.println();
	}

}
