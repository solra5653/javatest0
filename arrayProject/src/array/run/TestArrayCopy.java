package array.run;

public class TestArrayCopy {

	public static void main(String[] args) {
		// 배열 간의 복사
		//1. for 문 사용 직접 복사 처리
		//2. java.lang.System.arraycopy() 메소드 사용
		int[] arr = {11,22,33,44,55};
		int[] brr = new int[10];
		
		//arr 의 값들을 모두 다 brr의 5번 인텍스 위치에 복사
		for(int i =0; i<arr.length; i++) {
			brr[i +5] = arr[i];
			
		}
		
		//brr의 0번 위치부터 arr의 모든 값 복사
		System.arraycopy(arr, 0, brr, 0, arr.length);
		
		for(int i =0; i<brr.length; i++) {
			System.out.print(brr[i]+"  ");	
		}
		System.out.println();
	}

}
